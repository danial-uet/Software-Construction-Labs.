/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ThirdLabTasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wholly Solly Store
 */
public class TemperatureConverterTest {
    
    private final TemperatureConverter instance = new TemperatureConverter();

    public TemperatureConverterTest() {
    }

    /**
     * Requirement 1: Verify known pairs (0 °C -> 32 °F, 100 °C -> 212 °F)
     * Requirement 3: Assert approximate equality using delta 0.01
     */
    @Test
    public void testKnownPairs() {
        System.out.println("Verifying known benchmark pairs...");
        
        // Test 0 °C -> 32 °F
        double celsius1 = 0.0;
        double expResult1 = 32.0;
        double result1 = instance.celsiusToFahrenheit(celsius1);
        assertEquals(expResult1, result1, 0.01);
        
        // Test 100 °C -> 212 °F
        double celsius2 = 100.0;
        double expResult2 = 212.0;
        double result2 = instance.celsiusToFahrenheit(celsius2);
        assertEquals(expResult2, result2, 0.01);
    }

    /**
     * Requirement 2: Round-trip check: fahrenheitToCelsius(celsiusToFahrenheit(x)) ≈ x
     * Requirement 3: Assert approximate equality using delta 0.01
     */
    @Test
    public void testRoundTripConversion() {
        System.out.println("Verifying round-trip formula consistency...");
        
        double originalValue = 25.0; // Room temperature in Celsius
        
        // fahrenheitToCelsius(celsiusToFahrenheit(x))
        double intermediateFahrenheit = instance.celsiusToFahrenheit(originalValue);
        double roundTripValue = instance.fahrenheitToCelsius(intermediateFahrenheit);
        
        assertEquals(originalValue, roundTripValue, 0.01);
    }

    /**
     * Verification for Celsius to Kelvin translation
     */
    @Test
    public void testCelsiusToKelvin() {
        System.out.println("Verifying Kelvin translation scales...");
        
        double celsius = 0.0;
        double expResult = 273.15;
        double result = instance.celsiusToKelvin(celsius);
        
        assertEquals(expResult, result, 0.01);
    }
}
