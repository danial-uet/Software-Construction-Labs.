/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author Wholly Solly Store
 */
// SalesManager class inheriting from Employee
public class SalesManager extends Employee {
    private double commission;

    public SalesManager(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    // Overrides calculatePay to include sales commission
    @Override
    public double calculatePay() {
        return baseSalary + commission;
    }
}