package functions;

public class FunctionClass {

	public static void main(String[] args) 
	{
		/*
		 * myFirstFunction(); sum(10,20); sum(20,20);
		 */
		int c=sum2(50,50);
		System.out.println(c);
	

	}
	//1. Function with no return types and no arguments
	public static void myFirstFunction() 
	{
		System.out.println("Testing");
	}
	
	//2.Function with two parameters and no return type
	public static void sum(int a, int b) 
	{
		/*
		 * int a=10; int b=20;
		 * 
		 * System.out.println(a+b);
		 */
		System.out.println(a+b);
		
	}
	
	// 3.Function with two parameters and int return type

	public static int sum2(int a, int b) 
	{
		/*
		 * int a=10; int b=20;
		 * 
		 * System.out.println(a+b);
		 */
		return a+b;
		
	}
}
