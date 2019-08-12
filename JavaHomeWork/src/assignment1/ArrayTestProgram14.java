package assignment1;

public class ArrayTestProgram14 {

	public static void main(String[] args) 
	{
		String arr1[]=new String[3];
		String arr2[]=new String[3];
		String arr3[]=new String[3];
		
		arr1[0]="A";
		arr1[1]="B";
		arr1[2]="C";
		
		arr2[0]="1";
		arr2[1]="2";
		arr2[2]="3";
		
		arr3[0]="Sangli";
		arr3[1]="Karad";
		arr3[2]="Satara";
		
			printAll(arr1);
			printAll(arr2);
			printAll(arr3);
		
	}
	
	public static void printAll(String str[]) 
	{
		for (int i = 0; i< str.length; i++) 
		{
			System.out.println(str[i]);
			
		}
	}
}
