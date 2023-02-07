package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CheckingAccountTest {
  Account test1 = new CheckingAccount(100.11);
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
                () -> test1.deposit(-1.0));
  }

  @Test
  void testWithdraw(){
    assertEquals(true, test1.withdraw(20));
  }

  @Test
  void testGetBalance(){
    test1.withdraw(20);
    assertEquals(80.11, test1.getBalance());
  }

  @Test
  void testToString(){
    assertEquals("$100.11", test1.toString());
  }
}