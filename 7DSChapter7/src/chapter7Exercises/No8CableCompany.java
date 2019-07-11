package chapter7Exercises;

import java.util.Scanner;

public class No8CableCompany {
	static Scanner console = new Scanner(System.in);
	
	//Named constants - residential customers
	static final double R_BILL_PROC_FEE = 4.50;
	static final double R_BASIC_SERV_COST = 20.50;
	static final double R_COST_PREM_CHANNEL = 7.50;
	
	//Named constants - business customers
	static final double B_BILL_PROC_FEE = 15.00;
	static final double B_BASIC_SERV_COST = 75.00;
	static final double B_BASIC_CONN_COST = 5.00;
	static final double B_COST_PREM_CHANNEL = 50.00;
	
	public static void main(String[] args)
	{
		System.out.println("This program computes a cable bill.");
		System.out.println();
		char customerType;
		int accountNumber;
		
		System.out.print("Enter the account number: ");                           
		accountNumber = console.nextInt();       
		System.out.println();
		System.out.print("Customer type: R/r (Res.), B/b(Biz): ");                 
		customerType = console.next().charAt(0); 
		System.out.println();
		
		switch (customerType)
		{
		case 'r': 							
		case 'R':
			System.out.println();
			System.out.println("Monthly Bill is: " + "$" + residentialCustomer());
			break;
			
		case 'b':
		case 'B':
			System.out.println();
			System.out.println("Monthly Bill is: " + "$" + businessCustomer());
			break;
			
		default: 							
        System.out.println("Invalid customer type.");	
			
		}
	}	
	
	public static double residentialCustomer() 
	{
		int noOfPremChannels;
		double amountDue;
		
		System.out.print("Enter the number of premium channels: ");    
        noOfPremChannels = console.nextInt(); 
		
		amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + noOfPremChannels *
		R_COST_PREM_CHANNEL;
		
		return amountDue;
	}
	
	public static double businessCustomer()
	{
		int noOfBasicServConn;
		int noOfPremChannels;
		double amountDue;

		System.out.print("Enter no. of basic serv. connections: "); 
		noOfBasicServConn = console.nextInt(); 
		System.out.println();
	
		System.out.print("Enter no. of premium channels: "); 
	
		noOfPremChannels = console.nextInt(); 	
		System.out.println();
			
		if (noOfBasicServConn <= 10) 			
		     amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + noOfPremChannels *
		     B_COST_PREM_CHANNEL;
		else
			amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + (noOfBasicServConn - 10) *
			B_BASIC_CONN_COST + noOfPremChannels * B_COST_PREM_CHANNEL;
			
		return amountDue;					
	}
	
}
