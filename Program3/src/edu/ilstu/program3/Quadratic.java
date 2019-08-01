/*
 *File name: Quadratic.java
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
 * Contains the equations, methods, and variables to be called and tested using the tester
 * @author Matthew Gerat
 *
 */
public class Quadratic
{
	private int a, b ,c;
	
	public Quadratic()
	{
		a = 1;
		b = 1;
		c = 1;
	}
	
	public Quadratic(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public int getA()
	{
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public int getB()
	{
		return b;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public int getC()
	{
		return c;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	public void print()
	{
		String var = a + "x^2";
		if(a < 0)
		{
			
		}
		else if(a > 0)
		{
		
		}
		else
		{
			var = "";
		}
		
		
		
		if(b < 0)
		{
			int opp = (-1) * b;
			var = var + "-" + opp + "x";
		}
		else if(b > 0)
		{
			var = var + "+" + b + "x";
		}
		else
		{
			
		}
		
			
		if(c < 0)
		{
			int opp2 = (-1) * c;
			var = var + "-" + opp2;
		}
		else if(c > 0)
		{
			var = var + "+" + c;
		}
		else
		{
			var = "";
		}
		
		System.out.println(var);
	}
	
	
	public void add(Quadratic quadOther)
	{
		this.a = this.a + quadOther.getA();
		this.b = this.b + quadOther.getB();
		this.c = this.c + quadOther.getC();
	}
	public void subtract(Quadratic quadOther)
	{
		this.a = this.a - quadOther.getA();
		this.b = this.b - quadOther.getB();
		this.c = this.c - quadOther.getC();
	}
	public void multiply(int integer)
	{
		this.a = this.a * integer;
		this.b = this.b * integer;
		this.c = this.c * integer;
	}
	
	public boolean isMultipleOf(int integer)
	{
		double remainder1 = this.a % integer;
		double remainder2 = this.b % integer;
		double remainder3 = this.c % integer;
		
		if(remainder1 == 0 && remainder2 == 0 && remainder3 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public int evaluate(int x)
	{
		return (a * x * x) + (b * x) + c;
	}
	
	
	

}
