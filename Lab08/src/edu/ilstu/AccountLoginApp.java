/*
 *File name: AccountLoginApp.java
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
 * An app that checks if your username and password are correct
 * @author Matthew Gerat
 *
 */
import java.util.Scanner;
public class AccountLoginApp
{

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String user = "admin";
		String password = "open";
		String username = null;
		String password1 = null;
				
		System.out.println("Enter username: ");
		username = kb.nextLine();
		
		System.out.println("Enter password: ");
		password1 = kb.nextLine();
		
		if(username.equals(user) && password1.equals(password))
		{
			System.out.println("Welcome.");
		}
		else if(username.equals(user) && !password1.equals(password))
		{
			System.out.println("Wrong Password.");
		}
		else if(!username.equals(user) && password1.equals(password))
		{
			System.out.println("Wrong user ID.");
		}
		else
		{
			System.out.println("Sorry, wrong ID and password.");
		}

	}

}
