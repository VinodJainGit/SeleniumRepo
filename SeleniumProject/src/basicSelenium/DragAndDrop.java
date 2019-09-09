package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
        ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
	    act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")), 50, 0).build().perform();	
	    
	}

}
