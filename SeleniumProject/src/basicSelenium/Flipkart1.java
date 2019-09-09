package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart1 
{
	@Test
	public void test1() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		WebDriverWait wait=new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']")))).click();
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		Thread.sleep(4000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.cssSelector("img._3togXc")))).click();
		
		WebElement myElement = dr.findElement(By.cssSelector("img._3togXc"));
		((JavascriptExecutor) dr).executeScript("arguments[0].click();", myElement);
		
	}

}
