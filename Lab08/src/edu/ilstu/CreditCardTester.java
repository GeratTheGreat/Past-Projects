/*
 *File name: CreditCardTester.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Mar 7, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu;
import java.util.Scanner;
/**
 * This called the CreditCardIssuer object and executed the code
 * @author Matthew Gerat
 *
 */
public class CreditCardTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the credit card number:");
		String card = kb.next();
		char firstCharacter = card.charAt(0);
		
		CreditCardIssuer cardN = new CreditCardIssuer();
		System.out.println(cardN.determineCreditCardIssuer(firstCharacter));
		

	}

}
