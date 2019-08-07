package swapCode;

public class SwapCode1 {
	
	// Swaping with addition and substraction
	
public static void swap(int a,int b) {
		
		a=a+b; //15
		b=a-b; //5
		a=a-b; //10
		
		
		System.out.printf("\na:%d , b:%d", a,b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 5;
		int y= 10;
		
		System.out.printf("x:%d , y:%d", x,y);
		
		swap(x,y);
		
		System.out.printf("\nx:%d , y:%d", x,y);

	}
	
	
	
	

}
