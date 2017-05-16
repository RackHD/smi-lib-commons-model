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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SpaceBreakdown.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceBreakdown", propOrder = { "availableSpace", "allocatedSpace", "usedSpace", "freeSpace", "savingVSRAID10", "storageThreshold", "time" })
public class SpaceBreakdown {

    protected long availableSpace;
    protected long allocatedSpace;
    protected long usedSpace;
    protected long freeSpace;
    protected long savingVSRAID10;
    protected int storageThreshold;
    @XmlElement(required = true)
    protected String time;


    /**
     * Gets the value of the availableSpace property.
     *
     * @return the available space
     */
    public long getAvailableSpace() {
        return availableSpace;
    }


    /**
     * Sets the value of the availableSpace property.
     *
     * @param value the new available space
     */
    public void setAvailableSpace(long value) {
        this.availableSpace = value;
    }


    /**
     * Gets the value of the allocatedSpace property.
     *
     * @return the allocated space
     */
    public long getAllocatedSpace() {
        return allocatedSpace;
    }


    /**
     * Sets the value of the allocatedSpace property.
     *
     * @param value the new allocated space
     */
    public void setAllocatedSpace(long value) {
        this.allocatedSpace = value;
    }


    /**
     * Gets the value of the usedSpace property.
     *
     * @return the used space
     */
    public long getUsedSpace() {
        return usedSpace;
    }


    /**
     * Sets the value of the usedSpace property.
     *
     * @param value the new used space
     */
    public void setUsedSpace(long value) {
        this.usedSpace = value;
    }


    /**
     * Gets the value of the freeSpace property.
     *
     * @return the free space
     */
    public long getFreeSpace() {
        return freeSpace;
    }


    /**
     * Sets the value of the freeSpace property.
     *
     * @param value the new free space
     */
    public void setFreeSpace(long value) {
        this.freeSpace = value;
    }


    /**
     * Gets the value of the savingVSRAID10 property.
     *
     * @return the saving VSRAID 10
     */
    public long getSavingVSRAID10() {
        return savingVSRAID10;
    }


    /**
     * Sets the value of the savingVSRAID10 property.
     *
     * @param value the new saving VSRAID 10
     */
    public void setSavingVSRAID10(long value) {
        this.savingVSRAID10 = value;
    }


    /**
     * Gets the value of the storageThreshold property.
     *
     * @return the storage threshold
     */
    public int getStorageThreshold() {
        return storageThreshold;
    }


    /**
     * Sets the value of the storageThreshold property.
     *
     * @param value the new storage threshold
     */
    public void setStorageThreshold(int value) {
        this.storageThreshold = value;
    }


    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTime() {
        return time;
    }


    /**
     * Sets the value of the time property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTime(String value) {
        this.time = value;
    }

}