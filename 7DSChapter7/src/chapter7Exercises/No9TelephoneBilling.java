/* Page 223 
 * Write a program that calculates and prints the bill for a cellular telephone
company. The company offers two types of service: regular and premium.
Rates vary based on the type of service and are computed as follows:
Regular service: $10.00 plus first 50 minutes are free. Charges for over 50
minutes are $0.20 per minute.

Premium service: $25.00 plus:
a. For calls made from 6:00 a.m. to 6:00 p.m., the first 75 minutes are free;
	charges for over 75 minutes are $0.10 per minute.
b. For calls made from 6:00 p.m. to 6:00 a.m., the first 100 minutes are
	free; charges for over 100 minutes are $0.05 per minute.
 ______________________________________________________________________________ 
 
Rewrite the program in Programming Exercise 14 from Chapter 4 (cell phone) 
(pasted above) so that it uses the following methods to calculate the billing 
amount. (In this programming exercise, do not output the number of minutes 
during which the service is used.)

a. regularBill: This method calculates and returns the billing amount
	for regular service.
b. premiumBill: This method calculates and returns the billing amount
	for premium service.*/

package chapter7Exercises;

import java.util.Scanner;

public class No9TelephoneBilling {
	//Named Constants Regular:
	static Scanner console = new Scanner(System.in);
	
	static final double BASE_RATE_R = 10;
	static final double INITIAL_FREE_MINUTES_R = 50;
	static final double RATE_PER_MINURE_R =0.2;
	
	static final double BASE_RATE_P = 25;
	static final double INITIAL_FREE_MINS_DAY_P = 75;
	static final double INITIAL_FREE_MINS_NIGHT_P = 100;
	static final double RATE_PER_MIN_DAY_P = 0.1;
	static final double RARE_PER_MIN_NIGHT_P = 0.05;
	
/*___________________________________________________________________________*/	
	//Method main
	public static void main(String[] args) 
	{
		
		char serviceType;
		
		System.out.println("Enter Service Type R/r or P/p: ");
		serviceType = console.next().charAt(0);
		
		switch(serviceType)
		{
		case 'r':
		case 'R': 
		System.out.println("Monthly Bill is: " + "$" + regularBill());
		 break;
		
		case 'p':
		case 'P':
			System.out.println("Monthly Bill is: "+ "$" + premiumBill());	
			break;
			
		default:
			System.out.println("Invalid input.");
		
		}
	}
	
/*____________________________________________________________________________*/
	//Method regularBill
	public static double regularBill()
	{
		double minutes;
		double callCost;
		System.out.println("Enter Minutes: ");
		minutes = console.nextDouble();
		
		if(minutes<=50)
			callCost =  BASE_RATE_R;
		else 
			callCost =  BASE_RATE_R + (minutes - 50)*RATE_PER_MINURE_R;
		
		return callCost;
	}
/*___________________________________________________________________________*/	
	//Method premiumBill:
	
	public static double premiumBill() 
	{
		//Day time billing:
		double dayMinutes;
		double callCostDay;
		System.out.println("Enter day time minutes: ");
		dayMinutes = console.nextDouble();
		if (dayMinutes <=75 )
			callCostDay = 0;
		else
			callCostDay = (dayMinutes - 75)*0.01;
		
		//Night time Billing
		double nightMinutes;
		double callCostNight;
		double totalMonthlyBill;
		System.out.println("Enter night time minutes: ");
		nightMinutes = console.nextDouble();
		if (nightMinutes <=100 )
			callCostNight = 0;
		else
			callCostNight = (nightMinutes-100)*0.05;
		
		totalMonthlyBill = BASE_RATE_P + callCostDay + callCostNight;
		
		return totalMonthlyBill;
	}
/*_________________________________________________________________________*/
	
}
