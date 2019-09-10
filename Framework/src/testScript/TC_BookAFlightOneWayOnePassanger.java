package testScript;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import library.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class TC_BookAFlightOneWayOnePassanger 
{
	WebDriver dr=null;
	@Test
	public void login()
	{
		ApplicationLibrary lib=new ApplicationLibrary();
	   	
		
		SoftAssert as=new SoftAssert(); //This is soft assertion
		
		
			//Launche browser
			dr=lib.launchBrowser("Chrome");
			Assert.assertTrue(dr!=null); //This is hard assertion
			
			//Navigate to the application
			lib.navigate(dr, Config.url);
			String title=dr.getTitle();
			
			//Login
			HomePage page1=new HomePage(dr);
			page1.login(Config.globalUser, Config.globalPassword);
			
			//Validation
			as.assertTrue(!dr.getTitle().equals(title)); //Checked title of two pages i.e. home page and login
			
			//if(dr!=null)
			//dr.close();
			as.assertAll();
			
	}
	
	@Test(dependsOnMethods = {"login"})
	public void bookAFLight() 
	{
		FlightFinder flight= new FlightFinder(dr);
		
		flight.clicOneWay();
		flight.selectPassanger("1");
		flight.clickOnContinue();
		
		
	}
	

}
