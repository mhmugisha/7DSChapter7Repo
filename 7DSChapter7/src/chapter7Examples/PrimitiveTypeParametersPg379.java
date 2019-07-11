package chapter7Examples;

public class PrimitiveTypeParametersPg379 {

	public static void main(String[] args) {
		
		int number = 6; //- Execution begins here declares & initializes int variable number 
		System.out.println("Line 6: Before calling"
				+ " method "
				+ "primitiveFormalParameter, "
				+ "number = " + number); //Line 6 - outputs number=6, b4 calling method
										            //primitiveFormalParameter.
		primitiveFormalParameter(number); //Line 7 - calls method primitiveFormalParameter
		  //value of the variable number=6 is passed to the formal parameter num. Control now 
		  //transfers to the method primitiveFormalParameter and skips to line 12.
		System.out.println("Line 8: After calling "
				+ "the method "
				+ "primitiveFormalParameter, "
				+ "number = " + number);// Line 8 - outputs the value of number after calling
										//method pFP. Note there is no change in value of 
										//after calling method pFP.
	}//end main							
	
	public static void primitiveFormalParameter(int num) //Line 10
	
	{ //Line 11
		System.out.println("Line 12: In the method "
				+ "primitiveFormalParameter, "
				+ "before changing, num = "
				+ num); //Line 12 - outputs the value of num before changing it from 6 to 15.
		
			num = 15; //Line 13 - Changes the value of num from 6 to 15
			
		System.out.println("Line 14: In the method "
				+ "primitiveFormalParameter, "
				+ "after changing, num = "
				+ num); //Line 14 - Outputs the value of num now 15. After this statement
						//executes, method primitiveFormalParameter exits and control goes
						//back to method main at line 8.
	} //end primitiveFormalParameter
	
}
/* As you can see from the output, the value of number [ACTUAL PARAMETER], as shown
by the output of the statements in Lines 6 and 8, remains the same even though the
value of its corresponding formal parameter num was changed within the method
primFormalParam. After copying data, a formal parameter[num] of the primitive data type has 
no connection with the actual parameter, so a formal parameter of the primitive data type 
cannot pass any result back to the calling method [ie method pFP can't pass result to main].
When the method executes, any changes made to the formal parameters [in pFP] do not, in 
any way, affect the actual parameters [in this case number = 6 in main]. The actual 
parameter has no knowledge of what is happening to the formal parameter. Thus, formal 
parameters [in this case num =15] of the primitive data types cannot pass information 
outside the method; formal parameters of the primitive data types only provide a one-way link
 between the actual parameters and formal parameters.[one way from actual to formal and not 
 from formal back to actual]

*/