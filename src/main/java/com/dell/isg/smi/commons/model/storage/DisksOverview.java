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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class DisksOverview.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisksOverview", propOrder = { "internal", "external" })
public class DisksOverview {

    protected int internal;
    protected int external;


    /**
     * Gets the value of the internal property.
     *
     * @return the internal
     */
    public int getInternal() {
        return internal;
    }


    /**
     * Sets the value of the internal property.
     *
     * @param value the new internal
     */
    public void setInternal(int value) {
        this.internal = value;
    }


    /**
     * Gets the value of the external property.
     *
     * @return the external
     */
    public int getExternal() {
        return external;
    }


    /**
     * Sets the value of the external property.
     *
     * @param value the new external
     */
    public void setExternal(int value) {
        this.external = value;
    }

}
