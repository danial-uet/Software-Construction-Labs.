/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsLab;
import java.util.*;
/**
 *
 * @author Wholly Solly Store
 */
public class CourseManager {

    /**
     * Fails with ConcurrentModificationException because modifying a collection 
     * during a for-each loop invalidates the underlying iterator.
     */
    public static void removeCoursesForEach(List<String> subjects) {
        for (String subject : subjects) {
            if (subject.startsWith("6.")) {
                subjects.remove(subject); // Throws ConcurrentModificationException
            }
        }
    }

    /**
     * Safely removes items matching the criteria using Iterator.remove()
     * Time Complexity: O(n)
     */
    public static void removeCoursesSafe(List<String> subjects) {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            if (iter.next().startsWith("6.")) {
                iter.remove(); // Safe removal
            }
        }
    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03"));

        System.out.println("Initial List: " + subjects);

        // Safe removal using Iterator
        removeCoursesSafe(subjects);

        System.out.println("Filtered List: " + subjects);
    }
}
