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
public class CollectionManager {
// Using immutable references with 'final'

    private final List<String> subjects = new ArrayList<>();

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }
// Demonstrating safe iteration 

    public void dropCourse6() {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            String subject = iter.next();
            if (subject.startsWith("6.")) {
                iter.remove(); // Safely removes without exception
            }
        }
    }
// Creating an unmodifiable wrapper

    public List<String> getReadOnlySubjects() {
        return Collections.unmodifiableList(subjects);
    }
}