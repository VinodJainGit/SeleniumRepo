package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args)
	{
		try {
			eligibility(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void eligibility(int age) throws Exception 
	{
		if(age>18 && age<=30)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new Exception("You crossed age limit");
		}
	}

}
