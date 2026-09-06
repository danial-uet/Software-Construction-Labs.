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
public class TimerUtilTest {

    private final TimerUtil timer = new TimerUtil();

    @Test
    public void testNormalCaseElapsedComputation() {
        // Test idea: start = 10, end = 25 → 15 s
        int result = timer.secondsBetween(10, 25);
        assertEquals(15, result);
    }

    @Test
    public void testBoundaryConditions() {
        // Test idea: start = 0, end = 0 → 0 s
        int result = timer.secondsBetween(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidInputThrowsException() {
        // Test idea: end < start → expect IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            timer.secondsBetween(30, 15);
        });
    }
}
