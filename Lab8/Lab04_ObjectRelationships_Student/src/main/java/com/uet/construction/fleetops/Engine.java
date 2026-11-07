package com.uet.construction.fleetops;

public class Engine {
    private String engineNumber;
    private int displacementCC;
    private String fuelType;

    public Engine(String engineNumber, int displacementCC, String fuelType) {
        this.engineNumber = engineNumber;
        this.displacementCC = displacementCC;
        this.fuelType = fuelType;
    }

    // Copy constructor for defensive cloning (Task 3 requirement)
    public Engine(Engine other) {
        if (other != null) {
            this.engineNumber = other.engineNumber;
            this.displacementCC = other.displacementCC;
            this.fuelType = other.fuelType;
        }
    }

    public String getEngineNumber() { return engineNumber; }
    public void setEngineNumber(String engineNumber) { this.engineNumber = engineNumber; }

    public int getDisplacementCC() { return displacementCC; }
    public void setDisplacementCC(int displacementCC) { this.displacementCC = displacementCC; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    @Override
    public String toString() {
        return "Engine{Number='" + engineNumber + "', CC=" + displacementCC + ", Fuel='" + fuelType + "'}";
    }
}