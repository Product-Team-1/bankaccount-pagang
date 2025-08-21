package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountWithdrawTest {
    @Test
    void validWithdrawReducesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300, account.getBalance(), 0.001);
    }

    @Test
    void cannotWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(200);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    void cannotWithdrawNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(-50);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test
    void cannotWithdrawZeroAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(0);
        assertEquals(100, account.getBalance(), 0.001);
    }
}
