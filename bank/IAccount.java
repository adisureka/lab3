interface IAccount {

  /**
   * Method: used to deposit money.
   */
  void deposit(double amount);
  
  /**
   * Method: used to withdraw money.
   */
  boolean withdraw(double amount);

  /**
   * Method: used to perform monthly maintanence task.
   */
  void performMonthlyMaintenance(double fees);

  /**
   * Getter: used to get the user balance.
   */
  double getBalance();    
}