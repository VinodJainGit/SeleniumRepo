package assignment1;

public class GreatestNumberInArrayProgram8 {

	public static void main(String[] args) 
	{
		int [] arr=new int [] {20,30,50,4,71,100};
		
		System.out.println("Input array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max number from array is : "+max);

	}

}
