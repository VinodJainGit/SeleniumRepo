package swapCode;

public class Swap {

	public static void swap(int a,int b) {
		
		int t=a;
		a=b;
		b=t;
		
		System.out.printf("\na:%d, b:%d \n",a, b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 10;
		int y=20;
		
		System.out.printf("x:%d, y:%d",x, y);
		
		/*
		 * swap(x,y); System.out.printf("x:%d, y:%d",x,y);
		 */
		//You can call swap function or you can also write code inside main directly
		
		int t=x;
		x=y;
		y=t;
		
		//System.out.printf("\nx:%d, y:%d \n",x, y);
		System.out.println("\n");
		System.out.println(x);
		System.out.println(y);
		
	}

}
//In java Primitive types are always pass by values.