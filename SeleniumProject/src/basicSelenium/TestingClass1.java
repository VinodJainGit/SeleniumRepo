package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingClass1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		//dr.findElement(By.xpath("//div[@class='_1xHtJz']")).click();
		Thread.sleep(2000);
		
		String parent=dr.getWindowHandle();
		
		WebDriverWait wait= new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.cssSelector("img._3togXc"))));
		
		dr.findElement(By.cssSelector("img._3togXc")).click();
		
		Set <String> wins=dr.getWindowHandles();
		
		for(String w:wins)
		{
			if(!w.equals(parent))
			dr.switchTo().window(w);
			
		}
		
		dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("416404");
		
		

	}

}
