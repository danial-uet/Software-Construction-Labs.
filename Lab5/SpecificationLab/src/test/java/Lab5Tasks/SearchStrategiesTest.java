/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Lab5Tasks;

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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchStrategiesTest {

    // Test Case 1: Both methods return the same result when val occurs EXACTLY ONCE
    @Test
    public void testSameResultWhenElementAppearsOnce() {
        int[] arr = {10, 20, 30, 40};
        int val = 30;

        int firstIndex = SearchStrategies.findFirst(arr, val);
        int lastIndex = SearchStrategies.findLast(arr, val);

        // Both findFirst and findLast return index 2
        assertEquals(2, firstIndex);
        assertEquals(2, lastIndex);
        assertEquals(firstIndex, lastIndex);
    }

    // Test Case 2: Methods return DIFFERENT results when array contains DUPLICATES
    @Test
    public void testDifferentResultsWithDuplicates() {
        int[] arr = {5, 12, 5, 8, 5};
        int val = 5;

        int firstIndex = SearchStrategies.findFirst(arr, val); // Returns 0
        int lastIndex = SearchStrategies.findLast(arr, val);   // Returns 4

        assertEquals(0, firstIndex);
        assertEquals(4, lastIndex);
        assertNotEquals(firstIndex, lastIndex);
    }

    // Test Case 3: Methods return DIFFERENT results when val is MISSING from array
    @Test
    public void testDifferentResultsWhenValueMissing() {
        int[] arr = {1, 2, 3, 4};
        int val = 99;

        int firstIndex = SearchStrategies.findFirst(arr, val); // Returns arr.length (4)
        int lastIndex = SearchStrategies.findLast(arr, val);   // Returns -1

        assertEquals(4, firstIndex);
        assertEquals(-1, lastIndex);
        assertNotEquals(firstIndex, lastIndex);
    }
}
