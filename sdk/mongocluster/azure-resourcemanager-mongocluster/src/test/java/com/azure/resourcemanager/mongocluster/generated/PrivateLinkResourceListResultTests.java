// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.implementation.models.PrivateLinkResourceListResult;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"qfbow\",\"requiredMembers\":[\"nyktzlcuiy\",\"gqywgndrv\",\"nhzgpphrcgyn\",\"ocpecfvmmco\"],\"requiredZoneNames\":[\"xlzevgbmqjqabcy\",\"mivkwlzuvcc\",\"wnfnbacf\"]},\"id\":\"nlebxetqgtzxd\",\"name\":\"nqbqqwxr\",\"type\":\"feallnwsu\"},{\"properties\":{\"groupId\":\"njampm\",\"requiredMembers\":[\"zscxaqwo\",\"chcbonqvpkvlrxnj\"],\"requiredZoneNames\":[\"eipheoflokeyy\",\"enjbdlwtgrhp\"]},\"id\":\"pj\",\"name\":\"masxazjpqyegu\",\"type\":\"lhbxxhejjzzvdud\"},{\"properties\":{\"groupId\":\"slfhotwm\",\"requiredMembers\":[\"pwlbjnpg\",\"cftadeh\",\"nltyfsoppusuesnz\"],\"requiredZoneNames\":[\"jbavorxzdm\"]},\"id\":\"ctbqvudwx\",\"name\":\"ndnvo\",\"type\":\"gujjugwdkcglh\"}],\"nextLink\":\"azjdyggd\"}")
            .toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("xlzevgbmqjqabcy", model.value().get(0).properties().requiredZoneNames().get(0));
        Assertions.assertEquals("azjdyggd", model.nextLink());
    }
}
