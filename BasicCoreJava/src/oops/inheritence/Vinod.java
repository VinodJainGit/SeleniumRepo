package oops.inheritence;

import opps.polymorphism.MethodOverloading;

public class Vinod {

	public static void main(String[] args) 
	{
		Telephone phone=new Telephone();
		phone.calling();
		
		Mobile m=new Mobile();
		m.texting();
		m.calling();
		
		SmartPhone sm=new SmartPhone();
		sm.internet();
		sm.calling();
		sm.texting();
		

	}

}
