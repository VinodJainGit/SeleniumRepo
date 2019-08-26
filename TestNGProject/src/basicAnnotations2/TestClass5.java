package basicAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass5 
{
	@Test
	public void test1() 
	{
		System.out.println("Test 1 class 5");
		
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test 2 class 5");
		
	}
	
	@Test
	public void test3() 
	{
		
		System.out.println("Test 3 class 5");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method class 5");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method class 5");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class 5");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class 5");
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
		
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("After Suite");
		
	}
	
	
	
	
	
	
	
	
	
	

}
