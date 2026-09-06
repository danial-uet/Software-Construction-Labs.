/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdLabTasks;

/**
 *
 * @author Wholly Solly Store
 */
public class LabBankAccount { 
    private double balance;

    // Constructor to set up the initial balance
    public LabBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Requirement: Deposit negative -> expect IllegalArgumentException. Positive increases balance.
    public void deposit(double amt) { 
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative"); 
        }
        this.balance += amt; 
    }

    // Requirement: Withdraw valid decreases balance. Beyond balance -> expect IllegalStateException.
    public void withdraw(double amt) { 
        if (amt > this.balance) {
            throw new IllegalStateException("Withdrawal amount exceeds balance"); 
        }
        this.balance -= amt; 
    }

    // Requirement: Basic getter to check balance status
    public double getBalance() { 
        return this.balance; 
    }
}