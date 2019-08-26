package basicAnnotations2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass1 
{
	//By Default cases are executed in Alphabatic / Ascending order.
	
	@Test(priority = 0,enabled =false)
	public void test3()
	{
		System.out.println("Test case 3");
	}
	
	@Test(priority = 1,dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("Test case 2");
		throw new SkipException("Skip this test");
	}

}
