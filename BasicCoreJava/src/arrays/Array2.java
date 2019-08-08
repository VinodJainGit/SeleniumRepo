package arrays;

public class Array2 {

	public static void main(String[] args)
	{
		String [][] str =new String[3][2];
		
		//Row 1
		str [0][0]="U1";
		str [0][1]="P1";
		
		//Row 2
		 str [1][0]="U2";
		 str [1][1]="P2";
		 
		//Row 3
		 str [2][0]="U3";
		 str [2][1]="P3";
		 
		 
		/*
		 * for (int i = 0; i <3; i++) {
		 * 
		 * for (int j = 0; j <2; j++) { System.out.print(str[i][j]+" ");
		 * 
		 * 
		 * } System.out.println(); }
		 */
		 
		 for(int i=0; i<str.length ;i++ )
		 {
			 for(int j=0; j<str[i].length; j++)
			 {
				 System.out.print(str[i][j]+" ");
			 }
			 System.out.println();
		 }
		 

	}

}
