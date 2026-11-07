package com.uet.construction.fleetops;

public class MaintenanceLog {
    private String logId;
    private String serviceDescription;
    private double serviceCost;

    public MaintenanceLog(String logId, String serviceDescription, double serviceCost) {
        this.logId = logId;
        this.serviceDescription = serviceDescription;
        this.serviceCost = serviceCost;
    }

    // Copy constructor for defensive duplication (Task 3 requirement)
    public MaintenanceLog(MaintenanceLog other) {
        if (other != null) {
            this.logId = other.logId;
            this.serviceDescription = other.serviceDescription;
            this.serviceCost = other.serviceCost;
        }
    }

    public String getLogId() { return logId; }
    public String getServiceDescription() { return serviceDescription; }
    public double getServiceCost() { return serviceCost; }

    @Override
    public String toString() {
        return "MaintenanceLog{ID='" + logId + "', Desc='" + serviceDescription + "', Cost=" + serviceCost + "}";
    }
}