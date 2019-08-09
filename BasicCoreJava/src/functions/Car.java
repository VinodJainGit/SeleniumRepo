package functions;

public class Car 
{
	static int wheels=4;
	String color="White";
	String model="VDI";
	
	public void specification() 
	{
		System.out.println(color+" "+model+" car is having"+" "+wheels+ " wheels");
	}
	
	// Default constructor
	public Car()
	{
		
	}
	
	//Parameterized constructor
	public Car(String color1, String model1)
	{
		color=color1;
		model=model1;
	}

}
