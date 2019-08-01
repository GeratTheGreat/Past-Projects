/*
 *File name: Die.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Apr 11, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu;

import java.util.Random;

/**
 * This Die class contains the random generator that will be used in DieAccumulator and the driver. It also contains the getters/setters.
 * @author Matthew Gerat
 *
 */
public class Die
{
	private int spots;
	private static Random generator;
	
	/**
	 * This method intializes the generator to random. 
	 */
	public Die()
	{
		generator = new Random();
		
	}
	/**
	 * This method tells the generator which range of numbers to generate from
	 */
	public void roll()
	{
		spots = generator.nextInt(6)+1;
	}
	public int getSpots()
	{
		return spots;
	}
	public void setSpots(int spots)
	{
		this.spots = spots;
	}
	

}
