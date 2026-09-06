/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdLabTasks;

/**
 *
 * @author Wholly Solly Store
 */
public class TemperatureConverter {
    
    // Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c) { 
        return (c * 9.0 / 5.0) + 32.0; 
    } 
    
    // Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double f) { 
        return (f - 32.0) * 5.0 / 9.0; 
    } 
    
    // Converts Celsius to Kelvin
    public double celsiusToKelvin(double c) { 
        return c + 273.15; 
    }
}
