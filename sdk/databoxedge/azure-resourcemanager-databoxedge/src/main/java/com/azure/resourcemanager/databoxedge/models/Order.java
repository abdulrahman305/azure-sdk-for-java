// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.resourcemanager.databoxedge.fluent.models.OrderInner;
import java.util.List;

/**
 * An immutable client-side representation of Order.
 */
public interface Order {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the contactInformation property: The contact details.
     * 
     * @return the contactInformation value.
     */
    ContactDetails contactInformation();

    /**
     * Gets the shippingAddress property: The shipping address.
     * 
     * @return the shippingAddress value.
     */
    Address shippingAddress();

    /**
     * Gets the currentStatus property: Current status of the order.
     * 
     * @return the currentStatus value.
     */
    OrderStatus currentStatus();

    /**
     * Gets the orderHistory property: List of status changes in the order.
     * 
     * @return the orderHistory value.
     */
    List<OrderStatus> orderHistory();

    /**
     * Gets the serialNumber property: Serial number of the device.
     * 
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the deliveryTrackingInfo property: Tracking information for the package delivered to the customer whether it
     * has an original or a replacement device.
     * 
     * @return the deliveryTrackingInfo value.
     */
    List<TrackingInfo> deliveryTrackingInfo();

    /**
     * Gets the returnTrackingInfo property: Tracking information for the package returned from the customer whether it
     * has an original or a replacement device.
     * 
     * @return the returnTrackingInfo value.
     */
    List<TrackingInfo> returnTrackingInfo();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.fluent.models.OrderInner object.
     * 
     * @return the inner object.
     */
    OrderInner innerModel();
}
