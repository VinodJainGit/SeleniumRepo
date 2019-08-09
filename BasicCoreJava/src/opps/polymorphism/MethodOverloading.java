package opps.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum(10,20);
		obj.sum(10, 20,30);
	}

	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public int sum(int a)
	{
		return a+a;
	}
}


