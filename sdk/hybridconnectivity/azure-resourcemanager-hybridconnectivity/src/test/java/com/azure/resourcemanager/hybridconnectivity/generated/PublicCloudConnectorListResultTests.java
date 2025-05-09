// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.implementation.models.PublicCloudConnectorListResult;
import com.azure.resourcemanager.hybridconnectivity.models.HostType;
import org.junit.jupiter.api.Assertions;

public final class PublicCloudConnectorListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PublicCloudConnectorListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"awsCloudProfile\":{\"accountId\":\"rcjxvsnbyxqabn\",\"excludedAccounts\":[\"pcyshu\"],\"isOrganizationalAccount\":true},\"hostType\":\"AWS\",\"provisioningState\":\"Canceled\",\"connectorPrimaryIdentifier\":\"j\"},\"location\":\"btoqcjmkljavbqid\",\"tags\":{\"dj\":\"jzyulpk\",\"xzlocxscp\":\"rlkhbzhfepgzgq\"},\"id\":\"ierhhbcsglummaj\",\"name\":\"j\",\"type\":\"odxobnbdxkqpxok\"},{\"properties\":{\"awsCloudProfile\":{\"accountId\":\"ionpimexg\",\"excludedAccounts\":[\"gcpo\"],\"isOrganizationalAccount\":true},\"hostType\":\"AWS\",\"provisioningState\":\"Canceled\",\"connectorPrimaryIdentifier\":\"mvdjwzrlovmc\"},\"location\":\"hijco\",\"tags\":{\"ukdkexxppofmxa\":\"tbzaqsqsycbkbfk\",\"jpgd\":\"c\"},\"id\":\"toc\",\"name\":\"j\",\"type\":\"hvpmoue\"},{\"properties\":{\"awsCloudProfile\":{\"accountId\":\"dzxibqeojnxqbzvd\",\"excludedAccounts\":[\"wndeicbtwnp\"],\"isOrganizationalAccount\":false},\"hostType\":\"AWS\",\"provisioningState\":\"Succeeded\",\"connectorPrimaryIdentifier\":\"rhcffcydd\"},\"location\":\"mjthjqkwp\",\"tags\":{\"igdtopbob\":\"cxmqciwqvhkhix\"},\"id\":\"og\",\"name\":\"m\",\"type\":\"w\"},{\"properties\":{\"awsCloudProfile\":{\"accountId\":\"m\",\"excludedAccounts\":[\"rzayv\",\"t\",\"gvdfgiotkftutq\",\"ln\"],\"isOrganizationalAccount\":true},\"hostType\":\"AWS\",\"provisioningState\":\"Canceled\",\"connectorPrimaryIdentifier\":\"gnxkrxdqmidtth\"},\"location\":\"vqdra\",\"tags\":{\"gehoqfbowskany\":\"yb\",\"rvynhzgpph\":\"tzlcuiywgqywgn\"},\"id\":\"cgyncocpecf\",\"name\":\"m\",\"type\":\"coofsxlzev\"}],\"nextLink\":\"m\"}")
            .toObject(PublicCloudConnectorListResult.class);
        Assertions.assertEquals("btoqcjmkljavbqid", model.value().get(0).location());
        Assertions.assertEquals("jzyulpk", model.value().get(0).tags().get("dj"));
        Assertions.assertEquals("rcjxvsnbyxqabn", model.value().get(0).properties().awsCloudProfile().accountId());
        Assertions.assertEquals("pcyshu",
            model.value().get(0).properties().awsCloudProfile().excludedAccounts().get(0));
        Assertions.assertEquals(true, model.value().get(0).properties().awsCloudProfile().isOrganizationalAccount());
        Assertions.assertEquals(HostType.AWS, model.value().get(0).properties().hostType());
        Assertions.assertEquals("m", model.nextLink());
    }
}
