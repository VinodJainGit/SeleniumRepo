package arrays;

public class Array {

	public static void main(String[] args) {
		
		String [] std = new String[9];
		
		std[0]="Pooja";
		std[1]="Akshay";
		std[2]="Pranali";
		std[3]="Daya";
		std[4]="Vijay";
		std[5]="Sumit";
		std[6]="Gauri";
		std[7]="Anuradha";
		std[8]="Vinod";
		
		/*
		 * System.out.println(std[0]); System.out.println(std[1]);
		 * System.out.println(std[2]); System.out.println(std[3]);
		 */
		
		/*
		 * for (int i = 0; i < std.length; i++) { //String string = std[i];
		 * System.out.println(std[i]); }
		 */
		//Or
		
		for(int i=0; i<=8; i++)
		{
			System.out.println(std[i]);
		}
		

	}

}
