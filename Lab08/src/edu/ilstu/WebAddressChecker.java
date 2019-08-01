/*
 *File name: WebAddressChecker.java
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
 * This app reads the user entry and determines what kind of website it is
 * @author Matthew Gerat
 *
 */
public class WebAddressChecker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String webAddress = null;
		String gov = "gov";
		String edu = "edu";
		String com = "com";
		String org = "org";
		System.out.println("Enter a full web address: ");
		webAddress = kb.nextLine();
		
		if(webAddress.toLowerCase().contains(gov))
		{
			System.out.println("This is a government web address.");
		}
		else if(webAddress.toLowerCase().contains(edu))
		{
			System.out.println("This is a university web address.");
		}
		else if(webAddress.toLowerCase().contains(com))
		{
			System.out.println("This is a business address.");
		}
		else if(webAddress.toLowerCase().contains(org))
		{
			System.out.println("This is an organization web address.");
		}
		else
		{
			System.out.println("This is a web address for another entity.");
		}
		
	}

}
