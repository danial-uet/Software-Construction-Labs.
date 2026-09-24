/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author Wholly Solly Store
 */
public class Task3Main {
    public static void main(String[] args) {
        // Step 1: Declare a list variable depending on the interface List<String>
        List<String> students;

        // Step 2: Instantiate it as an ArrayList and add a student ("Ali")
        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("ArrayList implementation: " + students);

        // Step 3: Reassign the EXACT SAME variable as a LinkedList and add a student ("Usman")
        students = new LinkedList<>();
        students.add("Usman");
        System.out.println("LinkedList implementation: " + students);
    }
}
