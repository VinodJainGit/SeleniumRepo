package conditionalStatements;

public class NestedIfStatements {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b) //Like Login
		{
			if (a>c) { //Like compose
				System.out.println("A is greatest");
				
			}			
		}
		
		if(a>b) //Like Login
		{
			if (a>c) { //Inbox visibility
				System.out.println("A is greatest");
				
			}	
			if (a>c) { //Draft visibility
				System.out.println("A is greatest");
				
			}	
		}
		}
		

	}


