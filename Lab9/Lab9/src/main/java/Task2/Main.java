package Task2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Valid Transfer ---");
        BankTransfer valid = new BankTransfer("ACC-101", "ACC-102", new BigDecimal("500.00"));
        System.out.println("Success: " + valid);

        System.out.println("\n--- Testing Fail-Fast (Negative Amount) ---");
        
        // This line creates the transfer, triggers the exception immediately, 
        // and printing it prevents NetBeans from flagging an unused variable.
        BankTransfer invalid = new BankTransfer("ACC-101", "ACC-102", new BigDecimal("-50.00"));
        System.out.println(invalid); 
    }
}