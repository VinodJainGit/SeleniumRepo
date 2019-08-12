package assignment1;

public class ForLoopForEvenNumbersProgram2 {

	public static void main(String[] args) 
	{
		/*
		 * int i=100;
		 * 
		 * System.out.println("Even numbers from 1 To 100 Are : "); for (int j = 1;
		 * j<=i; j++) { if(j%2==0) { System.out.println(j); } }
		 */
		int i=1;
		
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
				i++;
		}
	}

}
