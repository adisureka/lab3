package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SavingsAccountTest {
  Account test1 = new SavingsAccount(100.11);
  IAccount test2 = test1;

  @Test
  void testExceptions(){
    assertThrows(IllegalArgumentException.class,
                () -> new CheckingAccount(0));
    assertThrows(IllegalArgumentException.class,
                () -> new CheckingAccount(-1));
  }

  @Test
  void testDepositExceptions() {
    assertThrows(IllegalArgumentException.class,
                () -> test2.deposit(-1.0));
  }

  @Test
  void testWithdraw(){
    assertEquals(true, test2.withdraw(20));
  }

  @Test
  void testGetBalance(){
    test1.withdraw(20);
    assertEquals(80.11, test2.getBalance());
  }

  @Test
  void testToString(){
    assertEquals("$100.11", test2.toString());
  }
}