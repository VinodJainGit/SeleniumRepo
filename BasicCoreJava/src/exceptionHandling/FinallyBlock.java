package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		try 
		{
			int a=20;
			int b=0;
			
			System.out.println(a/b);
			
			String str="Vinod";
			System.out.println(str.charAt(2));
			
			
		} catch (Exception e)
        {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally");
		}
		

	}

}
