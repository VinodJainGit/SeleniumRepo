
package basicSelenium;

import java.util.Iterator;
import java.util.List;

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
		  
		  
		  //Dropdown
		  WebElement ele=dr.findElement(By.name("passCount"));
		  
		  Select sel=new Select(ele);
		  
		  sel.selectByIndex(2);
		  Thread.sleep(2000);
		  
		  sel.selectByValue("2");
		  Thread.sleep(2000);
		  
		 sel.selectByVisibleText("4");
		 
		 
		 dr.findElement(By.name("findFlights")).click();
		 
		 
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
		 
		
	}
}
