package basicAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 
{
	@Test
	public void test1() 
	{
		System.out.println("Test 1 class 3");
		
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test 2 class 3");
		
	}
	
	@Test
	public void test3() 
	{
		
		System.out.println("Test 3 class 3");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method class 3");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method class 3");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class 3");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class 3");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
