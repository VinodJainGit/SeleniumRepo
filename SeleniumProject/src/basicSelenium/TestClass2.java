
package basicSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass2 
{

	ChromeDriver dr=null;
	
	@Test
	public void bookAFlight() throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		
		
		  dr.findElement(By.name("userName")).sendKeys("mercury");
		  dr.findElement(By.name("password")).sendKeys("mercury");
		  //Button
		  dr.findElement(By.name("login")).click();
		  
		  //Radio button
		  dr.findElement(By.xpath("//input[@value='oneway']")).click();
		  
		  
		  //Dropdown Passengers
		  WebElement ele=dr.findElement(By.name("passCount"));
		 
		  
		  Select sel=new Select(ele);
		  
		  sel.selectByIndex(2);
		  Thread.sleep(2000);
		  
		  sel.selectByValue("2");
		  Thread.sleep(2000);
		  
		 sel.selectByVisibleText("4");
		 
		
		  // Dropdown Departing From 
		 WebElement ele1=dr.findElement(By.name("fromPort"));
		  
		  Select sel2=new Select(ele1);
		  
		  sel2.selectByValue("Frankfurt"); Thread.sleep(2000);
		 
		 
		 
		
		 //Continue button
		 dr.findElement(By.name("findFlights")).click();
		 
		 //Table
		 WebElement table=dr.findElement(By.xpath("//table[@cellpadding='2'][@cellspacing='1']/tbody"));
		 
		 List<WebElement> rows =table.findElements(By.tagName("tr"));
		 
		 for(WebElement r:rows)
		 {
			 List<WebElement> cols =r.findElements(By.tagName("td"));
			 
			 for(WebElement c:cols)
			 {
				 
				 System.out.println(c.getText());
			 }
			 
		 }
		 
		 dr.findElement(By.name("reserveFlights")).click();
		 
		 dr.findElement(By.name("ticketLess")).click();
		 
		 System.out.println(dr.findElement(By.name("ticketLess")).isSelected());
		
		 WebElement country=dr.findElement(By.name("delCountry"));
		 
		 Select selcntry=new Select(country);
		 
		 selcntry.selectByIndex(2);
		 
		Thread.sleep(2000); 
		 
		Alert alt= dr.switchTo().alert();
		 
		System.out.println(alt.getText());
		
		//alt.accept();
		 
		alt.dismiss();
		dr.findElement(By.name("buyFlights")).click();
		
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		
		
		
		
		
		
		
		dr.close(); 
		 
		 
		 
		 
	}
}
