# BankAccount Beginner Lab

## Overview
Implement the `BankAccount` class to pass the beginner tasks.

## Core Tasks
1. Implement `deposit(double amount)` with guard clauses for invalid deposits (zero/negative).
2. Implement `withdraw(double amount)` with guard clauses (no overdraft, no negative withdrawal).
3. Implement `getBalance()` to return the current balance.
4. Test edge cases:
   - Deposit 0
   - Withdraw more than balance
   - Negative deposit/withdrawal

## How to Run
Compile and run tests with Gradle:

```bash
./gradlew test    # macOS/Linux
gradlew.bat test  # Windows
```
