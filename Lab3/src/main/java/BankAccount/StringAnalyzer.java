/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author Wholly Solly Store
 */
public class StringAnalyzer {

    // Task 1 & 2: Checks if a string reads the same backward, case-insensitive
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false; // Requirement: Empty or null returns false
        }
        // Remove spaces and convert to lowercase for case-insensitivity
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Task 1 & 2: Counts both uppercase and lowercase vowels
    public int countVowels(String s) {
        if (s == null || s.isEmpty()) {
            return 0; // Safe fallback for empty/null inputs
        }
        int count = 0;
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Task 1 & 2: Checks if two strings are anagrams, case-insensitive
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return false; // Requirement: Empty or null returns false
        }
        // Clean both strings by removing spaces and converting to lowercase
        String clean1 = s1.replaceAll("\\s+", "").toLowerCase();
        String clean2 = s2.replaceAll("\\s+", "").toLowerCase();
        
        if (clean1.length() != clean2.length()) {
            return false;
        }
        
        char[] array1 = clean1.toCharArray();
        char[] array2 = clean2.toCharArray();
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);
        
        return java.util.Arrays.equals(array1, array2);
    }
}
