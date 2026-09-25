/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author Wholly Solly Store
 */
// Developer class inheriting from Employee
public class Developer extends Employee {
    private double techAllowance;

    public Developer(String name, double baseSalary, double techAllowance) {
        super(name, baseSalary);
        this.techAllowance = techAllowance;
    }

    // Overrides calculatePay to include tech allowance
    @Override
    public double calculatePay() {
        return baseSalary + techAllowance;
    }
}
