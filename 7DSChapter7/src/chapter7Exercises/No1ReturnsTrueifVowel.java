/* Write a value-returning method, isVowel, that returns the value true if a
given character is a vowel, and otherwise returns false. Also write a
program to test your method.*/


package chapter7Exercises;

import java.util.Scanner;

public class No1ReturnsTrueifVowel 

{

	public static void main(String[] args) 
	{
		
		char ch1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter letter: ");
		ch1 = in.next().charAt(0);
		
		System.out.println(isVowel(ch1));
	}
		
	public static boolean isVowel(char ch) //Method isVowel begins here.
		{
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||
					ch=='u'||ch=='U')
				return true;
			return false;
		}	//Method isVowel ends here.
	
		//Surprisingly for me at least for now, when I initialized the actual variables 
}//using ch = in.next().charAt(0) inside method isVowel, program worked well. I did not
//expect this since I thought arguments passed into parameters in a method do not affect
//what happens in main. Need more understanding.	

