package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder
{
	 WebDriver dr;
		
		public FlightFinder(WebDriver dr)
		{
			this.dr=dr;
		}

		
	/*
	 * public void oneWayWith1Passanger(WebDriver dr) throws InterruptedException {
	 * dr.findElement(By.xpath("//input[@value='oneway']")).click();
	 * 
	 * WebElement ele=dr.findElement(By.name("passCount"));
	 * 
	 * Select sel=new Select(ele);
	 * 
	 * sel.selectByValue("1"); Thread.sleep(2000);
	 * 
	 * dr.findElement(By.name("findFlights")).click();
	 * 
	 * dr.findElement(By.name("reserveFlights")).click();
	 * 
	 * 
	 * dr.findElement(By.name("buyFlights")).click();
	 * 
	 * dr.findElement(By.linkText("SIGN-OFF")).click();
	 * 
	 * 
	 * }
	 */
		
		By oneway=By.xpath("//input[@value='oneway']");
		By roundtrip=By.xpath("//input[@value='roundtrip']");
		By passangers=By.name("passCount");
		By continueBtn=By.name("findFlights");
		
		
		public void clicOneWay()
		{
			dr.findElement(oneway).click();
			
		}
		
		public void selectPassanger(String numOfPass)
		{
			Select sel =new Select(dr.findElement(passangers));
			sel.selectByVisibleText(numOfPass);
		}
		
		public void clickOnContinue()
		{
			dr.findElement(continueBtn).click();
		}
		
		
		
}
