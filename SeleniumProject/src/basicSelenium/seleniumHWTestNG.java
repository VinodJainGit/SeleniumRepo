package basicSelenium;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class seleniumHWTestNG 
{	
	ChromeDriver dr=null;
	
	
	@Test(priority = 1)
	public void login() throws IOException 
	{
		
		//System.out.println("Inside Login Function");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		
		  Xls_Reader reader=new Xls_Reader(
		  "D:\\SeleniumRepo\\SeleniumProject\\src\\basicSelenium\\TestData.xls");
		  
		  int rows=reader.getRowCount("sheet1");
		  
		  int cols=reader.getColCount("sheet1");
		  
		  for (int r = 1; r <= rows; r++)
		  { 
			  for (int c = 1; c <= cols; c++) 
		     {
		  
				  dr.findElement(By.name("userName")).sendKeys(reader.getCellData("sheet1", r, c));
				  dr.findElement(By.name("password")).sendKeys(reader.getCellData("sheet1", r, c));
				  dr.findElement(By.name("login")).click();
		  
		     }
		  
		  }
		 
		 
		
		
		/*
		 * dr.findElement(By.name("userName")).sendKeys("mercury");
		 * dr.findElement(By.name("password")).sendKeys("mercury");
		 * dr.findElement(By.name("login")).click();
		 */
		 
	}
	
	@Test(priority = 2,dependsOnMethods = {"login"})
	public void logout() 
	{
		
		dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}

}
