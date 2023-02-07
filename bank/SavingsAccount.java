package bank;

/**
 * Object Class SavingsAccount: extends Account and implements IAccount as well.
 */
class SavingsAccount extends Account implements IAccount {

  /**
   * Constructor: Program constructor, takes an amount as a parameter.
   */
  public SavingsAccount (double amount) {
    super(amount);
  }
}