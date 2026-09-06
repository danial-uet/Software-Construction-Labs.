/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdLabTasks;

/**
 *
 * @author Wholly Solly Store
 */

public class StringUtil {
    
    // Requirement: Checks if a string reads the same backward, case-insensitive, ignores punctuation/spaces
    public boolean isPalindrome(String s) { 
        if (s == null) {
            return false;
        }
        // Requirement: Cleans special characters/spaces and turns lowercase for case insensitivity
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase(); 
        
        // Handle empty string after cleaning (or original empty string)
        if (clean.isEmpty()) {
            return false; 
        }
        
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}

