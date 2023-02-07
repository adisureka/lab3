package bank; 

/**
 * Object Class Account: implements IAccount as well.
 */
abstract class Account implements IAccount {
  private static int counter = 0;
  private double amount;

  /**
   * Constructor: Program constructor, takes an amount as a parameter.
   */
  protected Account(double amount){
	if (amount < 0.01) {
	  throw new IllegalArgumentException();
	}
	this.amount = amount;
	counter ++;
  }

  /**
   * Method: used to deposit money.
   */
  public void deposit(double amount) {
	if (amount < 0) {
	  throw new IllegalArgumentException();
	}
	this.amount += amount;
	counter ++;
  }	

  /**
   * Method: used to withdraw money.
   */
  public boolean withdraw(double amount) {
	if (amount <= 0 || amount > this.amount) {
	  return false;
	}
	else {
	  this.amount -= amount;
	  counter ++;
	  return true;
	}		
  }

  /**
   * Getter: used to get the user balance.
   */
  public double getBalance() {
    return this.amount;
  }

  /**
   * Method: used to perform monthly maintanence task.
   */
  public void performMonthlyMaintenance(double fees) {
    this.amount -= fees;
    counter = 0;
  }

  /**
   * Method: to return the message to the user.
   */
  public String toString() {
    String txt = String.format("$%.2f", this.amount);
    return txt;
  }
}