/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author Wholly Solly Store
 */
public class DigitalWallet {
    // Private fields enforce strict encapsulation and data hiding
    private String accountHolder;
    private double balance;
    private final String pinCode; // Final ensures PIN can only be set once during object creation

    // Constructor initializes wallet and enforces non-negative starting balance
    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.balance = (initialBalance < 0.0) ? 0.0 : initialBalance;
        this.pinCode = pinCode;
    }

    // Processes withdrawal only if PIN matches and balance is sufficient
    public boolean withdraw(double amount, String enteredPin) {
        if (this.pinCode == null || !this.pinCode.equals(enteredPin)) {
            System.out.println("Error: Invalid PIN code.");
            return false;
        }
        if (amount <= 0.0) {
            System.out.println("Error: Amount must be positive.");
            return false;
        }
        if (amount > this.balance) {
            System.out.println("Error: Insufficient funds.");
            return false;
        }

        this.balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + this.balance);
        return true;
    }

    // Safely deposits positive amounts into the wallet
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: $" + this.balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Returns account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Updates account holder name
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Provides read-only access to balance without allowing direct modification
    public double getBalance() {
        return balance;
    }
}
