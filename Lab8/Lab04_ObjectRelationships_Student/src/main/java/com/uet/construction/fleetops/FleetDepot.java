package com.uet.construction.fleetops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetDepot {
    private String depotId;
    private String locationName;
    private List<Vehicle> assignedVehicles;

    public FleetDepot(String depotId, String locationName) {
        this.depotId = depotId;
        this.locationName = locationName;
        this.assignedVehicles = new ArrayList<>();
    }

    public void assignVehicle(Vehicle vehicle) {
        if (vehicle != null && !assignedVehicles.contains(vehicle)) {
            assignedVehicles.add(vehicle);
        }
    }

    public void releaseVehicle(Vehicle vehicle) {
        assignedVehicles.remove(vehicle);
    }

    public List<Vehicle> getAssignedVehicles() {
        return Collections.unmodifiableList(assignedVehicles);
    }

    public String getDepotId() { return depotId; }
    public String getLocationName() { return locationName; }

    @Override
    public String toString() {
        return "FleetDepot{ID='" + depotId + "', Location='" + locationName + "', Vehicles=" + assignedVehicles.size() + "}";
    }
}