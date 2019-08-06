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
		
		swap(x,y);
		System.out.printf("x:%d, y:%d",x,y);
	}

}
//In java Primitive types are always pass by values.