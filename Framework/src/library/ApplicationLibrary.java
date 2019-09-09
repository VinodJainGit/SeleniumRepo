package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class ApplicationLibrary 
{
	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Config.chromeDriver);
			dr= new ChromeDriver();
			dr.manage().window().maximize();
		}
		return dr;
	}
	
	public String navigate(WebDriver dr,String url)
	{
		dr.get(url);
		return dr.getTitle();
	}
	
	public boolean isElementPresent(WebDriver dr,By element)
	{
		if(dr.findElements(element).size()>=1)
		{
			return true;
		}else
			return false;
	}

}
