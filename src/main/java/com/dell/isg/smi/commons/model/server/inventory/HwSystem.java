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
 * The Class HwSystem.
 */
public class HwSystem {

    public HwSystem() {
        super();
    }

    protected String id;
    protected String activePowerPolicy;
    protected String assetTag;
    protected String biosReleaseDate;
    protected String biosVersionString;
    protected String baseBoardChassisSlot;
    protected String boardPartNumber;
    protected String boardSerialNumber;
    protected String cmcip;
    protected String bladeGeometry;
    protected String cpldVersion;
    protected String cpuRollupStatus;
    protected String caption;
    protected String chassisName;
    protected String chassisModel;
    protected String deviceDescription;
    protected String chassisServiceTag;
    protected String chassisSystemHeight;
    protected String currentRollupStatus;
    protected String estimatedSystemAirflow;
    protected String estimatedExhaustTemperature;
    protected String expressServiceCode;
    protected String elementName;
    protected String fqdd;
    protected String fanRollupStatus;
    protected String batteryRollupStatus;
    protected String generation;
    protected String hostName;
    protected String instanceID;
    protected String idsdmRollupStatus;
    protected String intrusionRollupStatus;
    protected String lastSystemInventoryTime;
    protected String lastUpdateTime;
    protected String licensingRollupStatus;
    protected String lifecycleControllerVersion;
    protected String manufacturer;
    protected String maxCpuSockets;
    protected String maxDimmSlots;
    protected String maxPcieSlots;
    protected String memoryOperationMode;
    protected String memoryRollupStatus;
    protected String model;
    protected String nodeId;
    protected String psRollupStatus;
    protected String platformGuid;
    protected String populatedCpuSockets;
    protected String populatedDimmSlots;
    protected String populatedPcieSlots;
    protected String powerCap;
    protected String powerCapEnabledState;
    protected String powerState;
    protected String primaryStatus;
    protected String sdCardRollupStatus;
    protected String rollupStatus;
    protected String serverAllocation;
    protected String serviceTag;
    protected String storageRollupStatus;
    protected String sysMemErrorInfo;
    protected String sysMemErrorMethodology;
    protected String sysMemFailOverState;
    protected String sysMemLocation;
    protected String sysMemPrimaryStatus;
    protected double sysMemTotalSize;
    protected String sysMemMaxCapacitySize;
    protected String systemGeneration;
    protected String systemID;
    protected String systemRevision;
    protected String tempRollupStatus;
    protected String tempStatisticsRollupStatus;
    protected String uuid;
    protected String voltRollupStatus;
    protected String smbiosGUID;


    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the active power policy.
     *
     * @return the active power policy
     */
    public String getActivePowerPolicy() {
        return activePowerPolicy;
    }


    /**
     * Sets the active power policy.
     *
     * @param activePowerPolicy the new active power policy
     */
    public void setActivePowerPolicy(String activePowerPolicy) {
        this.activePowerPolicy = activePowerPolicy;
    }


    /**
     * Gets the asset tag.
     *
     * @return the asset tag
     */
    public String getAssetTag() {
        return assetTag;
    }


    /**
     * Sets the asset tag.
     *
     * @param assetTag the new asset tag
     */
    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }


    /**
     * Gets the bios release date.
     *
     * @return the bios release date
     */
    public String getBiosReleaseDate() {
        return biosReleaseDate;
    }


    /**
     * Sets the bios release date.
     *
     * @param biosReleaseDate the new bios release date
     */
    public void setBiosReleaseDate(String biosReleaseDate) {
        this.biosReleaseDate = biosReleaseDate;
    }


    /**
     * Gets the bios version string.
     *
     * @return the bios version string
     */
    public String getBiosVersionString() {
        return biosVersionString;
    }


    /**
     * Sets the bios version string.
     *
     * @param biosVersionString the new bios version string
     */
    public void setBiosVersionString(String biosVersionString) {
        this.biosVersionString = biosVersionString;
    }


    /**
     * Gets the base board chassis slot.
     *
     * @return the base board chassis slot
     */
    public String getBaseBoardChassisSlot() {
        return baseBoardChassisSlot;
    }


    /**
     * Sets the base board chassis slot.
     *
     * @param baseBoardChassisSlot the new base board chassis slot
     */
    public void setBaseBoardChassisSlot(String baseBoardChassisSlot) {
        this.baseBoardChassisSlot = baseBoardChassisSlot;
    }


    /**
     * Gets the board part number.
     *
     * @return the board part number
     */
    public String getBoardPartNumber() {
        return boardPartNumber;
    }


    /**
     * Sets the board part number.
     *
     * @param boardPartNumber the new board part number
     */
    public void setBoardPartNumber(String boardPartNumber) {
        this.boardPartNumber = boardPartNumber;
    }


    /**
     * Gets the board serial number.
     *
     * @return the board serial number
     */
    public String getBoardSerialNumber() {
        return boardSerialNumber;
    }


    /**
     * Sets the board serial number.
     *
     * @param boardSerialNumber the new board serial number
     */
    public void setBoardSerialNumber(String boardSerialNumber) {
        this.boardSerialNumber = boardSerialNumber;
    }


    /**
     * Gets the cmcip.
     *
     * @return the cmcip
     */
    public String getCmcip() {
        return cmcip;
    }


    /**
     * Sets the cmcip.
     *
     * @param cmcip the new cmcip
     */
    public void setCmcip(String cmcip) {
        this.cmcip = cmcip;
    }


    /**
     * Gets the blade geometry.
     *
     * @return the blade geometry
     */
    public String getBladeGeometry() {
        return bladeGeometry;
    }


    /**
     * Sets the blade geometry.
     *
     * @param bladeGeometry the new blade geometry
     */
    public void setBladeGeometry(String bladeGeometry) {
        this.bladeGeometry = bladeGeometry;
    }


    /**
     * Gets the cpld version.
     *
     * @return the cpld version
     */
    public String getCpldVersion() {
        return cpldVersion;
    }


    /**
     * Sets the cpld version.
     *
     * @param cpldVersion the new cpld version
     */
    public void setCpldVersion(String cpldVersion) {
        this.cpldVersion = cpldVersion;
    }


    /**
     * Gets the cpu rollup status.
     *
     * @return the cpu rollup status
     */
    public String getCpuRollupStatus() {
        return cpuRollupStatus;
    }


    /**
     * Sets the cpu rollup status.
     *
     * @param cpuRollupStatus the new cpu rollup status
     */
    public void setCpuRollupStatus(String cpuRollupStatus) {
        this.cpuRollupStatus = cpuRollupStatus;
    }


    /**
     * Gets the caption.
     *
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }


    /**
     * Sets the caption.
     *
     * @param caption the new caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }


    /**
     * Gets the chassis name.
     *
     * @return the chassis name
     */
    public String getChassisName() {
        return chassisName;
    }


    /**
     * Sets the chassis name.
     *
     * @param chassisName the new chassis name
     */
    public void setChassisName(String chassisName) {
        this.chassisName = chassisName;
    }


    /**
     * Gets the chassis model.
     *
     * @return the chassis model
     */
    public String getChassisModel() {
        return chassisModel;
    }


    /**
     * Sets the chassis model.
     *
     * @param chassisModel the new chassis model
     */
    public void setChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
    }


    /**
     * Gets the device description.
     *
     * @return the device description
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }


    /**
     * Sets the device description.
     *
     * @param deviceDescription the new device description
     */
    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }


    /**
     * Gets the chassis service tag.
     *
     * @return the chassis service tag
     */
    public String getChassisServiceTag() {
        return chassisServiceTag;
    }


    /**
     * Sets the chassis service tag.
     *
     * @param chassisServiceTag the new chassis service tag
     */
    public void setChassisServiceTag(String chassisServiceTag) {
        this.chassisServiceTag = chassisServiceTag;
    }


    /**
     * Gets the chassis system height.
     *
     * @return the chassis system height
     */
    public String getChassisSystemHeight() {
        return chassisSystemHeight;
    }


    /**
     * Sets the chassis system height.
     *
     * @param chassisSystemHeight the new chassis system height
     */
    public void setChassisSystemHeight(String chassisSystemHeight) {
        this.chassisSystemHeight = chassisSystemHeight;
    }


    /**
     * Gets the current rollup status.
     *
     * @return the current rollup status
     */
    public String getCurrentRollupStatus() {
        return currentRollupStatus;
    }


    /**
     * Sets the current rollup status.
     *
     * @param currentRollupStatus the new current rollup status
     */
    public void setCurrentRollupStatus(String currentRollupStatus) {
        this.currentRollupStatus = currentRollupStatus;
    }


    /**
     * Gets the estimated system airflow.
     *
     * @return the estimated system airflow
     */
    public String getEstimatedSystemAirflow() {
        return estimatedSystemAirflow;
    }


    /**
     * Sets the estimated system airflow.
     *
     * @param estimatedSystemAirflow the new estimated system airflow
     */
    public void setEstimatedSystemAirflow(String estimatedSystemAirflow) {
        this.estimatedSystemAirflow = estimatedSystemAirflow;
    }


    /**
     * Gets the estimated exhaust temperature.
     *
     * @return the estimated exhaust temperature
     */
    public String getEstimatedExhaustTemperature() {
        return estimatedExhaustTemperature;
    }


    /**
     * Sets the estimated exhaust temperature.
     *
     * @param estimatedExhaustTemperature the new estimated exhaust temperature
     */
    public void setEstimatedExhaustTemperature(String estimatedExhaustTemperature) {
        this.estimatedExhaustTemperature = estimatedExhaustTemperature;
    }


    /**
     * Gets the express service code.
     *
     * @return the express service code
     */
    public String getExpressServiceCode() {
        return expressServiceCode;
    }


    /**
     * Sets the express service code.
     *
     * @param expressServiceCode the new express service code
     */
    public void setExpressServiceCode(String expressServiceCode) {
        this.expressServiceCode = expressServiceCode;
    }


    /**
     * Gets the element name.
     *
     * @return the element name
     */
    public String getElementName() {
        return elementName;
    }


    /**
     * Sets the element name.
     *
     * @param elementName the new element name
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the fqdd.
     *
     * @return the fqdd
     */
    public String getFqdd() {
        return fqdd;
    }


    /**
     * Sets the fqdd.
     *
     * @param fqdd the new fqdd
     */
    public void setFqdd(String fqdd) {
        this.fqdd = fqdd;
    }


    /**
     * Gets the fan rollup status.
     *
     * @return the fan rollup status
     */
    public String getFanRollupStatus() {
        return fanRollupStatus;
    }


    /**
     * Sets the fan rollup status.
     *
     * @param fanRollupStatus the new fan rollup status
     */
    public void setFanRollupStatus(String fanRollupStatus) {
        this.fanRollupStatus = fanRollupStatus;
    }


    /**
     * Gets the battery rollup status.
     *
     * @return the battery rollup status
     */
    public String getBatteryRollupStatus() {
        return batteryRollupStatus;
    }


    /**
     * Sets the battery rollup status.
     *
     * @param batteryRollupStatus the new battery rollup status
     */
    public void setBatteryRollupStatus(String batteryRollupStatus) {
        this.batteryRollupStatus = batteryRollupStatus;
    }


    /**
     * Gets the generation.
     *
     * @return the generation
     */
    public String getGeneration() {
        return generation;
    }


    /**
     * Sets the generation.
     *
     * @param generation the new generation
     */
    public void setGeneration(String generation) {
        this.generation = generation;
    }


    /**
     * Gets the host name.
     *
     * @return the host name
     */
    public String getHostName() {
        return hostName;
    }


    /**
     * Sets the host name.
     *
     * @param hostName the new host name
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the instance ID.
     *
     * @return the instance ID
     */
    public String getInstanceID() {
        return instanceID;
    }


    /**
     * Sets the instance ID.
     *
     * @param instanceID the new instance ID
     */
    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }


    /**
     * Gets the idsdm rollup status.
     *
     * @return the idsdm rollup status
     */
    public String getIdsdmRollupStatus() {
        return idsdmRollupStatus;
    }


    /**
     * Sets the idsdm rollup status.
     *
     * @param idsdmRollupStatus the new idsdm rollup status
     */
    public void setIdsdmRollupStatus(String idsdmRollupStatus) {
        this.idsdmRollupStatus = idsdmRollupStatus;
    }


    /**
     * Gets the intrusion rollup status.
     *
     * @return the intrusion rollup status
     */
    public String getIntrusionRollupStatus() {
        return intrusionRollupStatus;
    }


    /**
     * Sets the intrusion rollup status.
     *
     * @param intrusionRollupStatus the new intrusion rollup status
     */
    public void setIntrusionRollupStatus(String intrusionRollupStatus) {
        this.intrusionRollupStatus = intrusionRollupStatus;
    }


    /**
     * Gets the last system inventory time.
     *
     * @return the last system inventory time
     */
    public String getLastSystemInventoryTime() {
        return lastSystemInventoryTime;
    }


    /**
     * Sets the last system inventory time.
     *
     * @param lastSystemInventoryTime the new last system inventory time
     */
    public void setLastSystemInventoryTime(String lastSystemInventoryTime) {
        this.lastSystemInventoryTime = lastSystemInventoryTime;
    }


    /**
     * Gets the last update time.
     *
     * @return the last update time
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the last update time.
     *
     * @param lastUpdateTime the new last update time
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the licensing rollup status.
     *
     * @return the licensing rollup status
     */
    public String getLicensingRollupStatus() {
        return licensingRollupStatus;
    }


    /**
     * Sets the licensing rollup status.
     *
     * @param licensingRollupStatus the new licensing rollup status
     */
    public void setLicensingRollupStatus(String licensingRollupStatus) {
        this.licensingRollupStatus = licensingRollupStatus;
    }


    /**
     * Gets the lifecycle controller version.
     *
     * @return the lifecycle controller version
     */
    public String getLifecycleControllerVersion() {
        return lifecycleControllerVersion;
    }


    /**
     * Sets the lifecycle controller version.
     *
     * @param lifecycleControllerVersion the new lifecycle controller version
     */
    public void setLifecycleControllerVersion(String lifecycleControllerVersion) {
        this.lifecycleControllerVersion = lifecycleControllerVersion;
    }


    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the max cpu sockets.
     *
     * @return the max cpu sockets
     */
    public String getMaxCpuSockets() {
        return maxCpuSockets;
    }


    /**
     * Sets the max cpu sockets.
     *
     * @param maxCpuSockets the new max cpu sockets
     */
    public void setMaxCpuSockets(String maxCpuSockets) {
        this.maxCpuSockets = maxCpuSockets;
    }


    /**
     * Gets the max dimm slots.
     *
     * @return the max dimm slots
     */
    public String getMaxDimmSlots() {
        return maxDimmSlots;
    }


    /**
     * Sets the max dimm slots.
     *
     * @param maxDimmSlots the new max dimm slots
     */
    public void setMaxDimmSlots(String maxDimmSlots) {
        this.maxDimmSlots = maxDimmSlots;
    }


    /**
     * Gets the max pcie slots.
     *
     * @return the max pcie slots
     */
    public String getMaxPcieSlots() {
        return maxPcieSlots;
    }


    /**
     * Sets the max pcie slots.
     *
     * @param maxPcieSlots the new max pcie slots
     */
    public void setMaxPcieSlots(String maxPcieSlots) {
        this.maxPcieSlots = maxPcieSlots;
    }


    /**
     * Gets the memory operation mode.
     *
     * @return the memory operation mode
     */
    public String getMemoryOperationMode() {
        return memoryOperationMode;
    }


    /**
     * Sets the memory operation mode.
     *
     * @param memoryOperationMode the new memory operation mode
     */
    public void setMemoryOperationMode(String memoryOperationMode) {
        this.memoryOperationMode = memoryOperationMode;
    }


    /**
     * Gets the memory rollup status.
     *
     * @return the memory rollup status
     */
    public String getMemoryRollupStatus() {
        return memoryRollupStatus;
    }


    /**
     * Sets the memory rollup status.
     *
     * @param memoryRollupStatus the new memory rollup status
     */
    public void setMemoryRollupStatus(String memoryRollupStatus) {
        this.memoryRollupStatus = memoryRollupStatus;
    }


    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
    }


    /**
     * Gets the node id.
     *
     * @return the node id
     */
    public String getNodeId() {
        return nodeId;
    }


    /**
     * Sets the node id.
     *
     * @param nodeId the new node id
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }


    /**
     * Gets the ps rollup status.
     *
     * @return the ps rollup status
     */
    public String getPsRollupStatus() {
        return psRollupStatus;
    }


    /**
     * Sets the ps rollup status.
     *
     * @param psRollupStatus the new ps rollup status
     */
    public void setPsRollupStatus(String psRollupStatus) {
        this.psRollupStatus = psRollupStatus;
    }


    /**
     * Gets the platform guid.
     *
     * @return the platform guid
     */
    public String getPlatformGuid() {
        return platformGuid;
    }


    /**
     * Sets the platform guid.
     *
     * @param platformGuid the new platform guid
     */
    public void setPlatformGuid(String platformGuid) {
        this.platformGuid = platformGuid;
    }


    /**
     * Gets the populated cpu sockets.
     *
     * @return the populated cpu sockets
     */
    public String getPopulatedCpuSockets() {
        return populatedCpuSockets;
    }


    /**
     * Sets the populated cpu sockets.
     *
     * @param populatedCpuSockets the new populated cpu sockets
     */
    public void setPopulatedCpuSockets(String populatedCpuSockets) {
        this.populatedCpuSockets = populatedCpuSockets;
    }


    /**
     * Gets the populated dimm slots.
     *
     * @return the populated dimm slots
     */
    public String getPopulatedDimmSlots() {
        return populatedDimmSlots;
    }


    /**
     * Sets the populated dimm slots.
     *
     * @param populatedDimmSlots the new populated dimm slots
     */
    public void setPopulatedDimmSlots(String populatedDimmSlots) {
        this.populatedDimmSlots = populatedDimmSlots;
    }


    /**
     * Gets the populated pcie slots.
     *
     * @return the populated pcie slots
     */
    public String getPopulatedPcieSlots() {
        return populatedPcieSlots;
    }


    /**
     * Sets the populated pcie slots.
     *
     * @param populatedPcieSlots the new populated pcie slots
     */
    public void setPopulatedPcieSlots(String populatedPcieSlots) {
        this.populatedPcieSlots = populatedPcieSlots;
    }


    /**
     * Gets the power cap.
     *
     * @return the power cap
     */
    public String getPowerCap() {
        return powerCap;
    }


    /**
     * Sets the power cap.
     *
     * @param powerCap the new power cap
     */
    public void setPowerCap(String powerCap) {
        this.powerCap = powerCap;
    }


    /**
     * Gets the power cap enabled state.
     *
     * @return the power cap enabled state
     */
    public String getPowerCapEnabledState() {
        return powerCapEnabledState;
    }


    /**
     * Sets the power cap enabled state.
     *
     * @param powerCapEnabledState the new power cap enabled state
     */
    public void setPowerCapEnabledState(String powerCapEnabledState) {
        this.powerCapEnabledState = powerCapEnabledState;
    }


    /**
     * Gets the power state.
     *
     * @return the power state
     */
    public String getPowerState() {
        return powerState;
    }


    /**
     * Sets the power state.
     *
     * @param powerState the new power state
     */
    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the primary status.
     *
     * @return the primary status
     */
    public String getPrimaryStatus() {
        return primaryStatus;
    }


    /**
     * Sets the primary status.
     *
     * @param primaryStatus the new primary status
     */
    public void setPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
    }


    /**
     * Gets the sd card rollup status.
     *
     * @return the sd card rollup status
     */
    public String getSdCardRollupStatus() {
        return sdCardRollupStatus;
    }


    /**
     * Sets the sd card rollup status.
     *
     * @param sdCardRollupStatus the new sd card rollup status
     */
    public void setSdCardRollupStatus(String sdCardRollupStatus) {
        this.sdCardRollupStatus = sdCardRollupStatus;
    }


    /**
     * Gets the rollup status.
     *
     * @return the rollup status
     */
    public String getRollupStatus() {
        return rollupStatus;
    }


    /**
     * Sets the rollup status.
     *
     * @param rollupStatus the new rollup status
     */
    public void setRollupStatus(String rollupStatus) {
        this.rollupStatus = rollupStatus;
    }


    /**
     * Gets the server allocation.
     *
     * @return the server allocation
     */
    public String getServerAllocation() {
        return serverAllocation;
    }


    /**
     * Sets the server allocation.
     *
     * @param serverAllocation the new server allocation
     */
    public void setServerAllocation(String serverAllocation) {
        this.serverAllocation = serverAllocation;
    }


    /**
     * Gets the service tag.
     *
     * @return the service tag
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the service tag.
     *
     * @param serviceTag the new service tag
     */
    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }


    /**
     * Gets the storage rollup status.
     *
     * @return the storage rollup status
     */
    public String getStorageRollupStatus() {
        return storageRollupStatus;
    }


    /**
     * Sets the storage rollup status.
     *
     * @param storageRollupStatus the new storage rollup status
     */
    public void setStorageRollupStatus(String storageRollupStatus) {
        this.storageRollupStatus = storageRollupStatus;
    }


    /**
     * Gets the sys mem error info.
     *
     * @return the sys mem error info
     */
    public String getSysMemErrorInfo() {
        return sysMemErrorInfo;
    }


    /**
     * Sets the sys mem error info.
     *
     * @param sysMemErrorInfo the new sys mem error info
     */
    public void setSysMemErrorInfo(String sysMemErrorInfo) {
        this.sysMemErrorInfo = sysMemErrorInfo;
    }


    /**
     * Gets the sys mem error methodology.
     *
     * @return the sys mem error methodology
     */
    public String getSysMemErrorMethodology() {
        return sysMemErrorMethodology;
    }


    /**
     * Sets the sys mem error methodology.
     *
     * @param sysMemErrorMethodology the new sys mem error methodology
     */
    public void setSysMemErrorMethodology(String sysMemErrorMethodology) {
        this.sysMemErrorMethodology = sysMemErrorMethodology;
    }


    /**
     * Gets the sys mem fail over state.
     *
     * @return the sys mem fail over state
     */
    public String getSysMemFailOverState() {
        return sysMemFailOverState;
    }


    /**
     * Sets the sys mem fail over state.
     *
     * @param sysMemFailOverState the new sys mem fail over state
     */
    public void setSysMemFailOverState(String sysMemFailOverState) {
        this.sysMemFailOverState = sysMemFailOverState;
    }


    /**
     * Gets the sys mem location.
     *
     * @return the sys mem location
     */
    public String getSysMemLocation() {
        return sysMemLocation;
    }


    /**
     * Sets the sys mem location.
     *
     * @param sysMemLocation the new sys mem location
     */
    public void setSysMemLocation(String sysMemLocation) {
        this.sysMemLocation = sysMemLocation;
    }


    /**
     * Gets the sys mem primary status.
     *
     * @return the sys mem primary status
     */
    public String getSysMemPrimaryStatus() {
        return sysMemPrimaryStatus;
    }


    /**
     * Sets the sys mem primary status.
     *
     * @param sysMemPrimaryStatus the new sys mem primary status
     */
    public void setSysMemPrimaryStatus(String sysMemPrimaryStatus) {
        this.sysMemPrimaryStatus = sysMemPrimaryStatus;
    }


    /**
     * Gets the sys mem total size.
     *
     * @return the sys mem total size
     */
    public double getSysMemTotalSize() {
        return sysMemTotalSize;
    }


    /**
     * Sets the sys mem total size.
     *
     * @param sysMemTotalSize the new sys mem total size
     */
    public void setSysMemTotalSize(double sysMemTotalSize) {
        this.sysMemTotalSize = sysMemTotalSize;
    }


    /**
     * Gets the sys mem max capacity size.
     *
     * @return the sys mem max capacity size
     */
    public String getSysMemMaxCapacitySize() {
        return sysMemMaxCapacitySize;
    }


    /**
     * Sets the sys mem max capacity size.
     *
     * @param sysMemMaxCapacitySize the new sys mem max capacity size
     */
    public void setSysMemMaxCapacitySize(String sysMemMaxCapacitySize) {
        this.sysMemMaxCapacitySize = sysMemMaxCapacitySize;
    }


    /**
     * Gets the system generation.
     *
     * @return the system generation
     */
    public String getSystemGeneration() {
        return systemGeneration;
    }


    /**
     * Sets the system generation.
     *
     * @param systemGeneration the new system generation
     */
    public void setSystemGeneration(String systemGeneration) {
        this.systemGeneration = systemGeneration;
    }


    /**
     * Gets the system ID.
     *
     * @return the system ID
     */
    public String getSystemID() {
        return systemID;
    }


    /**
     * Sets the system ID.
     *
     * @param systemID the new system ID
     */
    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }


    /**
     * Gets the system revision.
     *
     * @return the system revision
     */
    public String getSystemRevision() {
        return systemRevision;
    }


    /**
     * Sets the system revision.
     *
     * @param systemRevision the new system revision
     */
    public void setSystemRevision(String systemRevision) {
        this.systemRevision = systemRevision;
    }


    /**
     * Gets the temp rollup status.
     *
     * @return the temp rollup status
     */
    public String getTempRollupStatus() {
        return tempRollupStatus;
    }


    /**
     * Sets the temp rollup status.
     *
     * @param tempRollupStatus the new temp rollup status
     */
    public void setTempRollupStatus(String tempRollupStatus) {
        this.tempRollupStatus = tempRollupStatus;
    }


    /**
     * Gets the temp statistics rollup status.
     *
     * @return the temp statistics rollup status
     */
    public String getTempStatisticsRollupStatus() {
        return tempStatisticsRollupStatus;
    }


    /**
     * Sets the temp statistics rollup status.
     *
     * @param tempStatisticsRollupStatus the new temp statistics rollup status
     */
    public void setTempStatisticsRollupStatus(String tempStatisticsRollupStatus) {
        this.tempStatisticsRollupStatus = tempStatisticsRollupStatus;
    }


    /**
     * Gets the uuid.
     *
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid.
     *
     * @param uuid the new uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the volt rollup status.
     *
     * @return the volt rollup status
     */
    public String getVoltRollupStatus() {
        return voltRollupStatus;
    }


    /**
     * Sets the volt rollup status.
     *
     * @param voltRollupStatus the new volt rollup status
     */
    public void setVoltRollupStatus(String voltRollupStatus) {
        this.voltRollupStatus = voltRollupStatus;
    }


    /**
     * Gets the smbios GUID.
     *
     * @return the smbios GUID
     */
    public String getSmbiosGUID() {
        return smbiosGUID;
    }


    /**
     * Sets the smbios GUID.
     *
     * @param smbiosGUID the new smbios GUID
     */
    public void setSmbiosGUID(String smbiosGUID) {
        this.smbiosGUID = smbiosGUID;
    }
}
