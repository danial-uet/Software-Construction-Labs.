package BankAccount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("StringAnalyzer Core Verification Suite")
public class StringAnalyzerTest {

    private final StringAnalyzer analyzer = new StringAnalyzer();

    @Test
    @DisplayName("Verify Palindrome handles Null and Empty Boundary Strings")
    public void testPalindromeNullOrEmpty() {
        assertFalse(analyzer.isPalindrome(null));
        assertFalse(analyzer.isPalindrome(""));
    }

    @Test
    @DisplayName("Verify Palindrome handles Case Insensitive and Spaced Inputs")
    public void testPalindromeCaseInsensitive() {
        assertTrue(analyzer.isPalindrome("RaceCar"));
        assertTrue(analyzer.isPalindrome("A man a plan a canal Panama"));
        assertFalse(analyzer.isPalindrome("Java"));
    }

    @Test
    @DisplayName("Verify Vowel Tally handles Null and Empty Strings")
    public void testCountVowelsNullOrEmpty() {
        assertEquals(0, analyzer.countVowels(null));
        assertEquals(0, analyzer.countVowels(""));
    }

    @Test
    @DisplayName("Verify Vowel Tally counts Mixed Cases and Silent Vowel Strings")
    public void testCountVowelsScenarios() {
        assertEquals(5, analyzer.countVowels("AeIoU")); 
        assertEquals(0, analyzer.countVowels("Rhythm")); 
        assertEquals(3, analyzer.countVowels("Hello World")); 
    }

    @Test
    @DisplayName("Verify Anagram handles Null and Empty Boundary Constraints")
    public void testAnagramNullOrEmpty() {
        assertFalse(analyzer.isAnagram(null, "listen"));
        assertFalse(analyzer.isAnagram("silent", null));
        assertFalse(analyzer.isAnagram("", ""));
    }

    @Test
    @DisplayName("Verify Anagram handles Case Insensitive Character Swaps")
    public void testAnagramCaseInsensitive() {
        assertTrue(analyzer.isAnagram("Listen", "Silent"));
        assertTrue(analyzer.isAnagram("Dormitory", "Dirty Room"));
        assertFalse(analyzer.isAnagram("Hello", "Bello"));
    }
}
    

