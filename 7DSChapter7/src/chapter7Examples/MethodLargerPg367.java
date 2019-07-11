package chapter7Examples;

import java.util.Scanner;

public class MethodLargerPg367 {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) { // Method main starts here
		double num1;
		double num2;

		System.out.println("The larger of " + "5.6 and 10.8 is " + larger(5.6, 10.8));
		System.out.print("Enter two numbers:");
		num1 = console.nextDouble();
		num2 = console.nextDouble();
		System.out.println();
		System.out.println("The larger of " + num1 + " and " + num2 + " is " + larger(num1, num2));
		// The return from user defined larger is returned to main for output.

		// Input and output for my user defined method power.
		int num3;
		int num4;
		System.out.println("Enter 2 numbers you want to power:");
		num3 = console.nextInt();
		num4 = console.nextInt();
		System.out.println(num3 + " to the " + num4 + " is: " + power(num3, num4));

		System.out.println("Direct predefined method power:" + Math.pow(num3, num4));
		/*
		 * predefined methods can just be called without having to open a new method
		 * like we did for the user defined larger.
		 */

	}// Method main ends here.

	public static double larger(double x, double y) { // Method larger begins here.
		double max;
		if (x >= y)
			max = x;
		else
			max = y;
		return max;
	}// Method larger ends here.

	/*
	 * Below - my attempt to create a user defined method power which uses the
	 * predefined method Math.pow. Note that the variables for this method are
	 * declared within main because the return is output in main. If they are
	 * declared in the power method, main will not execute them. And the output of
	 * power method cannot be in itself b4 "return" because it won't be output and
	 * if put after "return," it's unreachable. Execution stops at return.
	 */
	public static double power(double a, double b) {
		double power;
		power = Math.pow(a, b);
		return power;
	}

}
