/*
 *File name: DiceAccumulator.java
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

/**
 * This class contains the methods that will be used in the driver. This class will print out 6 different dice rolls and list the pairs.
 * @author Matthew Gerat
 *
 */
public class DiceAccumulator
{
	private int [] statsArray;
	private Die [] dieArray1;
	private Die [] dieArray2;
	
	/**
	 * This method assigns values to the arrays
	 * @param die
	 */
	public DiceAccumulator()
	{
		statsArray = new int [6];
		dieArray1 = new Die [1000];
		dieArray2 = new Die [1000];
	}
	/**
	 * This method contains a for loop to roll two die's and then store the numbers they roll
	 */
	public void rollDie()
	{
		for(int i = 0; i <= 999; i++)
		{
			dieArray1[i].roll();
			dieArray2[i].roll();
		}
		
	}
	/**
	 * This method contains a for loop that will load the values into the array
	 */
	public void loadArray()
	{
		for(int i = 0; i <= 999; i++)
		{
			dieArray1[i] = new Die();
			dieArray2[i] = new Die();
		}
	}
	/**
	 * this method contains a for loop with a nested if that compares the numbers rolled to see if they are the same, then assigns them to a pair.
	 */
	public void updateStats()
	{
		for(int i = 0; i <= 999; i++)
		{
			if(dieArray1[i].getSpots() == dieArray2[i].getSpots())
			{ 
				statsArray[dieArray1[i].getSpots() - 1]++;
			}
		}
		
	}
	/**
	 * This method creates the on screen text display with proper formatting. It also calls each array to be printed out correctly. 
	 */
	public void printReport()
	{
		
		System.out.println("Number of rolled pairs \n" + "1: " + statsArray[0] + "\n2: " + statsArray[1] + "\n3: " + statsArray[2] + "\n4: " + statsArray[3]
				+ "\n5: " + statsArray[4] + "\n6: " + statsArray[5]);
		
	}

}
