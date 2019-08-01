/*
 * File name: CreditCardIssuer.java
 *
 * Programmer: Pat Matsuda
 * ULID: mpmatsu
 *
 * Date: Mar 2, 2016
 *
 * Class: IT 168
 * Lecture Section: 1, 4, 7
 * Lecture Instructor: Patricia Matsuda
 * Lab Section: 2,3,5,6,8,9
 * LabInstructor: Bansal, Jain, Soufizadeh
 */
package edu.ilstu;

/**
 *  This class determines information from a credit card number.  For now, it only determines
 *  the issuer of the credit card from the first digit in the credit card number.
 *  
 * @author Ms. Patricia Matsuda
 *
 */

public class CreditCardIssuer
{

	/**
	 * This method accepts the first digit of the credit card number.  Using the first digit, it
	 * determines the issuer and returns the name of the credit card issuer.
	 * 
	 * @param first digit of the credit card number
	 * @return the name of the credit card issuer
	 * 
	 */
	public String determineCreditCardIssuer(char issuerCode)
	{
		String issuerName = null;
		
		switch(issuerCode){
			case '3':
				issuerName = "American Express";
				break;
			case '4':
				issuerName = "Visa";
				 break;
			case '5':
				issuerName = "Master Card";
				break;
			case '6':
				issuerName = "Discover";
				break;
			default:
				issuerName = "Specialty cards";
		}
		return issuerName;
	}
}
