/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum StorageAlertStatus.
 */
@XmlType(name = "StorageAlertStatus")
@XmlEnum
public enum StorageAlertStatus {

    @XmlEnumValue("Inform")
    INFORM("Inform"), @XmlEnumValue("Down")
    DOWN("Down"), @XmlEnumValue("Degraded")
    DEGRADED("Degraded"), @XmlEnumValue("Upgraded")
    UPGRADED("Upgraded"), @XmlEnumValue("Deleting")
    DELETING("Deleting");
    private final String value;


    /**
     * Instantiates a new storage alert status.
     *
     * @param v the v
     */
    StorageAlertStatus(String v) {
        value = v;
    }


    /**
     * Value.
     *
     * @return the string
     */
    public String value() {
        return value;
    }


    /**
     * From value.
     *
     * @param v the v
     * @return the storage alert status
     */
    public static StorageAlertStatus fromValue(String v) {
        for (StorageAlertStatus c : StorageAlertStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}