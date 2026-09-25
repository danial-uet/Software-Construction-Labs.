/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Wholly Solly Store
 */
public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private double temperature = 22.0; // Default temperature in Celsius

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartThermostat: Heating/Cooling system turned ON.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartThermostat: System turned OFF.");
    }

    @Override
    public String getStatus() {
        return "SmartThermostat Status: [Power: " + (isOn ? "ON" : "OFF") + " | Temperature: " + temperature + "°C]";
    }

    // Unique method specific to SmartThermostat
    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println("SmartThermostat: Temperature set to " + temp + "°C.");
    }
}