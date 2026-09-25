/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author Wholly Solly Store
 */
// Base class representing a general employee
public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Base calculation method to be overridden by subclasses
    public double calculatePay() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}
