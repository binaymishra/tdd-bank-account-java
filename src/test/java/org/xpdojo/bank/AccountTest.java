package org.xpdojo.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class AccountTest {

  @Test
  @Disabled
  public void depositAnAmountToIncreaseTheBalance() {
    org.assertj.core.api.Assertions.assertThat("your first test").isBlank();
  }

  @Test
  public void isAccountExists() {
    Account account = new Account();
    Assertions.assertNotNull(account);
    // Compilation is good Account object does exists and successfully created asserted notNull
  }

  @Test
  public void beforeDepositCheckForBalance() {
    Account account = new Account();
    // get Compilation !! getBalance method does not exists first hence created
    double balance = account.getBalance();
    // When account is created the balance must be zero
    Assertions.assertEquals(0.0, balance);
  }

  @Test
  public void canIDepositMoneyToAccounts() {
    // 1. can I Deposit money to accounts
    // Yes but first need a account.deposit(double amount) method
    Account account = new Account();
    // get Compilation !! deposit method does not exists first hence created
    account.deposit(100.0);
    Assertions.assertEquals(100.0, account.getBalance());
  }

  @Test
  public void canIDepositNegativeMoneyToAccountsNoCanNot() {
    // 1. can I Deposit Negative money to accounts ?
    // Yes but first need a account.deposit(double amount) method
    Account account = new Account();
    try {
      account.deposit(-100.0);
    } catch (IllegalArgumentException e) {
      String exceptionMsg = e.getMessage();
      System.out.println(exceptionMsg);
      org.assertj.core.api.Assertions.assertThat(exceptionMsg).isEqualTo("Can not deposit negative amount");
    }
  }
}
