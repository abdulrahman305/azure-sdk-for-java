// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.instrumentation.logging;

import io.clientcore.core.implementation.AccessibleByteArrayOutputStream;
import io.clientcore.core.implementation.instrumentation.DefaultLogger;
import io.clientcore.core.instrumentation.InstrumentationContext;
import io.clientcore.core.models.CoreException;
import io.clientcore.core.serialization.json.JsonReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static io.clientcore.core.instrumentation.logging.InstrumentationTestUtils.createInvalidInstrumentationContext;
import static io.clientcore.core.instrumentation.logging.InstrumentationTestUtils.createRandomInstrumentationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link ClientLogger}.
 */
public class ClientLoggerTests {
    private final AccessibleByteArrayOutputStream logCaptureStream;
    private final Map<String, Object> globalContext;

    public ClientLoggerTests() {
        this.logCaptureStream = new AccessibleByteArrayOutputStream();
        this.globalContext = new LinkedHashMap<>();
        this.globalContext.put("connectionId", "foo");
        this.globalContext.put("linkName", 1);
        this.globalContext.put("anotherKey", new LoggableObject("hello world"));
    }

    /**
     * Test whether the logger supports a given log level based on its configured log level.
     */
    @ParameterizedTest
    @MethodSource("singleLevelCheckSupplier")
    public void canLogAtLevel(LogLevel logLevelToConfigure, LogLevel logLevelToValidate, boolean expected) {
        ClientLogger clientLogger = setupLogLevelAndGetLogger(logLevelToConfigure);
        assertEquals(expected, clientLogger.canLogAtLevel(logLevelToValidate));
    }

    /**
     * Test whether a log will be captured when the ClientLogger and message are configured to the passed log levels.
     */
    @ParameterizedTest
    @MethodSource("singleLevelCheckSupplier")
    public void logSimpleMessage(LogLevel logLevelToConfigure, LogLevel logLevelToUse, boolean logContainsMessage) {
        String logMessage = "This is a test";

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(logMessage));
    }

    /**
     * Test whether a log will be captured when the ClientLogger and message are configured to the passed log levels.
     */
    @ParameterizedTest
    @MethodSource("logMaliciousErrorSupplier")
    public void logMaliciousMessage(LogLevel logLevelToConfigure, LogLevel logLevelToUse) {
        String logMessage
            = "You have successfully authenticated, \r\n[INFO] User dummy was not" + " successfully authenticated.";

        String expectedMessage
            = "You have successfully authenticated, \\r\\n[INFO] User dummy was not" + " successfully authenticated.";

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(expectedMessage));
    }

    /**
     * Tests whether a log will contain the exception message when the ClientLogger and message are configured to the
     * passed log levels.
     */
    @ParameterizedTest
    @MethodSource("multiLevelCheckSupplier")
    public void logException(LogLevel logLevelToConfigure, LogLevel logLevelToUse, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String logMessage = "This is an exception";
        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage, runtimeException);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(logMessage));
        assertEquals(logContainsStackTrace, logValues.contains(runtimeException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a RuntimeException as warning will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsWarningSupplier")
    public void logThrowableAsWarning(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";

        IOException ioException = assertThrows(IOException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).throwableAtWarning()
                .log(exceptionMessage, ClientLoggerTests::createIOException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a Throwable as warning will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsWarningSupplier")
    public void logCheckedExceptionAsWarning(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";

        IOException ioException = assertThrows(IOException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).throwableAtWarning()
                .log(exceptionMessage, ClientLoggerTests::createIOException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests logging Throwable with context
     */
    @Test
    public void logExceptionWithContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        String shortMessage = "connection dropped";
        IOException ioException = logger.throwableAtWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", 1)
            .log(shortMessage, IOException::new);

        assertEquals("connection dropped; {\"connectionId\":\"foo\",\"linkName\":1}", ioException.getMessage());

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", shortMessage);
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        expectedMessage.put("exception.type", ioException.getClass().getCanonicalName());

        String logValues = byteArraySteamToString(logCaptureStream);

        System.out.println(logValues);
        assertTrue(logValues.contains(shortMessage));
        assertMessage(expectedMessage, logValues, LogLevel.INFORMATIONAL, LogLevel.WARNING);
    }

    @Test
    public void logExceptionWithoutContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        String shortMessage = "connection dropped";
        IOException ioException = logger.throwableAtWarning().log(shortMessage, IOException::new);
        assertEquals("connection dropped", ioException.getMessage());

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", shortMessage);
        expectedMessage.put("exception.type", ioException.getClass().getCanonicalName());

        String logValues = byteArraySteamToString(logCaptureStream);

        System.out.println(logValues);
        assertTrue(logValues.contains(shortMessage));
        assertMessage(expectedMessage, logValues, LogLevel.INFORMATIONAL, LogLevel.WARNING);
    }

    /**
     * Tests logging Throwable with context
     */
    @Test
    public void logExceptionWithoutMessage() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        UnknownHostException cause = new UnknownHostException("Unable to resolve host www.xyz.com");
        CoreException coreException = logger.throwableAtWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", 1)
            .log(cause, CoreException::from);

        String[] messageComponents = coreException.getMessage().split(";");
        assertEquals(2, messageComponents.length);
        assertEquals(cause.getMessage(), messageComponents[0].trim());
        Map<String, Object> exceptionMessageMap = fromJson(messageComponents[1]);
        assertEquals("foo", exceptionMessageMap.get("connectionId"));
        assertEquals(1, exceptionMessageMap.get("linkName"));
        assertEquals("java.net.UnknownHostException", exceptionMessageMap.get("cause.type"));
        assertEquals("Unable to resolve host www.xyz.com", exceptionMessageMap.get("cause.message"));

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        expectedMessage.put("exception.type", coreException.getClass().getCanonicalName());
        expectedMessage.put("cause.type", cause.getClass().getCanonicalName());
        expectedMessage.put("cause.message", cause.getMessage());

        String logValues = byteArraySteamToString(logCaptureStream);

        assertTrue(logValues.contains(cause.getMessage()));
        assertMessage(expectedMessage, logValues, LogLevel.INFORMATIONAL, LogLevel.WARNING);
    }

    /**
     * Tests logging Throwable with context
     */
    @Test
    public void logExceptionWithContextLevelDisabled() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.ERROR);

        String shortMessage = "connection dropped";
        IOException ioException = logger.throwableAtWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", 1)
            .log(shortMessage, IOException::new);

        assertEquals("connection dropped; {\"connectionId\":\"foo\",\"linkName\":1}", ioException.getMessage());

        String logValues = byteArraySteamToString(logCaptureStream);

        assertFalse(logValues.contains(shortMessage));
    }

    /**
     * Tests logging Throwable with disabled stack trace
     */
    @Test
    public void logExceptionWithDisabledStackTrace() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);

        String shortMessage = "connection dropped";
        RuntimeException exception = logger.throwableAtWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", 1)
            .log(shortMessage, ExceptionWithDisabledStackTrace::new);

        assertEquals("connection dropped; {\"connectionId\":\"foo\",\"linkName\":1}", exception.getMessage());

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", shortMessage);
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        expectedMessage.put("exception.type", exception.getClass().getCanonicalName());
        expectedMessage.put("exception.stacktrace", "stacktrace disabled");

        String logValues = byteArraySteamToString(logCaptureStream);

        assertTrue(logValues.contains(shortMessage));
        assertMessage(expectedMessage, logValues, LogLevel.VERBOSE, LogLevel.ERROR);
    }

    /**
     * Tests logging Throwable with context and cause
     */
    @Test
    public void logExceptionWithContextAndCause() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        UnknownHostException ioException = new UnknownHostException("Unable to resolve host www.xyz.com");

        String shortMessage = "Can't connect";
        CoreException coreException = logger.throwableAtError()
            .addKeyValue("server.address", "foo")
            .addKeyValue("server.port", 42)
            .log(shortMessage, ioException, CoreException::from);

        assertEquals(
            "Can't connect; {\"server.address\":\"foo\",\"server.port\":42,\"cause.type\":\"java.net.UnknownHostException\",\"cause.message\":\"Unable to resolve host www.xyz.com\"}",
            coreException.getMessage());

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", shortMessage);
        expectedMessage.put("server.address", "foo");
        expectedMessage.put("server.port", 42);
        expectedMessage.put("exception.type", coreException.getClass().getCanonicalName());
        expectedMessage.put("cause.type", ioException.getClass().getCanonicalName());
        expectedMessage.put("cause.message", ioException.getMessage());

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(shortMessage));
        assertMessage(expectedMessage, logValues, LogLevel.INFORMATIONAL, LogLevel.ERROR);
    }

    /**
     * Tests that logging a RuntimeException as error will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsErrorSupplier")
    public void logThrowableAsError(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";
        IllegalStateException illegalStateException = createIllegalStateException(exceptionMessage);

        assertInstanceOf(IllegalStateException.class, setupLogLevelAndGetLogger(logLevelToConfigure).throwableAtError()
            .log(exceptionMessage, ClientLoggerTests::createIllegalStateException));

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(illegalStateException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a Throwable as error will log a message and stack trace appropriately based on the configured
     * log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsErrorSupplier")
    public void logCheckedExceptionAsError(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";

        IOException ioException
            = assertInstanceOf(IOException.class, setupLogLevelAndGetLogger(logLevelToConfigure).throwableAtError()
                .log(exceptionMessage, ClientLoggerTests::createIOException));

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that LogLevel.fromString returns the expected LogLevel enum based on the passed environment configuration.
     */
    @ParameterizedTest
    @MethodSource("validLogLevelSupplier")
    public void logLevelFromString(String environmentLogLevel, LogLevel expected) {
        assertEquals(expected, LogLevel.fromString(environmentLogLevel));
    }

    /**
     * Tests that LogLevel.fromString will throw an illegal argument exception when passed an environment configuration
     * it doesn't support.
     */
    @ParameterizedTest
    @ValueSource(strings = { "errs", "not_set", "12", "onlyErrorsPlease" })
    public void invalidLogLevelFromString(String environmentLogLevel) {
        assertThrows(IllegalArgumentException.class, () -> LogLevel.fromString(environmentLogLevel));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithSupplier(LogLevel logLevel) {
        String message = "hello world";
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log(message);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log(message);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log(message);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log(message);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(message));
    }

    @Test
    public void logWithNewLine() {
        String message = "hello " + System.lineSeparator() + "world" + System.lineSeparator();
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);
        logger.atInfo().log(message);

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", message);

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.INFORMATIONAL);
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithNullSupplier(LogLevel logLevel) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log();
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log();
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log();
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log();
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }

        String logValues = byteArraySteamToString(logCaptureStream);
        assertMessage(Collections.emptyMap(), logValues, logLevel, logLevel);
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logSupplierWithException(LogLevel logLevel) {
        NullPointerException exception = new NullPointerException();
        String message = "hello world";
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().setThrowable(exception).log(message);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().setThrowable(exception).log(message);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().setThrowable(exception).log(message);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().setThrowable(exception).log(message);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }
        String logValues = byteArraySteamToString(logCaptureStream);

        assertTrue(logValues.contains(message));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logShouldEvaluateSupplierWithNullException(LogLevel logLevel) {
        String message = "hello world";
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        logger.atLevel(logLevel).setThrowable(null).log(message);
        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(message));
    }

    /**
     * Tests that logging with context of string message writes
     * log message and context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String message = "hello world";

        logger.atWarning().addKeyValue("connectionId", "foo").addKeyValue("linkName", 1).log(message);

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", message);
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format at info level
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);
        logger.atInfo().log("message");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "message");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        expectedMessage.put("anotherKey", "hello world");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests empty global context
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithEmptyGlobalContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, Collections.emptyMap());
        logger.atWarning().log("hello world");

        assertMessage(Collections.singletonMap("message", "hello world"), byteArraySteamToString(logCaptureStream),
            logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests null global context
     */
    @Test
    public void logWithNullGlobalContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL, null);
        logger.atInfo().log("hello world");

        assertMessage(Collections.singletonMap("message", "hello world"), byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and local and globacl context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalAndLocalContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);

        logger.atInfo().addKeyValue("local", true).addKeyValue("connectionId", "conflict").log("hello world");

        String fullLog = byteArraySteamToString(logCaptureStream);

        if (LogLevel.INFORMATIONAL.compareTo(logLevelToConfigure) >= 0) {
            assertTrue(fullLog.contains("\"connectionId\":\"conflict\""));
            assertTrue(fullLog.contains("\"connectionId\":\"foo\""));
            assertTrue(fullLog.contains("\"message\":\"hello world\""));
            assertTrue(fullLog.contains("\"linkName\":1"));
            assertTrue(fullLog.contains("\"anotherKey\":\"hello world\""));
            assertTrue(fullLog.contains("\"local\":true"));
        } else {
            assertEquals("", fullLog);
        }
    }

    /**
     * Tests that contextual logging without context of string message writes
     * log message and context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void contextualLogWithoutContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        logger.atWarning().log("hello world");

        assertMessage(Collections.singletonMap("message", "hello world"), byteArraySteamToString(logCaptureStream),
            logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests message supplier with local and global context.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalContextMessageSupplier(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);

        logger.atInfo().log("hello world");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "hello world");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", 1);
        expectedMessage.put("anotherKey", "hello world");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context with null message does not throw.
     */
    @Test
    public void logWithContextNullMessage() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);

        logger.atVerbose().addKeyValue("connectionId", "foo").addKeyValue("linkName", true).log();

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", true);

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that newline is escaped in message, keys and values.
     */
    @Test
    public void logWithContextNewLineIsEscaped() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);

        String message = "multiline " + System.lineSeparator() + "message";
        logger.atVerbose()
            .addKeyValue("connection\nId" + System.lineSeparator(), "foo")
            .addKeyValue("link\r\nName", "test" + System.lineSeparator() + "me")
            .log(message);

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", message);
        expectedMessage.put("connection\nId" + System.lineSeparator(), "foo");
        expectedMessage.put("link\r\nName", "test" + System.lineSeparator() + "me");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that global context is escaped
     */
    @Test
    public void logWithGlobalContextIsEscaped() {
        // preserve order
        Map<String, Object> globalCtx = new LinkedHashMap<>();
        globalCtx.put("link\tName", 1);
        globalCtx.put("another\rKey\n", new LoggableObject("hello \"world\"\r\n"));

        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalCtx);

        logger.atVerbose().log("\"message\"");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "\"message\"");
        expectedMessage.put("another\rKey\n", "hello \"world\"\r\n");
        expectedMessage.put("link\tName", 1);

        assertMessage(expectedMessage,
            //"{\"message\":\"\\\"message\\\"\",\"link\\tName\":1,\"another\\rKey\\n\":\"hello \\\"world\\\"\\r\\n\"}",
            byteArraySteamToString(logCaptureStream), LogLevel.VERBOSE, LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context with null message supplier does not throw.
     */
    @Test
    public void logWithContextNullSupplier() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atError().addKeyValue("connectionId", "foo").addKeyValue("linkName", (String) null).log();

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", null);

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.ERROR);
    }

    /**
     * Tests supplied context value.
     */
    @Test
    public void logWithContextValueSupplier() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atWarning()
            // this is technically invalid, but we should not throw because of logging in runtime
            .addKeyValue("connectionId", (Supplier<String>) null)
            .addKeyValue("linkName", () -> String.format("complex value %s", 123))
            .log("test");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "test");
        expectedMessage.put("linkName", "complex value 123");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.WARNING);
    }

    /**
     * Tests supplied context value.
     */
    @Test
    public void logWithContextObject() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atWarning().addKeyValue("linkName", new LoggableObject("some complex object")).log("test");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "test");
        expectedMessage.put("linkName", "some complex object");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.WARNING);
    }

    /**
     * Tests message with args and context.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logMessageAndArgsWithContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        logger.atWarning().addKeyValue("connectionId", () -> null).addKeyValue("linkName", "bar").log("hello world");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "hello world");
        expectedMessage.put("linkName", "bar");
        expectedMessage.put("connectionId", null);

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests logging with context when args have throwable (stack trace is only logged at debug)
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextWithThrowableInArgs(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .setThrowable(runtimeException)
            .log(String.format("Don't format strings when writing logs, %s!", "please"));

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "Don't format strings when writing logs, please!");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", "bar");
        expectedMessage.put("exception.type", runtimeException.getClass().getCanonicalName());
        expectedMessage.put("exception.message", exceptionMessage);

        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage.put("exception.stacktrace", stackTraceToString(runtimeException));
        }

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests logging with context and supplied message when args have throwable (stack trace is only logged at debug)
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextMessageSupplierAndThrowableInArgs(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .setThrowable(ioException)
            .log("hello world");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "hello world");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", "bar");
        expectedMessage.put("exception.type", ioException.getClass().getCanonicalName());
        expectedMessage.put("exception.message", exceptionMessage);

        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage.put("exception.stacktrace", stackTraceToString(ioException));
        }

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests json escape in keys, values, message and exception message
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextWithThrowableInArgsAndEscaping(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception \tmessage with \"special characters\"\r\n";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connection\tId", "foo")
            .addKeyValue("linkName", "\rbar")
            .setThrowable(runtimeException)
            .log("hello \"world\"");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "hello \"world\"");
        expectedMessage.put("connection\tId", "foo");
        expectedMessage.put("linkName", "\rbar");
        expectedMessage.put("exception.type", runtimeException.getClass().getCanonicalName());
        expectedMessage.put("exception.message", exceptionMessage);

        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage.put("exception.stacktrace", stackTraceToString(runtimeException));
        }

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests logging with context when cause is set
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextRuntimeException(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .setThrowable(runtimeException)
            .log();

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", "bar");
        expectedMessage.put("exception.type", runtimeException.getClass().getCanonicalName());
        expectedMessage.put("exception.message", exceptionMessage);

        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage.put("exception.stacktrace", stackTraceToString(runtimeException));
        }

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    /**
     * Tests logging with context when cause is set
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextThrowable(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .setThrowable(ioException)
            .log();

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", "bar");
        expectedMessage.put("exception.type", ioException.getClass().getCanonicalName());
        expectedMessage.put("exception.message", exceptionMessage);

        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage.put("exception.stacktrace", stackTraceToString(ioException));
        }

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), logLevelToConfigure, LogLevel.WARNING);
    }

    @Test
    public void logSupplierShouldLogExceptionOnVerboseLevel() {
        NullPointerException exception = new NullPointerException();
        String message = "A log message";
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);
        String expectedStackTrace = stackTraceToString(exception);
        logger.atVerbose().setThrowable(exception).log(message);

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", message);
        expectedMessage.put("exception.type", exception.getClass().getCanonicalName());
        expectedMessage.put("exception.stacktrace", expectedStackTrace);

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.VERBOSE, LogLevel.WARNING);
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logAtLevel(LogLevel level) {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atLevel(level).addKeyValue("connectionId", "foo").addKeyValue("linkName", "bar").log("message");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "message");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("linkName", "bar");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL, level);
    }

    @Test
    public void logWithContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);
        InstrumentationContext context = createRandomInstrumentationContext();
        logger.atInfo().setInstrumentationContext(context).addKeyValue("connectionId", "foo").log("message");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "message");
        expectedMessage.put("connectionId", "foo");
        expectedMessage.put("trace.id", context.getTraceId());
        expectedMessage.put("span.id", context.getSpanId());

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.INFORMATIONAL);
    }

    @Test
    public void logWithInvalidContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);
        logger.atInfo()
            .setInstrumentationContext(createInvalidInstrumentationContext())
            .addKeyValue("connectionId", "foo")
            .log("message");

        Map<String, Object> expectedMessage = new HashMap<>();
        expectedMessage.put("message", "message");
        expectedMessage.put("connectionId", "foo");

        assertMessage(expectedMessage, byteArraySteamToString(logCaptureStream), LogLevel.INFORMATIONAL,
            LogLevel.INFORMATIONAL);
    }

    private String stackTraceToString(Throwable exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private ClientLogger setupLogLevelAndGetLogger(LogLevel logLevelToSet) {
        return setupLogLevelAndGetLogger(logLevelToSet, null);
    }

    private ClientLogger setupLogLevelAndGetLogger(LogLevel logLevelToSet, Map<String, Object> globalContext) {
        DefaultLogger logger
            = new DefaultLogger(ClientLogger.class.getName(), new PrintStream(logCaptureStream), logLevelToSet);

        return new ClientLogger(logger, globalContext);
    }

    private void logMessage(ClientLogger logger, LogLevel logLevel, String logMessage,
        RuntimeException runtimeException) {
        if (logLevel == null) {
            return;
        }

        logger.atLevel(logLevel).setThrowable(runtimeException).log(logMessage);
    }

    private void logMessage(ClientLogger logger, LogLevel logLevel, String logMessage) {
        if (logLevel == null) {
            return;
        }

        logger.atLevel(logLevel).log(logMessage);
    }

    private static IllegalStateException createIllegalStateException(String message) {
        return fillInStackTrace(new IllegalStateException(message));
    }

    private static IOException createIOException(String message) {
        return fillInStackTrace(new IOException(message));
    }

    private static <T extends Throwable> T fillInStackTrace(T throwable) {
        StackTraceElement[] stackTraceElements
            = { new StackTraceElement("ClientLoggerTests", "onlyLogExceptionMessage", "ClientLoggerTests", 117) };
        throwable.setStackTrace(stackTraceElements);

        return throwable;
    }

    private static String byteArraySteamToString(AccessibleByteArrayOutputStream stream) {
        return stream.toString(StandardCharsets.UTF_8);
    }

    private void assertMessage(Map<String, Object> expectedMessage, String fullLog, LogLevel configuredLevel,
        LogLevel loggedLevel) {
        if (loggedLevel.compareTo(configuredLevel) >= 0) {
            // remove date/time/level/etc from fullMessage

            String messageJson = fullLog.substring(fullLog.indexOf(" - ") + 3);
            System.out.println(messageJson);
            Map<String, Object> message = fromJson(messageJson);
            for (Map.Entry<String, Object> entry : expectedMessage.entrySet()) {
                assertEquals(entry.getValue(), message.get(entry.getKey()));
            }
            assertEquals(expectedMessage.size(), message.size());
        } else {
            assertEquals("", fullLog);
        }
    }

    private static Stream<Arguments> singleLevelCheckSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false),

            // Supported logging level set to INFORMATIONAL.
            // Checking VERBOSE.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.INFORMATIONAL, null, false),

            // Supported logging level set to WARNING.
            // Checking VERBOSE.
            Arguments.of(LogLevel.WARNING, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.WARNING, LogLevel.INFORMATIONAL, false),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.WARNING, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.WARNING, null, false),

            // Supported logging level set to ERROR.
            // Checking VERBOSE.
            Arguments.of(LogLevel.ERROR, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.ERROR, LogLevel.INFORMATIONAL, false),

            // Checking WARNING.
            Arguments.of(LogLevel.ERROR, LogLevel.WARNING, false),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false));
    }

    private static Stream<Arguments> multiLevelCheckSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false, false),

            // Supported logging level set to INFORMATIONAL.
            // Checking VERBOSE.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true, false),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true, false),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.INFORMATIONAL, null, false, false),

            // Supported logging level set to WARNING.
            // Checking VERBOSE.
            Arguments.of(LogLevel.WARNING, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.WARNING, LogLevel.INFORMATIONAL, false, false),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true, false),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.WARNING, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.WARNING, null, false, false),

            // Supported logging level set to ERROR.
            // Checking VERBOSE.
            Arguments.of(LogLevel.ERROR, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.ERROR, LogLevel.INFORMATIONAL, false, false),

            // Checking WARNING.
            Arguments.of(LogLevel.ERROR, LogLevel.WARNING, false, false),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false, false));
    }

    private static Stream<Arguments> logMaliciousErrorSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true));
    }

    private static Stream<Arguments> provideLogLevels() {
        return Stream.of(

            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR));
    }

    private static Stream<Arguments> logExceptionAsWarningSupplier() {
        return Stream.of(Arguments.of(LogLevel.VERBOSE, true, true), Arguments.of(LogLevel.INFORMATIONAL, true, false),
            Arguments.of(LogLevel.WARNING, true, false), Arguments.of(LogLevel.ERROR, false, false),
            Arguments.of(LogLevel.NOTSET, false, false));
    }

    private static Stream<Arguments> logExceptionAsErrorSupplier() {
        return Stream.of(Arguments.of(LogLevel.VERBOSE, true, true), Arguments.of(LogLevel.INFORMATIONAL, true, false),
            Arguments.of(LogLevel.WARNING, true, false), Arguments.of(LogLevel.ERROR, true, false),
            Arguments.of(LogLevel.NOTSET, false, false));
    }

    private static Stream<Arguments> validLogLevelSupplier() {
        return Stream.of(
            // Valid VERBOSE environment variables.
            Arguments.of("1", LogLevel.VERBOSE), Arguments.of("verbose", LogLevel.VERBOSE),
            Arguments.of("debug", LogLevel.VERBOSE), Arguments.of("deBUG", LogLevel.VERBOSE),

            // Valid INFORMATIONAL environment variables.
            Arguments.of("2", LogLevel.INFORMATIONAL), Arguments.of("info", LogLevel.INFORMATIONAL),
            Arguments.of("information", LogLevel.INFORMATIONAL), Arguments.of("informational", LogLevel.INFORMATIONAL),
            Arguments.of("InForMATiONaL", LogLevel.INFORMATIONAL),

            // Valid WARNING environment variables.
            Arguments.of("3", LogLevel.WARNING), Arguments.of("warn", LogLevel.WARNING),
            Arguments.of("warning", LogLevel.WARNING), Arguments.of("WARniNg", LogLevel.WARNING),

            // Valid ERROR environment variables.
            Arguments.of("4", LogLevel.ERROR), Arguments.of("err", LogLevel.ERROR),
            Arguments.of("error", LogLevel.ERROR), Arguments.of("ErRoR", LogLevel.ERROR),

            // Valid NOT_SET environment variables.
            Arguments.of("0", LogLevel.NOTSET), Arguments.of(null, LogLevel.NOTSET));
    }

    static class LoggableObject {
        private final String str;

        LoggableObject(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return str;
        }
    }

    private Map<String, Object> fromJson(String str) {
        try (JsonReader reader = JsonReader.fromString(str)) {
            return reader.readMap(JsonReader::readUntyped);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    static class ExceptionWithDisabledStackTrace extends RuntimeException {
        ExceptionWithDisabledStackTrace(String message) {
            super(message, null, true, false);
        }
    }
}
