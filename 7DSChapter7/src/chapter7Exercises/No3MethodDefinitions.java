/* 
a. Write the definition of method Divine so that it returns the sum of
	x and y if x is greater than y; otherwise, it should return x minus 2
	times y.

b. Write the definition of method eliezer as follows:
	i. Read a number and store it in z.
	ii. Update the value of z by adding the value of a to its previous value.
	iii. Assign the variable first the value returned by method Divine with
	the parameters 6 and 8.
	iv. Update the value of first by adding the value of x to its previous value.
	v. If the value of z is more than twice the value of first, return z;
	otherwise, return 2 times first minus z.
	
c. Write a Java program that tests parts a and b. (Declare additional variables
	in the method main, if necessary.) */





package chapter7Exercises;

import java.util.Scanner;

public class No3MethodDefinitions {

	////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) 
	{  
	  int num1;
	  int num2;
	  
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter two integers for method Divine: ");
	  num1 = in.nextInt();
	  num2 = in.nextInt();
	  
	  System.out.println("The output from method Divine is: " + Divine(num1, num2));
	  
	  int xmain;
	  double amain;
	  System.out.println("Enter two numbers for method eliezer: ");
	  xmain = in.nextInt();
	  amain = in.nextInt();
	
	  System.out.println("The output from method eliezer is: " + eliezer(xmain, amain));
	  
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static int Divine(int x, int y)
	{
		if(x > y)							//This is part (a).
			return x + y;
		return (x - 2)*y;
	}
	////////////////////////////////////////////////////////////////////////////////////////
	
	public static double eliezer(int x, double a)
	
	{
	  int first;
	  double z = 0;
	         z = z + a;
	         first = Divine(6,8);  // Method divine called by method Eliezer. Note that the 
	         first = first + x;    //return from Divine(6,8) is being used as a constant.
	         					   //method is not using arguments passed to main when it is 
	         if(z > 2*first)		//called in main.
	        	 return z;
	         return 2*first -z;
	
	}
	///////////////////////////////////////////////////////////////////////////////////////
	
}
