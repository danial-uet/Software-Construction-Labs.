/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author Wholly Solly Store
 */
public class BankAccount1 {
    private double balance;
    private boolean active;

    // Constructor
    public BankAccount1(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
        this.active = initialBalance >= 100; 
    }

    // Method to deposit money
    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        this.balance += amt;
        if (this.balance >= 100) {
            this.active = true;
        }
    }

    // Method to withdraw money
    public void withdraw(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        if (amt > this.balance) {
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
        }
        this.balance -= amt;
        if (this.balance < 100) {
            this.active = false;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return this.balance;
    }

    // Method to check if account is active
    public boolean isActive() {
        return this.active;
    }
}
