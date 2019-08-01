/*
 * Programmer: 
 *
 * Date:  
 *
 * File name: BankAccount.java
 *
 * Class: 
 * Section:
 * Instructor:  
 */
package edu.ilstu;

/**
 * Handles processing for a bank account
 *
 * @author Matthew Gerat
 *
 */
public class BankAccount 
{
	
	private String accountNumber;
	private double balance;
	private final double OVERDRAFT_CHARGE = 30;

	/**
	 * Custom constructor
	 * 
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	/**
	 * 
	 * Gets the amount the customer wants to withdraw, checks to 
	 * be sure they have enough in their balance for the amount,
	 * process the withdrawal or provide an insufficient funds
	 * message.
	 *
	 * @param: withdrawal
	 *
	 */
	public void processWithdrawal(double withdrawal)
	{
		
		
		if (validateWithdrawalAmount(withdrawal) == true){
			
			balance = balance - withdrawal;
		} else {
			balance = balance - withdrawal - OVERDRAFT_CHARGE;
		}
	}
	
	/**
	 * 
	 * Validates whether there is enough money in the account
	 * for the amount the customer wants to withdraw.
	 *
	 * @param: 	 withdrawal
	 * @return:  sufficientFunds
	 *
	 */
	private boolean validateWithdrawalAmount(double withdrawal)
	{
		boolean sufficientFunds = true;
		
		if (withdrawal >= balance){
			sufficientFunds = false;
		}
		
		return sufficientFunds;
	}
	
	/**
	 *  
	 * Processes a deposit by adding the amount to the balance
	 *
	 * @param: 	 deposit
	 *
	 */
	public void processDeposit(double deposit)
	{
		balance = balance + deposit;
	}
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() 
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account: " + getAccountNumber() + "\nBalance: " + getBalance();
	}
}
