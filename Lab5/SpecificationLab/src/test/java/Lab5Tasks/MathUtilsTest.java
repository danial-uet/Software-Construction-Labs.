/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Lab5Tasks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    void testCalculateGravitationalPotentialEnergy_NegativeAltitude_ThrowsException() {
        try {
            MathUtils.calculateGravitationalPotentialEnergy(-5.0);
            org.junit.jupiter.api.Assertions.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Test passes because exception was caught correctly
        }
    }

    @Test
    void testCalculateGravitationalPotentialEnergy_ValidAltitude_Success() {
        double energy = MathUtils.calculateGravitationalPotentialEnergy(10.0);
        assertEquals(98.0665, energy, 0.001);
    }

    /**
     * Test of calculateGravitationalPotentialEnergy method, of class MathUtils.
     */
    @Test
    public void testCalculateGravitationalPotentialEnergy() {
        System.out.println("calculateGravitationalPotentialEnergy");
        double altitude = 0.0;
        double expResult = 0.0;
        double result = MathUtils.calculateGravitationalPotentialEnergy(altitude);
        assertEquals(expResult, result, 0.001);
    }
}