/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Wholly Solly Store
 */
public class Main {
    public static void main(String[] args) {
        // Create a generic list of type Employee holding different subclasses
        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Alice", 5000.0, 800.0));
        employees.add(new SalesManager("Bob", 4000.0, 1200.0));
        employees.add(new Developer("Charlie", 5200.0, 800.0));

        System.out.println("--- PAYROLL REPORT ---");
        // Polymorphic loop executing subclass-specific calculatePay()
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() + " | Final Pay: $" + emp.calculatePay());
        }
    }
}