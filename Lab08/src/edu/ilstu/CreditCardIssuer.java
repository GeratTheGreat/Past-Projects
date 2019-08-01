/*
 *File name: CreditCardIssuer.java
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

/**
 * The main code of finding the card issuer
 * @author Matthew Gerat
 *
 */
public class CreditCardIssuer
{
	
	public String determineCreditCardIssuer(char firstCharacter)
	{
		if(firstCharacter == '3')
		{
			return "American Express";
		}
		else if(firstCharacter == '4')
		{
			return "Visa";
		}
		else if(firstCharacter == '5')
		{
			return "Mastercard";
		}
		else if(firstCharacter == '6')
		{
			return "Discover";
		}
		else
		{
			return "Specialty cards";
		}
	}
	
	
	
	
	

	
	
	
	

}
