
/* The following formula gives the distance between two points (x1, y1) and
(x2, y2) in the Cartesian plane:

		Sqrt[(x2-x1)(x2-x1) + (y2-y1)*(y2-y1)]

Given the center and a point on a circle, you can use this formula to find the
radius of the circle. Write a program that prompts the user to enter the
center and a point on the circle. The program should then output the circle’s
radius, diameter, circumference, and area. Your program must have at least
the following methods:

a. distance: This method takes as its parameters four numbers that
	represent two points in the plane and returns the distance between them.
b. radius: This method takes as its parameters four numbers that represent
	the center and a point on the circle, calls the method distance to find
	the radius of the circle, and returns the circle’s radius.
c. circumference: This method takes as its parameter a number that
	represents the radius of the circle and returns the circle’s circumference.
	(If r is the radius, the circumference is 2pr.)
d. area: This method takes as its parameter a number that represents the radius
	of the circle and returns the circle’s area. (If r is the radius, the area is pr2.)
e. Assume that pi = 3.1416.*/



package chapter7Exercises;

import java.util.Scanner;

public class No7Circleproperties {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x cordinate of the center Xc: ");
		double Xc = in.nextDouble();
		System.out.println("Enter y cordinate of the center Yc: ");
		double Yc = in.nextDouble();
		
		System.out.println("Enter x cordinate of point on circle Xp: ");
		double Xp = in.nextDouble();
		System.out.println("Enter y cordinate of point on circle Yp: ");
		double Yp = in.nextDouble();
		
		System.out.println("Radius = " + radius(Xc,Yc,Xp,Yp));
		System.out.println("Diameter = " + 2 * radius(Xc,Yc,Xp,Yp));
		System.out.printf("Circumference = %.2f %n" , circumference(Xc,Yc,Xp,Yp));
		System.out.printf("Area = %.2f " , area(Xc,Yc,Xp,Yp));
        //Used printf to format area and circumference to 2 decimal places. 
	}
	
/*________________________________________________________________________________*/
   //Method distance:
	public static double distance(double x1, double y1, double x2, double y2)
    {
    	double z = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    		return z;
    	
    }
    
/*________________________________________________________________________________*/
  //Method radius:
	//We could have used any other parameters here say (r,s,t,u) 
    
    public static double radius(double x1, double y1, double x2, double y2)
	{
		double radius = distance(x1, y1, x2, y2);

		return radius;
	}
/*_________________________________________________________________________________*/		//
	//Method circumference:
    //We could have used any other parameters here say (r,s,t,u).
    
	public static double circumference(double x1, double y1, double x2, double y2)
	{
		double Circumference = 2*3.1416*radius(x1, y1, x2, y2);
		return Circumference;
	}
/*_________________________________________________________________________________*/
	//We could have used other parameters here say (r,s,t,u) or a, b, c, d.
	
	public static double area(double x1, double y1, double x2, double y2) 
	{
		double area = 3.1416*(radius(x1, y1, x2, y2)*radius(x1, y1, x2, y2));
		
		return area;
	}
/*_________________________________________________________________________________*/

}
