/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ThirdLabTasks;

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
public class LabBankAccountTest {

    @Test
    public void testDepositPositiveIncreasesBalance() {
        LabBankAccount account = new LabBankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawValidDecreasesBalance() {
        LabBankAccount account = new LabBankAccount(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalanceThrowsException() {
        LabBankAccount account = new LabBankAccount(50.0);
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(60.0);
        });
    }

    @Test
    public void testDepositNegativeThrowsException() {
        LabBankAccount account = new LabBankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-20.0);
        });
    }
}
