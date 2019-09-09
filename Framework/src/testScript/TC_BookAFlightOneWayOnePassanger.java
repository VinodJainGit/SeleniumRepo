package testScript;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import library.ApplicationLibrary;
import pages.HomePage;

public class TC_BookAFlightOneWayOnePassanger 
{
	@Test
	public void script()
	{
		ApplicationLibrary lib=new ApplicationLibrary();
		WebDriver dr=null;
		
		SoftAssert as=new SoftAssert(); //This is soft assertion
		
		try
		{
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
			
			
		}catch (Exception e)
		{
			//Call Recovery scenario
			
		}finally 
		{
			if(dr!=null)
			//dr.close();
			as.assertAll();
			
		}
		
	}
	

}
