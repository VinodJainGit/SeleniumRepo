package assignment1;

public class PyramidProgram5_2 {

	public static void main(String[] args) 
	{
		int row=6;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
