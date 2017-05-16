/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.10 at 02:30:44 PM CST 
//

package com.dell.isg.smi.commons.model.server.inventory;

/**
 * The Class HwMemory.
 */
public class HwMemory {

    public HwMemory() {
        super();
    }

    protected long id;

    protected String fqdd;

    protected String bankLabel;

    protected String currentOperatingSpeed;

    protected String deviceDescription;

    protected String manufactureDate;

    protected String manufacturer;

    protected String memoryType;

    protected String model;

    protected String partNumber;

    protected String primaryStatus;

    protected String rank;

    protected String serialNumber;
    protected double size;
    protected double speed;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the fqdd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFqdd() {
        return fqdd;
    }


    /**
     * Sets the value of the fqdd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFqdd(String value) {
        this.fqdd = value;
    }


    /**
     * Gets the value of the bankLabel property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBankLabel() {
        return bankLabel;
    }


    /**
     * Sets the value of the bankLabel property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBankLabel(String value) {
        this.bankLabel = value;
    }


    /**
     * Gets the value of the currentOperatingSpeed property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCurrentOperatingSpeed() {
        return currentOperatingSpeed;
    }


    /**
     * Sets the value of the currentOperatingSpeed property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCurrentOperatingSpeed(String value) {
        this.currentOperatingSpeed = value;
    }


    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }


    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }


    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getManufactureDate() {
        return manufactureDate;
    }


    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setManufactureDate(String value) {
        this.manufactureDate = value;
    }


    /**
     * Gets the value of the manufacturer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }


    /**
     * Gets the value of the memoryType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMemoryType() {
        return memoryType;
    }


    /**
     * Sets the value of the memoryType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMemoryType(String value) {
        this.memoryType = value;
    }


    /**
     * Gets the value of the model property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the value of the model property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setModel(String value) {
        this.model = value;
    }


    /**
     * Gets the value of the partNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the value of the partNumber property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }


    /**
     * Gets the value of the primaryStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPrimaryStatus() {
        return primaryStatus;
    }


    /**
     * Sets the value of the primaryStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPrimaryStatus(String value) {
        this.primaryStatus = value;
    }


    /**
     * Gets the value of the rank property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRank() {
        return rank;
    }


    /**
     * Sets the value of the rank property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRank(String value) {
        this.rank = value;
    }


    /**
     * Gets the value of the serialNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }


    /**
     * Gets the value of the size property.
     *
     * @return the size
     */
    public double getSize() {
        return size;
    }


    /**
     * Sets the value of the size property.
     *
     * @param value the new size
     */
    public void setSize(double value) {
        this.size = value;
    }


    /**
     * Gets the value of the speed property.
     *
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }


    /**
     * Sets the value of the speed property.
     *
     * @param value the new speed
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

}