package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountDepositTest {
    @Test
    void validDepositIncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    void zeroDepositDoesNotChangeBalance() {
        BankAccount account = new BankAccount();
        account.deposit(0);
        assertEquals(0, account.getBalance(), 0.001);
    }

    @Test
    void negativeDepositDoesNotChangeBalance() {
        BankAccount account = new BankAccount();
        account.deposit(-50);
        assertEquals(0, account.getBalance(), 0.001);
    }
}
