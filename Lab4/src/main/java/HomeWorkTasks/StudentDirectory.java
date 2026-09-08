/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWorkTasks;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Wholly Solly Store
 */
public class StudentDirectory {

    private final Map<String, String> studentMap = new HashMap<>();

    // Add a student ID and name pair to the directory
    public void addStudent(String id, String name) {
        studentMap.put(id, name);
    }

    // Return an unmodifiable view of the ID keyset to prevent external modification
    public Set<String> getAllIDs() {
        return Collections.unmodifiableSet(studentMap.keySet());
    }

    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        // Populate initial student data
        directory.addStudent("S101", "Alice");
        directory.addStudent("S102", "Bob");

        // Retrieve the unmodifiable key set
        Set<String> ids = directory.getAllIDs();
        System.out.println("Student IDs: " + ids);

        // Verify that modifying the returned set throws UnsupportedOperationException
        try {
            ids.add("S103");
        } catch (UnsupportedOperationException e) {
            System.out.println("Test Passed: Cannot modify the unmodifiable ID set!");
        }
    }
}
