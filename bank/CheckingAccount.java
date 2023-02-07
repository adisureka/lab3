package bank;

/**
 * Object Class CheckingAccount: extends Account and implements IAccount as well.
 */
class CheckingAccount extends Account implements IAccount{

  /**
   * Constructor: Program constructor, takes an amount as a parameter.
   */
  public CheckingAccount (double amount) {
	super(amount);
  }
}