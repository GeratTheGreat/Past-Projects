/*
 *File name: hm.java
 * 
 *Programmer: Matthew Gerat
 *ULID: Mdgerat
 *
 *Date: Mar 19, 2017
 *
 *Class: IT 168
 *Lecture Section: 001 
 *Lecture Instructor: Patricia Matsuda 
 *Lab Section: 003
 *Lab Instructor: FS
 */

/**
 * <insert class description here>
 * @author Matthew Gerat
 *
 */
import java.util.Scanner;
public class hm
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		 int a, b, c;
	        double root1, root2, d;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Given quadratic equation:ax^2 + bx + c");
	        System.out.print("Enter a:");
	        a = s.nextInt();
	        System.out.print("Enter b:");
	        b = s.nextInt();
	        System.out.print("Enter c:");
	        c = s.nextInt();
	        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
	        d = b * b - 4 * a * c;
	        if(d > 0)
	        {
	            System.out.println("Roots are real and unequal");
	            root1 = ( - b + Math.sqrt(d))/(2*a);
	            root2 = (-b - Math.sqrt(d))/(2*a);
	            System.out.println("First root is:"+root1);
	            System.out.println("Second root is:"+root2);
	        }
	        else if(d == 0)
	        {
	            System.out.println("Roots are real and equal");
	            root1 = (-b+Math.sqrt(d))/(2*a);
	            System.out.println("Root:"+root1);
	        }
	        else
	        {
	            System.out.println("Roots are imaginary");
	        }
	    }

	}


