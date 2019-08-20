package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyWord {

	public static void main(String[] args) 
	{
		divide(10,0);
		try {
			readData("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void readData(String filepath) throws FileNotFoundException 
	{
		FileInputStream file= new FileInputStream(filepath);
		
	}
	
	public static void divide(int a,int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}

}
