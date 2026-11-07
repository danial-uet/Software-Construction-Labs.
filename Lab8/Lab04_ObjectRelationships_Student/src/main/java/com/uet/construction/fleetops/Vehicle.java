package com.uet.construction.fleetops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vehicle {
    private final String vin;
    private final String model;
    private final Engine engine; // Composition
    private final List<MaintenanceLog> maintenanceLogs; // Composition
    private Driver assignedDriver; // Aggregation

    // Restricted instantiation: builds Engine internally
    public Vehicle(String vin, String model, String engineNumber, int displacementCC, String fuelType) {
        this.vin = vin;
        this.model = model;
        this.engine = new Engine(engineNumber, displacementCC, fuelType);
        this.maintenanceLogs = new ArrayList<>();
    }

    public String getVin() { return vin; }
    public String getModel() { return model; }

    public Driver getAssignedDriver() { return assignedDriver; }
    public void assignDriver(Driver driver) { this.assignedDriver = driver; }

    // Encapsulated modification for maintenance records
    public void addMaintenanceRecord(String logId, String description, double cost) {
        this.maintenanceLogs.add(new MaintenanceLog(logId, description, cost));
    }

    // Defensive accessor for Engine
    public Engine getEngine() {
        return new Engine(this.engine);
    }

    // Defensive accessor for Maintenance History
    public List<MaintenanceLog> getMaintenanceHistory() {
        List<MaintenanceLog> deepCopies = new ArrayList<>();
        for (MaintenanceLog log : this.maintenanceLogs) {
            deepCopies.add(new MaintenanceLog(log));
        }
        return Collections.unmodifiableList(deepCopies);
    }

    @Override
    public String toString() {
        return "Vehicle{VIN='" + vin + "', Model='" + model + "', Engine=" + engine + ", Driver=" + assignedDriver + "}";
    }
}