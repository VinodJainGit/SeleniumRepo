package basicAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass4 
{
	@Test
	public void test1() 
	{
		System.out.println("Test 1 class 4");
		
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test 2 class 4");
		
	}
	
	@Test
	public void test3() 
	{
		
		System.out.println("Test 3 class 4");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method class 4");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method class 4");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class 4");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class 4");
		
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void masterMaintainance(String browser) 
	{
		System.out.println("Before CAS");
		System.out.println("Browser name "+browser);
		
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After CAS");
		
	}
	
	
}
