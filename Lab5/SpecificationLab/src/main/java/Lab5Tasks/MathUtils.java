/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Tasks;

/**
 *
 * @author Wholly Solly Store
 */
public class MathUtils {

    /**
     * Calculates gravitational potential energy near Earth's surface.
     * 
     * @param altitude in meters relative to sea level. Requires altitude >= 0.
     * @return gravitational potential energy in Joules
     * @throws IllegalArgumentException if altitude < 0
     */
    public static double calculateGravitationalPotentialEnergy(double altitude) {
        if (altitude < 0) {
            throw new IllegalArgumentException("Altitude must be >= 0");
        }
        
        // Match exact standard acceleration due to gravity (9.80665)
        final double g = 9.80665;
        return g * altitude;
    }
}