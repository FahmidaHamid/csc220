package test;

import main.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void depositIncreasesBalance() {
        // Arrange: prepare an account.
        BankAccount account = new BankAccount(100);

        // Act: perform the operation.
        account.deposit(25);

        // Assert: check the resulting state.
        assertEquals(125, account.getBalance());
    }

    @Test
    void withdrawingEntireBalanceLeavesZero() {
        BankAccount account = new BankAccount(100);

        account.withdraw(100);

        assertEquals(0, account.getBalance());
    }

    @Test
    void overdraftThrowsAndPreservesBalance() {
        BankAccount account = new BankAccount(100);
        
        assertThrows(
            IllegalArgumentException.class,
            () -> account.withdraw(150)
        );

        assertEquals(100, account.getBalance());
    }
}