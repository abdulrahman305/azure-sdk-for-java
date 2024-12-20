// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Currency and amount that customer will be charged in customer's local currency. Tax is not included.
 */
@Fluent
public final class CalculatePriceResponsePropertiesBillingCurrencyTotal
    implements JsonSerializable<CalculatePriceResponsePropertiesBillingCurrencyTotal> {
    /*
     * The ISO 4217 3-letter currency code for the currency used by this purchase record.
     */
    private String currencyCode;

    /*
     * Amount in pricing currency. Tax is not included.
     */
    private Double amount;

    /**
     * Creates an instance of CalculatePriceResponsePropertiesBillingCurrencyTotal class.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal() {
    }

    /**
     * Get the currencyCode property: The ISO 4217 3-letter currency code for the currency used by this purchase record.
     * 
     * @return the currencyCode value.
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Set the currencyCode property: The ISO 4217 3-letter currency code for the currency used by this purchase record.
     * 
     * @param currencyCode the currencyCode value to set.
     * @return the CalculatePriceResponsePropertiesBillingCurrencyTotal object itself.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get the amount property: Amount in pricing currency. Tax is not included.
     * 
     * @return the amount value.
     */
    public Double amount() {
        return this.amount;
    }

    /**
     * Set the amount property: Amount in pricing currency. Tax is not included.
     * 
     * @param amount the amount value to set.
     * @return the CalculatePriceResponsePropertiesBillingCurrencyTotal object itself.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("currencyCode", this.currencyCode);
        jsonWriter.writeNumberField("amount", this.amount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CalculatePriceResponsePropertiesBillingCurrencyTotal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CalculatePriceResponsePropertiesBillingCurrencyTotal if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CalculatePriceResponsePropertiesBillingCurrencyTotal.
     */
    public static CalculatePriceResponsePropertiesBillingCurrencyTotal fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            CalculatePriceResponsePropertiesBillingCurrencyTotal deserializedCalculatePriceResponsePropertiesBillingCurrencyTotal
                = new CalculatePriceResponsePropertiesBillingCurrencyTotal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currencyCode".equals(fieldName)) {
                    deserializedCalculatePriceResponsePropertiesBillingCurrencyTotal.currencyCode = reader.getString();
                } else if ("amount".equals(fieldName)) {
                    deserializedCalculatePriceResponsePropertiesBillingCurrencyTotal.amount
                        = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCalculatePriceResponsePropertiesBillingCurrencyTotal;
        });
    }
}
