package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		
		try
		{
			
		System.out.println(a/b);
		
		}catch(Exception e)
		{
			
			System.out.println("Exception Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("Anand");
		
	}

}
