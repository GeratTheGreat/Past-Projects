/*
 *File name: DiceDriver.java
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
 * This class calls upon DiceAccumulator and Die to control their methods and make the program run itself to produce 1000 rolls and then determine how many pairs their are of each number. 
 * @author Matthew Gerat
 *
 */
public class DiceDriver
{

	
	public static void main(String[] args)
	{
		DiceAccumulator dice = new DiceAccumulator();
		dice.loadArray();
		dice.rollDie();
		dice.updateStats();
		dice.printReport();

	}

}
