package org.xpdojo.bank;

public class Account {

  private double balance;

  public Account() {
    this.balance = 0.0;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if(amount < 0.0) {
      throw new IllegalArgumentException("Can not deposit negative amount");
    }
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if(getBalance() < amount) {
      throw new IllegalArgumentException("Can not withdraw amount balance is less than amount requested");
    } else {
      this.balance -= amount;
    }
  }
}
