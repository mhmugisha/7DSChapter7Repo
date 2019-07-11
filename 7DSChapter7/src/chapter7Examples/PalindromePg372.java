package chapter7Examples;

import java.util.Scanner;

public class PalindromePg372 {

	static Scanner console = new Scanner(System.in);
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		int i, j;
		j = len - 1; 
		
		for (i = 0; i <= (len - 1) / 2; i++) 
		{
			if (str.charAt(i) != str.charAt(j)) 
				return false;
			j--; 
		}
		return true; 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter string: ");
		
		String s = console.next();
		
		System.out.println( isPalindrome(s));

	}

}
