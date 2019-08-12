package assignment1;

public class LoopTestProgram12 {
	
	public static void main(String[] args) 
	{
		int x=0;
		
		while(true)
		{
			x=increament(x);
			
			System.out.println("Value of x is --"+x);
			
			if(x>10)
				break;
			
		}
		

	}
	
	public static int increament(int i) 
	{
		return i+1;
		
	}

}
