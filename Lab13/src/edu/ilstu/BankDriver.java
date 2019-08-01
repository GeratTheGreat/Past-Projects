/*
 *File name: BankDriver.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Apr 24, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * <insert class description here>
 * @author Matthew Gerat
 *
 */
import java.util.Scanner;

public class BankDriver
{

	/**
	 * This class is the app class that calls the methods of BankAccount to print out the info to a text file.
	 */
	public static void main(String[] args)
	{
		
		final String INPUT = "Transactions.txt";
		final String OUTPUT = "Output.txt";
		
		Scanner reader = null;
		try
		{
			reader = new Scanner(new File(INPUT));
		}
		catch(FileNotFoundException e)
		{
			System.out.print("Error opening file!");
			System.exit(1);
		}
		
		String AccountNumber = reader.nextLine();
		double Balance = reader.nextDouble();
		BankAccount account = new BankAccount(AccountNumber, Balance);
		int numOfDeposits = 0;
		int numOfWithdrawals = 0;
		while(reader.hasNext())
		{
			int code = reader.nextInt();
			double amount = reader.nextDouble();
			System.out.println(code + " ");
			if(1 == code)
			{
				account.processDeposit(amount);
				numOfDeposits++;
			}
			else
			{
				account.processWithdrawal(amount);
				numOfWithdrawals++;
			}
			
		}
		try
		{
			PrintWriter pw = new PrintWriter (new File(OUTPUT));
			pw.print(account.toString() + "\nWithdrawals: " + numOfWithdrawals + "\nDeposits: " + numOfDeposits);
			pw.flush();
		}
		catch(FileNotFoundException e)
		{
			System.out.print("Error opening file!");
			System.exit(1);
		}
		

	}

}
