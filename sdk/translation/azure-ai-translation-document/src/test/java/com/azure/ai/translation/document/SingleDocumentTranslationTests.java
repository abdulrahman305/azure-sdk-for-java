// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.translation.document;

import com.azure.ai.translation.document.models.DocumentFileDetails;
import com.azure.ai.translation.document.models.DocumentTranslateContent;
import com.azure.ai.translation.document.models.GlossaryFileDetails;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.test.annotation.LiveOnly;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SingleDocumentTranslationTests extends DocumentTranslationClientTestBase {
    private static final String CURRENT_DIRECTORY = System.getProperty("user.dir");
    private static final Path DOCUMENT_FILE_PATH
        = Paths.get(CURRENT_DIRECTORY, "src", "test", "resources", "test-input.txt");
    private static final Path GLOSSARY_FILE_PATH
        = Paths.get(CURRENT_DIRECTORY, "src", "test", "resources", "test-glossary.csv");

    @LiveOnly
    @Test
    public void testTranslateDocument() {
        DocumentFileDetails document = createDocumentContent();
        DocumentTranslateContent documentTranslateContent = new DocumentTranslateContent(document);
        String targetLanguage = "hi";

        BinaryData response = getSingleDocumentTranslationClient().translate(targetLanguage, documentTranslateContent);
        String translatedResponse = response.toString();
        Assertions.assertNotNull(translatedResponse);
    }

    @LiveOnly
    @Test
    public void testTranslateSingleCSVGlossary() {
        DocumentFileDetails document = createDocumentContent();
        List<GlossaryFileDetails> glossaryList = createSingleGlossaryContent();
        DocumentTranslateContent documentTranslateContent
            = new DocumentTranslateContent(document).setGlossary(glossaryList);
        String targetLanguage = "hi";

        BinaryData response = getSingleDocumentTranslationClient().translate(targetLanguage, documentTranslateContent);
        String translatedResponse = response.toString();

        Assertions.assertTrue(translatedResponse.contains("test"), "Glossary 'test' not found in translated response");
    }

    @LiveOnly
    @Test
    public void testTranslateMultipleCSVGlossary() {
        DocumentFileDetails document = createDocumentContent();
        List<GlossaryFileDetails> glossaryList = createMultipleGlossaryContent();
        DocumentTranslateContent documentTranslateContent
            = new DocumentTranslateContent(document).setGlossary(glossaryList);
        String targetLanguage = "hi";

        HttpResponseException e = assertThrows(HttpResponseException.class,
            () -> getSingleDocumentTranslationClient().translate(targetLanguage, documentTranslateContent));
        Assertions.assertEquals(400, e.getResponse().getStatusCode());
    }

    private static DocumentFileDetails createDocumentContent() {
        DocumentFileDetails document = null;
        try {
            byte[] fileData = Files.readAllBytes(DOCUMENT_FILE_PATH);
            BinaryData documentContent = BinaryData.fromBytes(fileData);

            String documentFilename = DOCUMENT_FILE_PATH.getFileName().toString();
            String documentContentType = "text/html";

            document = new DocumentFileDetails(documentContent).setFilename(documentFilename)
                .setContentType(documentContentType);

        } catch (IOException ex) {
            System.out.println("An exception occurred while creating documentContent" + ex.getMessage());
        }
        return document;
    }

    private static List<GlossaryFileDetails> createSingleGlossaryContent() {
        GlossaryFileDetails glossaryFileDetails = getGlossaryFileDetails();
        List<GlossaryFileDetails> glossaryList = new ArrayList<>();
        glossaryList.add(glossaryFileDetails);
        return glossaryList;
    }

    private static List<GlossaryFileDetails> createMultipleGlossaryContent() {
        GlossaryFileDetails glossaryFileDetails = getGlossaryFileDetails();
        List<GlossaryFileDetails> glossaryList = new ArrayList<>();
        glossaryList.add(glossaryFileDetails);
        glossaryList.add(glossaryFileDetails);
        return glossaryList;
    }

    private static GlossaryFileDetails getGlossaryFileDetails() {
        GlossaryFileDetails glossaryFileDetails = null;
        try {
            byte[] fileData = Files.readAllBytes(GLOSSARY_FILE_PATH);
            BinaryData glossaryContent = BinaryData.fromBytes(fileData);
            String glossaryFilename = GLOSSARY_FILE_PATH.getFileName().toString();
            String glossaryContentType = "text/csv";

            glossaryFileDetails = new GlossaryFileDetails(glossaryContent).setFilename(glossaryFilename)
                .setContentType(glossaryContentType);

        } catch (IOException ex) {
            System.out.println("An exception occurred while getting glossary file details" + ex.getMessage());
        }
        return glossaryFileDetails;
    }
}
