package variablesAndDatatypes;

import functions.AccessModifiers; //AccessModifiers is class of package functions.

public class TestAccessModifiersWithinTheProject extends AccessModifiers
{

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModifiersWithinTheProject obj1=new TestAccessModifiersWithinTheProject();
		obj1.protectedFunction();

	}

}
