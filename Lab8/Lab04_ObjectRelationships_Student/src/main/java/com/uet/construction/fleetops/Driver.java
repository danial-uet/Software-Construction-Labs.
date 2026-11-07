package com.uet.construction.fleetops;

public class Driver {
    private String driverId;
    private String fullName;
    private String licenseNumber;

    public Driver(String driverId, String fullName, String licenseNumber) {
        if (driverId == null || driverId.trim().isEmpty() ||
            fullName == null || fullName.trim().isEmpty() ||
            licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Driver inputs cannot be null or blank.");
        }
        this.driverId = driverId;
        this.fullName = fullName;
        this.licenseNumber = licenseNumber;
    }

    public String getDriverId() { return driverId; }
    public void setDriverId(String driverId) { this.driverId = driverId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    @Override
    public String toString() {
        return "Driver{ID='" + driverId + "', Name='" + fullName + "', License='" + licenseNumber + "'}";
    }
}