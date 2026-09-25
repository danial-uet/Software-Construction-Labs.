/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author Wholly Solly Store
 */
public class Main {
    public static void main(String[] args) {
        // Create a new wallet with $500 balance and PIN "1234"
        DigitalWallet wallet = new DigitalWallet("John Doe", 500.0, "1234");

        System.out.println("--- DIGITAL WALLET TEST ---");
        System.out.println("Account Holder: " + wallet.getAccountHolder());
        System.out.println("Initial Balance: $" + wallet.getBalance());

        System.out.println("\n1. Trying to withdraw with WRONG PIN:");
        wallet.withdraw(100.0, "0000"); // Should fail

        System.out.println("\n2. Trying to withdraw MORE than balance:");
        wallet.withdraw(1000.0, "1234"); // Should fail

        System.out.println("\n3. Successful Withdrawal:");
        wallet.withdraw(150.0, "1234"); // Should succeed

        System.out.println("\n4. Depositing Money:");
        wallet.deposit(200.0); // Should add $200

        System.out.println("\nFinal Balance: $" + wallet.getBalance());
    }
}
