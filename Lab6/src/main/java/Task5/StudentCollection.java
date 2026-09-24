/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Task5;

/**
 *
 * @author Wholly Solly Store
 */
public interface StudentCollection {
    void addStudent(Student student);
    /**
     *
     * @param id
     * @return
     */
    boolean removeStudent(int id);
    /**
     *
     * @param id
     * @return
     */
    Student findStudent(int id);
    int getSize();
    boolean isEmpty();
}
