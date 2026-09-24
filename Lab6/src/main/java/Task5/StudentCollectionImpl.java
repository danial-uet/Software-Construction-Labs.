/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wholly Solly Store
 */
public class StudentCollectionImpl implements StudentCollection {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean removeStudent(int id) {
        Student s = findStudent(id);
        if (s != null) {
            return students.remove(s);
        }
        return false;
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}