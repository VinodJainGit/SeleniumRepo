package swapCode;

public class SwapCode2 {
	
	//Swaping with multiplication and division
	
	public static void swap(int x , int y) {
		
		x=x*y; //50
		y=x/y; //5
		x=x/y; //10
		
				
       System.out.printf("\n x: %d , y:%d ", x ,y);
		
	}

	public static void main(String[] args) {
		int x=5;
		int y=10;
		
		System.out.printf("\n x: %d , y:%d ", x ,y);
		
		swap(x, y);
		System.out.printf("\n x: %d , y:%d ", x ,y);
	

	}

}
