package chapter7Examples;

public class ParameterPassingExample {

	public static void Add(int a, int b, int c) 
	{
		System.out.println(a + b + c);
	}
	
	
	public static void main(String[] args) 
	{
		Add(10, 10, 10);
		Add(1000000, 1, 2);
		Add(20, 100,100);
		Add(20, 100,100);
		Add(20, 100,100);
	}

}
