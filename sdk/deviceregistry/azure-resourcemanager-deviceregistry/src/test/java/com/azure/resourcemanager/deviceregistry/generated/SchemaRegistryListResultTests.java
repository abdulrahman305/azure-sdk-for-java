// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceregistry.implementation.models.SchemaRegistryListResult;
import com.azure.resourcemanager.deviceregistry.models.SystemAssignedServiceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class SchemaRegistryListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SchemaRegistryListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"uuid\":\"lxotogtwrupq\",\"namespace\":\"xvnmicykvceov\",\"displayName\":\"lo\",\"description\":\"oty\",\"storageAccountContainerUrl\":\"jfcn\",\"provisioningState\":\"Accepted\"},\"identity\":{\"principalId\":\"x\",\"tenantId\":\"bttk\",\"type\":\"None\"},\"location\":\"wpn\",\"tags\":{\"hoxus\":\"oqnermclfpl\"},\"id\":\"rpabg\",\"name\":\"epsbjtazqu\",\"type\":\"xywpmueefjzwfqkq\"},{\"properties\":{\"uuid\":\"dsuyonobgla\",\"namespace\":\"cq\",\"displayName\":\"ccm\",\"description\":\"udxytlmoyrx\",\"storageAccountContainerUrl\":\"wfudwpzntxhdzhl\",\"provisioningState\":\"Deleting\"},\"identity\":{\"principalId\":\"ck\",\"tenantId\":\"lhrxsbkyvpyc\",\"type\":\"None\"},\"location\":\"z\",\"tags\":{\"hhseyv\":\"kafkuwbcrnwbm\"},\"id\":\"us\",\"name\":\"tslhspkdeem\",\"type\":\"ofmxagkvtmelmqkr\"},{\"properties\":{\"uuid\":\"vljua\",\"namespace\":\"aquhcdhm\",\"displayName\":\"alaexqpvfadmwsrc\",\"description\":\"vxpvgomz\",\"storageAccountContainerUrl\":\"fmisg\",\"provisioningState\":\"Deleting\"},\"identity\":{\"principalId\":\"e\",\"tenantId\":\"awkz\",\"type\":\"None\"},\"location\":\"io\",\"tags\":{\"xosow\":\"hakauhashsf\",\"cjooxdjebwpucwwf\":\"xcug\",\"hzceuojgjrwjue\":\"ovbvmeueciv\"},\"id\":\"otwmcdyt\",\"name\":\"x\",\"type\":\"it\"},{\"properties\":{\"uuid\":\"jawgqwg\",\"namespace\":\"hniskxfbkpyc\",\"displayName\":\"lwn\",\"description\":\"hjdauwhvylwz\",\"storageAccountContainerUrl\":\"tdhxujznbmpowuwp\",\"provisioningState\":\"Accepted\"},\"identity\":{\"principalId\":\"eualupjmkhf\",\"tenantId\":\"bbcswsrtjri\",\"type\":\"SystemAssigned\"},\"location\":\"bpbewtghfgb\",\"tags\":{\"gibtnm\":\"wxzvlvqhjkb\"},\"id\":\"iebwwaloayqcgwrt\",\"name\":\"j\",\"type\":\"zg\"}],\"nextLink\":\"zmh\"}")
            .toObject(SchemaRegistryListResult.class);
        Assertions.assertEquals("wpn", model.value().get(0).location());
        Assertions.assertEquals("oqnermclfpl", model.value().get(0).tags().get("hoxus"));
        Assertions.assertEquals("xvnmicykvceov", model.value().get(0).properties().namespace());
        Assertions.assertEquals("lo", model.value().get(0).properties().displayName());
        Assertions.assertEquals("oty", model.value().get(0).properties().description());
        Assertions.assertEquals("jfcn", model.value().get(0).properties().storageAccountContainerUrl());
        Assertions.assertEquals(SystemAssignedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("zmh", model.nextLink());
    }
}
