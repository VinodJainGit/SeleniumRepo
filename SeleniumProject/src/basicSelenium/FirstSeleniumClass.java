package basicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * public class FirstSeleniumClass {
 */	/*@Test
	public void login() 
	{
		
		 * //System.out.println("Inside Login Function");
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Drivers\\chromedriver.exe");
		 * 
		 * ChromeDriver dr=new ChromeDriver();
		 * 
		 * dr.manage().window().maximize();
		 * 
		 * dr.get("http://newtours.demoaut.com/");
		 * 
		 * dr.findElement(By.name("userName")).sendKeys("mercury");
		 * dr.findElement(By.name("password")).sendKeys("mercury");
		 * dr.findElement(By.name("login")).click();
		 * 
		 * dr.findElement(By.linkText("SIGN-OFF")).click();
		 
		
		@Test(priority = 1)
		public void login() throws IOException 
		{
			
			//System.out.println("Inside Login Function");
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			
			dr=new ChromeDriver();
			
			dr.manage().window().maximize();
			
			dr.get("http://newtours.demoaut.com/");
			
		
			
			  dr.findElement(By.name("userName")).sendKeys("mercury");
			  dr.findElement(By.name("password")).sendKeys("mercury");
			  dr.findElement(By.name("login")).click();
			 
			 
		}
		
		@Test(priority = 2,dependsOnMethods = {"login"})
		public void logout() 
		{
			
			dr.findElement(By.linkText("SIGN-OFF")).click();
			
		}

	}

	
}
*/