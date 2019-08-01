/*
 *File name: WindChillApp.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Feb 26, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu.program2;

/**
 * This app is using everything we set in windchill to get the user input to calculate the windchill for Celsius and fahrenheit.
 * @author Matthew Gerat
 *
 */
import java.util.Scanner;
public class WindChillApp
{

	public static void main(String[] args)
	{
	WindChill windchill = new WindChill();
	Scanner kb = new Scanner (System.in);

	System.out.println("Enter the name of the town: ");
	windchill.setTownName(kb.nextLine());
	System.out.println("Enter the state code (Ex. IL): ");
	windchill.setStateCode(kb.nextLine());
	System.out.println("Enter the following temperature and speed information");
	System.out.println("Temperature in Fahrenheit: ");
	windchill.setTempF(kb.nextDouble());
	System.out.println("Wind speed (mph): ");
	windchill.setWindM(kb.nextDouble());
	System.out.println("Temperature in Celsius: ");
	windchill.setTempC(kb.nextDouble());
	System.out.println("Wind speed (km/h): ");
	windchill.setWindK(kb.nextDouble());
	
	System.out.println(windchill.getTownName().substring(0,1).toUpperCase() + windchill.getTownName().substring(1).toLowerCase() + ", " + windchill.getStateCode().toUpperCase());
	System.out.println("Wind Chill temperature (Fahrenheit): " + String.format("%.2f", windchill.calculateFahrenheitWindChill()));
	System.out.println("Wind chill temperature (Celsius): " + String.format("%.2f", windchill.calculateCelsiusWindChill()));
	
	
	
	
	
	
	}

}
