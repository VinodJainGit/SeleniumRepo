package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TicketBook2 
{
	ChromeDriver dr=null;
	
	@Test
	public void bookTicket2() throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		
		  dr.findElement(By.name("userName")).sendKeys("mercury");
		  dr.findElement(By.name("password")).sendKeys("mercury");
		  //Button
		  dr.findElement(By.name("login")).click();
		  
		  dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		  
          WebElement ele=dr.findElement(By.name("passCount"));
		  
		  Select sel=new Select(ele);
		  
		  sel.selectByValue("4");
		  Thread.sleep(2000);
		  
		  dr.findElement(By.name("findFlights")).click();
		  
		  dr.findElement(By.name("reserveFlights")).click();
		  
		  
		 dr.findElement(By.name("buyFlights")).click();
		  
		 dr.findElement(By.linkText("SIGN-OFF")).click();
		 
		 
		 dr.close();
		  
		  

		
		
	}
	

}
