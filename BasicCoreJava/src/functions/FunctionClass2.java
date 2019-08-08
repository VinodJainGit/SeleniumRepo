package functions;

public class FunctionClass2 {

	public static void main(String[] args) 
	{
		/*
		 * String MyName=myName("Vinod","Jain"); System.out.println(MyName);
		 */
		
		boolean result=eligible(18);
		if(result)
		{
			System.out.println("You are eligible");
		}
		else
			System.out.println("You are not eligible");

	}
	
	/*
	 * public static String myName(String name, String surname) {
	 * 
	 * return "My Name Is "+name+ " "+surname;
	 * 
	 * }
	 */
	
	public static boolean eligible(int age)
	{
		boolean result=false;
		
		if(age>=18 && age<=30)
		{
			result=true;
		}
		
		else
			result=false;
		
		return result;
	}

}
