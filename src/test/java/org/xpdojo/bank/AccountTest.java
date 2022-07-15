package org.xpdojo.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

  @Test
  @Disabled
  public void depositAnAmountToIncreaseTheBalance() {
    assertThat("your first test").isBlank();
  }

  @Test
  public void isAccountExists() {
    Account account = new Account();
    Assertions.assertNotNull(account);
    // Compilation is good Account object does exists and successfully created asserted notNull
  }
}
