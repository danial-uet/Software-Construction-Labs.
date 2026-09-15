/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5Tasks;

/**
 *
 * @author Wholly Solly Store
 */
public class SearchStrategies {

    /**
     * Loops from index 0 to arr.length - 1 and returns the first matching index,
     * or arr.length if not found.
     */
    public static int findFirst(int[] arr, int val) {
        if (arr == null) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return arr.length;
    }

    /**
     * Loops backwards from arr.length - 1 to 0 and returns the matching index,
     * or -1 if not found.
     */
    public static int findLast(int[] arr, int val) {
        if (arr == null) {
            return -1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
