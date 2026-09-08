/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsLab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Wholly Solly Store
 */
public class Zoo {

    private List<String> animals;

    // Initialize list with elements and store as an unmodifiable view
    public Zoo() {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("bear");
        mutableList.add("lion");
        mutableList.add("tiger");
        this.animals = Collections.unmodifiableList(mutableList);
    }

    // Return the read-only wrapper list
    public List<String> getAnimals() {
        return animals;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<String> readOnlyAnimals = zoo.getAnimals();

        System.out.println("Current Animals: " + readOnlyAnimals);

        // Attempt modification on read-only list and catch runtime exception
        try {
            readOnlyAnimals.add("flamingo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught: Cannot modify an unmodifiable list!");
        }
    }
}
