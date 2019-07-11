package chapter7Exercises;

import java.util.Scanner;

public class No13MeanStandardDeviation 
{
	public static void main(String[] args) 
	
	{
		Scanner in = new Scanner(System.in);
		double X1, X2, X3, X4, X5;
		System.out.println("Enter five integers: ");
		X1 = in.nextInt(); 
		X2 = in.nextInt();
		X3 = in.nextInt();
		X4 = in.nextInt();
		X5 = in.nextInt();
		
		System.out.println("The mean of the nos. is: " + mean(X1,X2,X3,X4,X5));
		System.out.printf("The Standard Deviation is: %.2f", standardDeviation(X1,X2,X3,X4,X5));
	}
/*___________________________________________________________________________*/
    public static double mean(double x1, double x2, double x3, double x4, double x5) 
    {
    	double mean;
    	mean = (x1 + x2 + x3 + x4 + x5)/5;
    	return mean;
    }
/*___________________________________________________________________________*/	
	
    public static double standardDeviation(double x1, double x2, double x3, double x4, double x5) 
    {
    	double standardDeviation;
    	double variance;
    		    variance = ((x1-mean(x1,x2,x3,x4,x5))*(x1-mean(x1,x2,x3,x4,x5))+
    						(x2-mean(x1,x2,x3,x4,x5))*(x2-mean(x1,x2,x3,x4,x5))+
    						(x3-mean(x1,x2,x3,x4,x5))*(x3-mean(x1,x2,x3,x4,x5))+
    						(x4-mean(x1,x2,x3,x4,x5))*(x4-mean(x1,x2,x3,x4,x5))+
    						(x5-mean(x1,x2,x3,x4,x5))*(x5-mean(x1,x2,x3,x4,x5)))/5;
    		    standardDeviation = Math.sqrt(variance);
    		    
    	return standardDeviation;
    }	
	
}
