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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StorageFirmware.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "status", "currentVersion" })
@XmlRootElement(name = "StorageFirmware")
public class StorageFirmware {

    @XmlElement(required = true)
    protected FirmwareStatus status;
    @XmlElement(required = true)
    protected String currentVersion;


    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link FirmwareStatus }
     * 
     */
    public FirmwareStatus getStatus() {
        return status;
    }


    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link FirmwareStatus }
     * 
     */
    public void setStatus(FirmwareStatus value) {
        this.status = value;
    }


    /**
     * Gets the value of the currentVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCurrentVersion() {
        return currentVersion;
    }


    /**
     * Sets the value of the currentVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCurrentVersion(String value) {
        this.currentVersion = value;
    }

}
