package exceptionHandling;

import java.io.FileInputStream;

public class MultipleCatchBlocks {

	public static void main(String[] args)
	{
		try {
		//Step 1
		System.out.println(10/10);
		
		//Step 2
		String str="Anand";
		System.out.println(str.charAt(7));
		
		//Step 3
		System.out.println("Step 3");
		
		//Step 4
		FileInputStream file=new FileInputStream("");
		
		
		//Step 5
		int [] arr= {};
		System.out.println(arr[0]);
		
		}catch(ArithmeticException e)
		{
			System.out.println("Handels arithmetic exception");
		}catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Handels String Index Out Of Bounds exception");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
