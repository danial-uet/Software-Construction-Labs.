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
public class StringUtilTest {

    private final StringUtil util = new StringUtil();

    @Test
    public void testStandardPalindrome() {
        // Test: "madam" -> true
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testCaseInsensitivePalindrome() {
        // Test: "RaceCar" (case insensitive) -> true
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testNonPalindrome() {
        // Test: "hello" -> false
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testNullOrEmptyString() {
        // Test: null or empty string -> false
        assertFalse(util.isPalindrome(null));
        assertFalse(util.isPalindrome(""));
    }
}
