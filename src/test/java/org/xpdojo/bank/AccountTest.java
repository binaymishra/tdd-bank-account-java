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
}
