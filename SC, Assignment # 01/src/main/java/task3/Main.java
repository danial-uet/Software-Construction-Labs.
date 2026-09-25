/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Wholly Solly Store
 */
public class Main {
    public static void main(String[] args) {
        // Instantiating device implementations
        SmartBulb bulb = new SmartBulb();
        SmartThermostat thermostat = new SmartThermostat();

        // Using unique device-specific methods
        bulb.setBrightness(75);
        thermostat.setTemperature(24.5);

        System.out.println("\n--- TESTING CONTRACT IMPLEMENTATION ---");
        
        // Polymorphic list relying on the SmartDevice interface contract
        List<SmartDevice> smartHomeHub = new ArrayList<>();
        smartHomeHub.add(bulb);
        smartHomeHub.add(thermostat);

        // Turn on all devices using the guaranteed interface methods
        for (SmartDevice device : smartHomeHub) {
            device.turnOn();
            System.out.println(device.getStatus());
        }
    }
}
