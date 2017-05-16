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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ChassisDetail.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisDetail", propOrder = { "chassisPowerSupply", "chassisIkvm", "chassisControllers", "servers", "chassisIoms", "chassisStashStorages", "chassisFans", "chassisPcis", "chassisTemperatureSensors" })
public class ChassisDetail extends ChassisSummary {

    /**
     * Instantiates a new chassis detail.
     */
    public ChassisDetail() {
        super();
    }

    protected List<ChassisPowerSupply> chassisPowerSupply;
    protected List<ChassisIkvmModel> chassisIkvm;
    protected List<ChassisControllers> chassisControllers;
    protected List<ChassisServerModel> servers;
    protected List<ChassisIomModel> chassisIoms;
    protected List<ChassisStashStorage> chassisStashStorages;
    protected List<ChassisFan> chassisFans;
    protected List<ChassisPci> chassisPcis;
    protected List<ChassisTemperatureSensor> chassisTemperatureSensors;



    /**
     * Gets the chassis power supply.
     *
     * @return the chassis power supply
     */
    public List<ChassisPowerSupply> getChassisPowerSupply() {
        if (chassisPowerSupply == null) {
            chassisPowerSupply = new ArrayList<ChassisPowerSupply>();
        }
        return this.chassisPowerSupply;
    }


    /**
     * Gets the chassis ikvm.
     *
     * @return the chassis ikvm
     */
    public List<ChassisIkvmModel> getChassisIkvm() {
        if (chassisIkvm == null) {
            chassisIkvm = new ArrayList<ChassisIkvmModel>();
        }
        return this.chassisIkvm;
    }



    /**
     * Gets the chassis controllers.
     *
     * @return the chassis controllers
     */
    public List<ChassisControllers> getChassisControllers() {
        if (chassisControllers == null) {
            chassisControllers = new ArrayList<ChassisControllers>();
        }
        return this.chassisControllers;
    }


    /**
     * Gets the servers.
     *
     * @return the servers
     */
    public List<ChassisServerModel> getServers() {
        if (servers == null) {
            servers = new ArrayList<ChassisServerModel>();
        }
        return this.servers;
    }


    /**
     * Gets the chassis ioms.
     *
     * @return the chassis ioms
     */
    public List<ChassisIomModel> getChassisIoms() {
        if (chassisIoms == null) {
            chassisIoms = new ArrayList<ChassisIomModel>();
        }
        return this.chassisIoms;
    }


    /**
     * Gets the chassis stash storages.
     *
     * @return the chassis stash storages
     */
    public List<ChassisStashStorage> getChassisStashStorages() {
        if (chassisStashStorages == null) {
            chassisStashStorages = new ArrayList<ChassisStashStorage>();
        }
        return this.chassisStashStorages;
    }


    /**
     * Gets the chassis fans.
     *
     * @return the chassis fans
     */
    public List<ChassisFan> getChassisFans() {
        if (chassisFans == null) {
            chassisFans = new ArrayList<ChassisFan>();
        }
        return this.chassisFans;
    }


    /**
     * Gets the chassis pcis.
     *
     * @return the chassis pcis
     */
    public List<ChassisPci> getChassisPcis() {
        if (chassisPcis == null) {
            chassisPcis = new ArrayList<ChassisPci>();
        }
        return this.chassisPcis;
    }


    /**
     * Gets the chassis temperature sensors.
     *
     * @return the chassis temperature sensors
     */
    public List<ChassisTemperatureSensor> getChassisTemperatureSensors() {
        if (chassisTemperatureSensors == null) {
            chassisTemperatureSensors = new ArrayList<ChassisTemperatureSensor>();
        }
        return this.chassisTemperatureSensors;
    }

}