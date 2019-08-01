/*
 *  File name:  DonationApp.java
 * 
 *  Programmer:  insert your first and last name
 *  ULID:  your ulid
 *
 *  Date:  Mar 8, 2015
 *
 *  Class: IT 168
 *  Lecture Section:   
 *  Lecture Instructor:  Patricia Matsuda
 *  Lab Section:  
 *  Lab Instructor:  
 */

package edu.ilstu;


/**
 *  This class a user to enter as many donation amounts for a non-profit organization.  Donations are made using 
 *  credit cards so the user will need to enter the name of the donor as it appears on the card.  
 *  The credit card number entered will need to be checked to make sure it is valid using a web service.  
 *  If the credit card number passes validation, then the user enters the donation amount.  
 *  Donation amount will need to be validated to make sure the entered amount is not 0 or less.  
 *  
 *  A summary is displayed after one donation is completed.
 *  A total amount is displayed when the user is done entering donations.
 *
 *  @author  Ms. Patricia Matsuda, Matthew Gerat
 *
 */
import java.util.Scanner;
public class DonationApp
{
	public void run()
	{
		//Create instance of Scanner
		Scanner kb = new Scanner(System.in);
		
		


		
		//create variables and references to instances of classes to be used here
		
		CreditCardIssuer cc = new CreditCardIssuer();
		String donorName;
		String cardNumber;
		double donationAmount;
		String cardIssuer;
		String answer = null;
		
	
			
		



		
		//rest of your code here, including creating objects and assigning to references above
		System.out.println("Would you like to donate? Type Y for Yes or N for No");
		answer = kb.nextLine();
		/*
		 * This loop is taking user entry to then output into the print summary function made in the builder class.
		 */
		while(answer.equals("y"))
		{
			System.out.println("What is your full name?");
			donorName = kb.nextLine();
			System.out.println("What is your credit card number?");
			cardNumber = kb.nextLine();
			char firstC = cardNumber.charAt(0);
			
			Donation donation = new Donation(donorName, cardNumber);
			if(validateCCNumber(cardNumber))
			{
				System.out.println("Please enter a donation amount: ");
				donationAmount = kb.nextDouble();
				
				if(donationAmount >= 0)
				{
					donationAmount++;
					donation.printSummary();
					System.out.println(cc.determineCreditCardIssuer(firstC));
				}
				else
				{
					System.out.println("Credit card invalid");
				}
			}
			System.out.println("Would you like to donate again? Type Y for Yes or N for No");
			answer = kb.nextLine();
		}
		
		









	}
	
	//write the logic to accept the credit card and return if it is valid
	private boolean validateCCNumber(String creditCardNumber)
	{
		boolean valid = true;
		String regex = "\\d*";
		
		valid = creditCardNumber.matches(regex);
		if(creditCardNumber.length() == 16 && valid == true)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args)
	{
		DonationApp  app = new DonationApp();
		
		app.run();
	}
}
