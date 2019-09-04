 package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass3 
{
	ChromeDriver dr=null;
	@Test
	public void test1() 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
		System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width"));
		
		
		
		
		
		
		/*
		 * dr.findElement(By.name("userName")).sendKeys("mercury");
		 * dr.findElement(By.name("password")).sendKeys("mercury"); //Button
		 * dr.findElement(By.name("login")).click();
		 */
		
	}

}
