/*
 *File name: Gradebook.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Apr 18, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu;
/*
 * This class reads a file of numbers, assigns each number a letter grade, then prints that number of grades along with matching number of '*'
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Gradebook
{
	public static void main(String[] args)
	{
		File grades = new File("ExamGrades.txt");
		Scanner reader = null;
		int [] gradeArray = new int[5];
		int countNum = 0;
		int grade = 0;
		
		try
		{
			reader = new Scanner(grades);
			
		}
		catch (FileNotFoundException error)
		{
			System.out.println("File not found");
			System.exit(1);
		}
		/**
		 * This while loop creates the ranges of the numbers to decide which grade to assign to each value
		 */
		while(reader.hasNextInt() && countNum < gradeArray.length)
		{
			grade = reader.nextInt();
			if(grade >= 90)
			{
				gradeArray[0]++;
			}
			else if(grade >= 80)
			{
				gradeArray[1]++;
			}
			else if(grade >= 70)
			{
				gradeArray[2]++;
			}
			else if(grade >= 60)
			{
				gradeArray[3]++;
			}
			else if(grade <= 59)
			{
				gradeArray[4]++;
			}

		}
		/**
		 * The following for loops go through each grade, check the number of grades assigned, then print the number of '*' to match
		 */
		System.out.print("A ");
		for(int i = 0; i < gradeArray[0]; i++)
		{
			System.out.print("*");
			
		}
		System.out.println(" " + gradeArray[0]);
		
		System.out.print("B ");
		for(int i = 0; i < gradeArray[1]; i++)
		{
			System.out.print("*");
			
		}
		System.out.println(" " + gradeArray[1]);
		
		System.out.print("C ");
		for(int i = 0; i < gradeArray[2]; i++)
		{
			System.out.print("*");
			
		}
		System.out.println(" " + gradeArray[2]);
		
		System.out.print("D ");
		for(int i = 0; i < gradeArray[3]; i++)
		{
			System.out.print("*");
			
		}
		System.out.println(" " + gradeArray[3]);
	
		System.out.print("F ");
		for(int i = 0; i < gradeArray[4]; i++)
		{
			System.out.print("*");
			
		}
		System.out.print(" " + gradeArray[4]);
		
		


	}

}
