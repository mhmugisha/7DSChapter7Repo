package chapter7Examples;

public class ParameterPassingSayHello 
{
	public static void sayHello(String name) 
	{
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) 
	{
		sayHello("Mark");
		sayHello("Sweetie");

	}

}
