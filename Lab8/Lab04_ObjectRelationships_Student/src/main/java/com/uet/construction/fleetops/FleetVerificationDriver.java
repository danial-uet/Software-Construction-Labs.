package com.uet.construction.fleetops;

import java.util.List;

public class FleetVerificationDriver {
    public static void main(String[] args) {
        System.out.println("=== Test Case A: Aggregation Lifecycle Independence ===");
        Driver driver1 = new Driver("D001", "Alice Smith", "LIC-98765");
        Driver driver2 = new Driver("D002", "Bob Jones", "LIC-54321");

        Vehicle vehicle1 = new Vehicle("VIN12345", "Tesla Semi", "ENG-999", 0, "Electric");
        Vehicle vehicle2 = new Vehicle("VIN67890", "Volvo FH", "ENG-888", 13000, "Diesel");

        vehicle1.assignDriver(driver1);
        vehicle2.assignDriver(driver2);

        FleetDepot depot = new FleetDepot("DEPOT-01", "Islamabad Central");
        depot.assignVehicle(vehicle1);
        depot.assignVehicle(vehicle2);

        System.out.println("Before depot destruction: Depot vehicles count = " + depot.getAssignedVehicles().size());

        // Nullify depot reference to simulate facility closure
        depot = null;
        System.gc();

        // Prove vehicles and drivers remain active and intact in heap memory
        System.out.println("After depot destruction (Lifecycle Independence verified):");
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println("Driver 1: " + driver1);
        System.out.println("Driver 2: " + driver2);

        System.out.println("\n=== Test Case B: Composition Lifetime Binding & Encapsulation ===");
        Vehicle vehicle3 = new Vehicle("VIN11111", "Freightliner", "ENG-777", 15000, "Diesel");

        // Test Engine encapsulation via defensive copying
        Engine leakedEngine = vehicle3.getEngine();
        System.out.println("Original Engine CC: " + vehicle3.getEngine().getDisplacementCC());
        leakedEngine.setDisplacementCC(9999);
        System.out.println("Leaked Engine mutated CC: " + leakedEngine.getDisplacementCC());
        System.out.println("Vehicle Engine CC after leak attempt (Defensive Copying verified): " + vehicle3.getEngine().getDisplacementCC());

        // Test Maintenance History encapsulation
        vehicle3.addMaintenanceRecord("LOG-01", "Oil Change", 150.0);
        vehicle3.addMaintenanceRecord("LOG-02", "Brake Inspection", 300.0);

        List<MaintenanceLog> history = vehicle3.getMaintenanceHistory();
        System.out.println("Initial Maintenance History count: " + history.size());

        try {
            history.clear(); // Attempt to mutate unmodifiable list view
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected UnsupportedOperationException when mutating history list.");
        }

        System.out.println("Vehicle internal maintenance history count after mutation attempt: " + vehicle3.getMaintenanceHistory().size());
    }
}