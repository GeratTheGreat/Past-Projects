/*
 *File name: Donation.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Mar 28, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu;

/**
 * This is the class that contains the print summary method to be used in the class for asking a user for a donation, then printing out the user entered information while censoring the sensitive information. 
 * @author Matthew Gerat
 *
 */
public class Donation
{
	private String donorName;
	private String cardNumber;
	private double donationAmount;
	
	public Donation(String donorName, String cardNumber)
	{
		this.donorName = donorName;
		this.cardNumber = cardNumber;
	}

	public String getDonorName()
	{
		return donorName;
	}

	public void setDonorName(String donorName)
	{
		this.donorName = donorName;
	}

	public String getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public double getDonationAmount()
	{
		return donationAmount;
	}

	public void setDonationAmount(double donationAmount)
	{
		this.donationAmount = donationAmount;
	}
	
	private String maskCardNumber()
	{
		return "************" + cardNumber.substring(12);
	}
	
	public void printSummary()
	{
		System.out.println(donorName);
		System.out.println("Credit Card: " + maskCardNumber());
		System.out.println("Donation Amount: " + donationAmount);
	}
	

}
