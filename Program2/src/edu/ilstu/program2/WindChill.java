/*
 *File name: WindChill.java
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
 * This class contains the methods, variables, and calculations that will be used to calculate the windchill for celsius and fahrenheit.
 * @author Matthew Gerat
 *
 */
public class WindChill
{
	private String townName;
	private String stateCode;
	double tempF;
	double windM;
	double tempC;
	double windK;
	private double calculateFahrenheitWindChill;
	private double calculateCelsiusWindChill;
	
	public String getTownName()
	{
		return townName;
	}
	public void setTownName(String townName)
	{
		this.townName = townName;
	}
	public String getStateCode()
	{
		return stateCode;
	}
	public void setStateCode(String stateCode)
	{
		this.stateCode = stateCode;
	}
	public double getTempF()
	{
		return tempF;
	}
	public void setTempF(double tempF)
	{
		this.tempF = tempF;
	}
	public double getWindM()
	{
		return windM;
	}
	public void setWindM(double windM)
	{
		this.windM = windM;
	}
	public double getTempC()
	{
		return tempC;
	}
	public void setTempC(double tempC)
	{
		this.tempC = tempC;
	}
	public double getWindK()
	{
		return windK;
	}
	public void setWindK(double windK)
	{
		this.windK = windK;
	}
	public double calculateFahrenheitWindChill()
	{
		return calculateFahrenheitWindChill = 35.74 + 0.6215 * tempF - 35.75 * Math.pow(windM, 0.16) + 0.4275 * tempF * Math.pow(windM, 0.16);
	}
	public double calculateCelsiusWindChill()
	{
		return calculateCelsiusWindChill = 13.12 + 0.6215 * tempC - 11.37 * Math.pow(windK, 0.16) + 0.3965 * tempC * Math.pow(windK, 0.16);
	}
	
	
	
	

}
