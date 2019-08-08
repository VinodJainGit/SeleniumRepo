package functions;

public class StaticAndNonStaticFunctions2 {
	
	public static String name="Vinod";
	public  String surname="Jain";
	
	
	public static void fun1()
	{
		
		
	}
	
	public void fun2()
	{
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(name);
		fun1();
		
		StaticAndNonStaticFunctions2 obj=new StaticAndNonStaticFunctions2();
		System.out.println(obj.surname);
		obj.fun2();

	}

}
