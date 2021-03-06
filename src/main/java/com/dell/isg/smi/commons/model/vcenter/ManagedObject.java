/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:12 PM CDT 
//

package com.dell.isg.smi.commons.model.vcenter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ManagedObject.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedObject", propOrder = { "managedObjectType", "managedObjectId", "name", "children" })
@XmlSeeAlso({ VCenterSummary.class, VirtualMachine.class, Folder.class, ResourcePool.class, Cluster.class, Datacenter.class, HostSystem.class, Network.class })
public abstract class ManagedObject {

    @XmlElement(required = true)
    protected ManagedObjectType managedObjectType;
    @XmlElement(required = true)
    protected String managedObjectId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected List<ManagedObject> children;


    /**
     * Gets the value of the managedObjectType property.
     * 
     * @return possible object is {@link ManagedObjectType }
     * 
     */
    public ManagedObjectType getManagedObjectType() {
        return managedObjectType;
    }


    /**
     * Sets the value of the managedObjectType property.
     * 
     * @param value allowed object is {@link ManagedObjectType }
     * 
     */
    public void setManagedObjectType(ManagedObjectType value) {
        this.managedObjectType = value;
    }


    /**
     * Gets the value of the managedObjectId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getManagedObjectId() {
        return managedObjectId;
    }


    /**
     * Sets the value of the managedObjectId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setManagedObjectId(String value) {
        this.managedObjectId = value;
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
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ManagedObject }
     *
     * @return the children
     */
    public List<ManagedObject> getChildren() {
        if (children == null) {
            children = new ArrayList<ManagedObject>();
        }
        return this.children;
    }

}
