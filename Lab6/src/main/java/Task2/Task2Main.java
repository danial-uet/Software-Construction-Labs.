/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Wholly Solly Store
 */
public class Task2Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ali", 3.75);

        // Accessing data through public getters
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());

        // UNCOMMENT THE LINE BELOW TO PROVE ENCAPSULATION:
        //System.out.println(s1.id); // This will cause a compile-time error!
    }
}