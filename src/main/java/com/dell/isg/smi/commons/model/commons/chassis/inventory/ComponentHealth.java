/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.17 at 12:15:24 AM CDT 
//

package com.dell.isg.smi.commons.model.commons.chassis.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ComponentHealth.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentHealth", propOrder = { "id", "name", "health" })
public class ComponentHealth {

    /**
     * Instantiates a new component health.
     */
    public ComponentHealth() {
        super();
    }

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String health;


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
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the health property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHealth() {
        return health;
    }


    /**
     * Sets the value of the health property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHealth(String value) {
        this.health = value;
    }

}
