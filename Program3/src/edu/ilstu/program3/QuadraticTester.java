/*
 *File name: QuadraticTester.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Mar 20, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */
package edu.ilstu.program3;

/**
 * The app built to test the methods that were created in the Quadratic class
 * @author Matthew Gerat
 *
 */
import java.util.Scanner;
public class QuadraticTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Quadratic quad1 = new Quadratic(-1, 3, -8);
		Quadratic quad2 = new Quadratic(2, -4 , 4);
		Quadratic quad3 = new Quadratic(6, 8, -2);
		Quadratic quad4 = new Quadratic(6, 0, -2);
		Quadratic quad5 = new Quadratic(10, 0, -8);
		
		//Begin print testing
		System.out.println("Print Testing");
		System.out.println("Expected: -1x^2+3x-8");
		System.out.print("Actual: ");
		quad1.print();
		
		System.out.println("\n" + "Expected: 2x^2-4x+4");
		System.out.print("Actual: ");
		quad2.print();
		//End print testing
		
		//Begin add method testing
		System.out.println("\n" + "Add method testing");
		System.out.println("-1x^2+3x-8 + 2x^2-4x+4:");
		System.out.println("Expected: 1x^2-1x-4");
		System.out.print("Actual: ");
		quad1.add(quad2);
		quad1.print();
		
		System.out.println("\n" + "-1x^2+3x-8 + 6x^2+8x-2:");
		System.out.println("Expected: 7x^2+7x-6");
		System.out.print("Actual: ");
		quad1.add(quad3);
		quad1.print();
		
		System.out.println("\n" + "2x^2-4x+4 + 6x^2+8x-2:");
		System.out.println("Expected: 7x^2+7x-6");
		System.out.print("Actual: ");
		quad2.add(quad3);
		quad2.print();
		//End add testing
		
		//Begin subtract testing
		System.out.println("\n" + "Subtract testing");
		System.out.println("-1x^2+3x-8 - 2x^2-4x+4");
		System.out.println("Expected: -1x^2+3x-8");
		System.out.print("Actual: ");
		quad1.subtract(quad2);
		quad1.print();
		
		System.out.println("\n" + "6x^2+8x-2 - 2x^2-4x+4");
		System.out.println("Expected: -2x^2+4x-4");
		System.out.print("Actual: ");
		quad3.subtract(quad2);
		quad3.print();
		
		System.out.println("\n" + "6x^2+x+2 - -1x^2+3x-8");
		System.out.println("Expected: 7x^2-3x+6");
		System.out.print("Actual: ");
		quad4.subtract(quad1);
		quad4.print();
		//End subtract testing
		
		//Begin multiply testing
		System.out.println("\n" + "Multiply testing");
		System.out.println("7x^2-3x+6 * 2:");
		System.out.println("Expected: 14x^2-6x+12");
		System.out.print("Actual: ");
		quad4.multiply(2);
		quad4.print();
		
		System.out.println("\n" + "-2x^2+4x-4 * 4:");
		System.out.println("Expected: -8x^2+16x-16");
		System.out.print("Actual: ");
		quad3.multiply(4);
		quad3.print();
		
		System.out.println("\n" + "-1x^2+3x-8 * 3:");
		System.out.println("Expected: -3x^2+9x-24");
		System.out.print("Actual: ");
		quad1.multiply(3);
		quad1.print();
		//End multiply testing
		
		//Begin isMultipleOf testing
		System.out.println("\n" + "isMultipleOf testing");
		System.out.println("-1x^2+3x-8 divisible by 2?:");
		System.out.println("Expected: false");
		System.out.print("Actual: ");
		System.out.println(quad1.isMultipleOf(2));
		
		System.out.println("\n" + "-2x^2+4x-4 divisible by 4?:");
		System.out.println("Expected: true");
		System.out.print("Actual: ");
		System.out.println(quad3.isMultipleOf(4));
		
		System.out.println("\n" + "7x^2-3x+6 divisible by 3?:");
		System.out.println("Expected: false");
		System.out.print("Actual: ");
		System.out.println(quad4.isMultipleOf(3));
		//End isMultipleOf testing
		
		//Begin evaluate testing
		System.out.println("\n" + "Evaluate esting");
		System.out.println("7x^2-3x+6 evaluated with x=2:");
		System.out.println("Expected: 56");
		System.out.print("Actual: ");
		System.out.println(quad4.evaluate(2));
		
		System.out.println("\n" + "10x^2+x-8 evaluated with x=3:");
		System.out.println("Expected: 82");
		System.out.print("Actual: ");
		System.out.println(quad5.evaluate(3));
		
		System.out.println("\n" + "-2x^2+4x-4 evaluated with x=0:");
		System.out.println("Expected: -16");
		System.out.print("Actual: ");
		System.out.println(quad3.evaluate(0));
		//End evaluate testing
		

				
	}

}
