/*  In this example, we write a method that rolls a pair of dice until the sum of 
 * the numbers rolled is a specific number. We also want to know the number of 
 * times the dice are rolled to get the desired sum.*/


package chapter7Exercises;

import java.util.Scanner;

public class No5RollDice 
{
 
	//Note that both method rollDice and main are methods of the class RollDicePg370.
	//We have put method rollDice before main but it could have come after. Methods 
	//can be placed anywhere in a class.
	//method rollDice also has to be static bse if it is not, it cannot be called by main
	//which is static.
	public static int rollDice(int num) //Method rollDice starts here.
 {
	 int die1;
	 int die2;
	 int sum;
	 int rollCount = 0;
	 
	 
	 do 
	 {
		 die1 = (int)(Math.random()*6) + 1;
		 die2 = (int)(Math.random()*6) + 1;
		 sum = die1 +die2;
		 rollCount ++;
	 }
	 while (sum != num);
	 return rollCount;
 } // Method rollDice ends here.
	
	
	public static void main(String[] args) //Method main starts here and it calls
	//method rollDice.
 {
		int num;  // I have modified the prog to introduce local variable num in main
		Scanner in = new Scanner(System.in); // So that I can enter num to console than 
		System.out.println("Enter num: "); //just passing constants to method. 
		num = in.nextInt();
		  
		System.out.println("No. of times dice rolled to get sum " + num +" is " + rollDice(num));
		System.out.println("No. of times dice rolled to get sum " + num +" is " + rollDice(num));
		System.out.println("No. of times dice rolled to get sum " + num +" is " + rollDice(num));
		System.out.println("No. of times dice rolled to get sum " + num +" is " + rollDice(num));
		System.out.println("No. of times dice rolled to get sum " + num +" is " + rollDice(num));
		// every time it rolls, potentially returns another value. 
 }
	
}
