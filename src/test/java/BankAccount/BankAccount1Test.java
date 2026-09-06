/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BankAccount;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wholly Solly Store
 */
      
public class BankAccount1Test {
    
    public BankAccount1Test() {
    }

    // Test Case 1: Valid Deposit Scenario
    @Test
    public void testValidDeposit() {
        System.out.println("Running Test Case 1: Valid Deposit...");
        BankAccount1 instance = new BankAccount1(100.0);
        instance.deposit(50.0);
        assertEquals(150.0, instance.getBalance(), 0.01);
    }

    // Test Case 2: Valid Withdrawal Scenario
    @Test
    public void testValidWithdraw() {
        System.out.println("Running Test Case 2: Valid Withdrawal...");
        BankAccount1 instance = new BankAccount1(200.0);
        instance.withdraw(50.0);
        assertEquals(150.0, instance.getBalance(), 0.01);
    }

    // Test Case 3: Inactivity Check (Balance goes under 100)
    @Test
    public void testAccountInactivity() {
        System.out.println("Running Test Case 3: Inactivity Boundary Check...");
        // Account drops below 100, should trigger active = false
        BankAccount1 instance = new BankAccount1(120.0);
        instance.withdraw(30.0); 
        
        assertEquals(90.0, instance.getBalance(), 0.01);
        assertFalse(instance.isActive());
    }

    // Test Case 4: Negative Value Exceptions (Deposit/Withdrawal validation)
    @Test
    public void testNegativeAmountExceptions() {
        System.out.println("Running Test Case 4: Negative Values Guard Rails...");
        BankAccount1 instance = new BankAccount1(100.0);
        
        // Disallow negative deposits
        assertThrows(IllegalArgumentException.class, () -> {
            instance.deposit(-25.0);
        });
        
        // Disallow negative withdrawals
        assertThrows(IllegalArgumentException.class, () -> {
            instance.withdraw(-10.0);
        });
    }

    // Test Case 5: Overdraft Exception (Withdrawal beyond balance validation)
    @Test
    public void testOverdraftException() {
        System.out.println("Running Test Case 5: Overdraft Guard Rails...");
        BankAccount1 instance = new BankAccount1(50.0);
        
        // Disallow withdrawing more than the balance limits
        assertThrows(IllegalArgumentException.class, () -> {
            instance.withdraw(60.0);
        });
    }
}
