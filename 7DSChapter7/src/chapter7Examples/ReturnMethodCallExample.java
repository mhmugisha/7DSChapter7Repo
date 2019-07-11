package chapter7Examples;

import java.util.Scanner;

public class ReturnMethodCallExample {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = in.nextInt();
		System.out.println("Enter b: ");
		b = in.nextInt();
		
		
		System.out.println("Minimum value is " + minValue(a,b));
	}

	//Note: I have deliberately used same variables a, b in the methods main and minValue.
	//Though they are the same, they are completely independent of each other bse they are 
	//local to their respective methods. The a and b in main have no bearing on the a, b in
	//minValue. I could have used any other variables in the place of a and b in minValue.
	//When calling this method, it is called by its name (and not by "min) and then its return 
	//value (min) replaces it in the calling method expression or output statement. 
	//Therefore, min has meaning only within the method minValue. That is why it has to be 
	//declared within minValue.
	
	public static int minValue(int a, int b) 
	{
		int min; // my note - min is local to the method minValue
		if (a>b)
			min = b;
		else min = a;
				
		return min;
	}
	
}
