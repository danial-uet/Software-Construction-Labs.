/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsLab;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Wholly Solly Store
 */
public class TreasureMap {

    public static void main(String[] args) {
        // Initialize the treasure map and populate initial key-value pairs
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("chest", 100.0);
        treasures.put("palm", 50.0);
        treasures.put("skull", 25.0);

        // Update the value of "palm" by adding the current map size to its value
        treasures.put("palm", treasures.get("palm") + treasures.size());

        // Calculate the total sum of all values in the treasure map
        double totalSum = 0;
        for (Double val : treasures.values()) {
            totalSum += val;
        }

        // Print the contents and final calculated sum
        System.out.println("Treasure Map: " + treasures);
        System.out.println("Total Sum: " + totalSum);
    }
}
