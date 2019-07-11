//program to determine the largest number out of a list.


package chapter7Examples;

import java.util.Scanner;

public class LargestNumberPg374 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double num;
		double max;
		int count;
		
		System.out.println("Enter 10 Numbers: ");
		num = in.nextDouble(); //This initializes num to max. 
		max = num;//the number entered is assigned max. 

		for (count = 1; count < 10; count ++)
		{
			num = in.nextDouble(); 
			max = larger(max, num); 
		}
		System.out.println("The largest number is "
				+ max);
	}
	
	public static double larger(double x, double y) 
	{
		double max;
		if (x>=y)
			max = x;
			else 
				max = y; 
			return max;
		
	}
	
	
	

}
