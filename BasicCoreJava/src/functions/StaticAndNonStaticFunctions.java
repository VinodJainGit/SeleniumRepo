package functions;

public class StaticAndNonStaticFunctions {
	
	public static String name="Vinod";
	public  String surname="Jain";
	
	
	public static void fun1()
	{
		System.out.println(name);
		StaticAndNonStaticFunctions obj = new StaticAndNonStaticFunctions();
		System.out.println(obj.surname);
		
	}
	
	public void fun2()
	{
		System.out.println(name);
		System.out.println(surname);
		
	}

	public static void main(String[] args) 
	{
		/*
		 * System.out.println(name); fun1();
		 * 
		 * StaticAndNonStaticFunctions obj=new StaticAndNonStaticFunctions();
		 * System.out.println(obj.surname); obj.fun2();
		 */

		//static variables and functions calling from second class
		System.out.println(StaticAndNonStaticFunctions2.name);
		StaticAndNonStaticFunctions2.fun1();
		
		//non static variables and functions calling from second class
		StaticAndNonStaticFunctions2 obj=new StaticAndNonStaticFunctions2();
		 System.out.println(obj.surname);
		obj.fun2();
	}

}
