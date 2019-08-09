package functions;



public class AccessModifiers 
{
	public static void main(String[] args) 
	{
		
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		
		obj.privateFunction();
		
		obj.defaultFunction();
		
		obj.protectedFunction();

	}

	public void publicFunction() 
	{
		System.out.println("Public function");
	}
	
	private void privateFunction() 
	{
		System.out.println("Private function");
	}
	
	protected void protectedFunction() 
	{
		System.out.println("Protected function");
	}
	
	void defaultFunction() 
	{
		System.out.println("Default function");
	}
}
