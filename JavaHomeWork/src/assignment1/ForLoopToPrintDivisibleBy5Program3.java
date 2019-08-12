package assignment1;

public class ForLoopToPrintDivisibleBy5Program3 {

	public static void main(String[] args) 
	{
		int i=100;
		
		for(int j=1;j<=i;j++) 
		{
			if(j%5==0) 
			{
			  System.out.println(j+ " is divisible by 5");
			}
			else
			System.out.println(j);
		}

	}

}
