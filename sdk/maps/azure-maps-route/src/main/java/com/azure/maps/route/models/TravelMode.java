// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for TravelMode.
 */
public final class TravelMode extends ExpandableStringEnum<TravelMode> {
    /**
     * The returned routes are optimized for cars.
     */
    @Generated
    public static final TravelMode CAR = fromString("car");

    /**
     * The returned routes are optimized for commercial vehicles, like for trucks.
     */
    @Generated
    public static final TravelMode TRUCK = fromString("truck");

    /**
     * The returned routes are optimized for taxis. BETA functionality.
     */
    @Generated
    public static final TravelMode TAXI = fromString("taxi");

    /**
     * The returned routes are optimized for buses, including the use of bus only lanes. BETA functionality.
     */
    @Generated
    public static final TravelMode BUS = fromString("bus");

    /**
     * The returned routes are optimized for vans. BETA functionality.
     */
    @Generated
    public static final TravelMode VAN = fromString("van");

    /**
     * The returned routes are optimized for motorcycles. BETA functionality.
     */
    @Generated
    public static final TravelMode MOTORCYCLE = fromString("motorcycle");

    /**
     * The returned routes are optimized for bicycles, including use of bicycle lanes.
     */
    @Generated
    public static final TravelMode BICYCLE = fromString("bicycle");

    /**
     * The returned routes are optimized for pedestrians, including the use of sidewalks.
     */
    @Generated
    public static final TravelMode PEDESTRIAN = fromString("pedestrian");

    /**
     * Creates a new instance of TravelMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TravelMode() {
    }

    /**
     * Creates or finds a TravelMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TravelMode.
     */
    @Generated
    public static TravelMode fromString(String name) {
        return fromString(name, TravelMode.class);
    }

    /**
     * Gets known TravelMode values.
     * 
     * @return known TravelMode values.
     */
    @Generated
    public static Collection<TravelMode> values() {
        return values(TravelMode.class);
    }
}
