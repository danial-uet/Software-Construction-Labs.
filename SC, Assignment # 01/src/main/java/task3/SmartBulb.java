/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Wholly Solly Store
 */
public class SmartBulb implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 100; // Default brightness level (0-100)

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartBulb: Light turned ON.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartBulb: Light turned OFF.");
    }

    @Override
    public String getStatus() {
        return "SmartBulb Status: [Power: " + (isOn ? "ON" : "OFF") + " | Brightness: " + brightness + "%]";
    }

    // Unique method specific to SmartBulb
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
            System.out.println("SmartBulb: Brightness set to " + level + "%.");
        } else {
            System.out.println("SmartBulb Error: Brightness must be between 0 and 100.");
        }
    }
}
