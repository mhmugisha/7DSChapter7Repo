package chapter7Examples;

import java.util.Scanner;

public class Checking {

	public static void main(String[] args) {
		
		
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = in.next();
		
		
		System.out.println("Enter Index i: ");
		int i = in.nextInt();
		
		System.out.print(str.charAt(i));
		System.out.print(str.charAt(i+1));
		System.out.print(str.charAt(i+2));
		System.out.print(str.charAt(i+3));
		System.out.println(str.charAt(i+4));
		
		System.out.println("Enter Index j: ");
		int j = in.nextInt();
		
		System.out.print(str.charAt(j));
		System.out.print(str.charAt(j-1));
		System.out.print(str.charAt(j-2));
		System.out.print(str.charAt(j-3));
		System.out.println(str.charAt(j-4));
		
		
		
	}

}
