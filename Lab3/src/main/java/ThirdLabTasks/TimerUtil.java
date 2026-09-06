/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdLabTasks;

/**
 *
 * @author Wholly Solly Store
 */
public class TimerUtil {
    
    // Requirement: Computes elapsed time between start and end seconds
    public int secondsBetween(int start, int end) {
        // Requirement: Throw IllegalArgumentException if end < start
        if (end < start) {
            throw new IllegalArgumentException("End < start"); 
        }
        return end - start;
    }
}
