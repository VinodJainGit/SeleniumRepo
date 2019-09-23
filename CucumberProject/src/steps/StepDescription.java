package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDescription 
{
	WebDriver dr;
	
	@Given("^Application is up and running\\.$")
	public void application_is_up_and_running() throws Throwable {
		System.out.println("Application is up and running");
		
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
	    
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
		System.out.println("Enter credentials");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");

		dr.findElement(By.name("login")).click();
	   
	}

	@Then("^I should be login successfully$")
	public void i_should_be_login_successfully() throws Throwable {
		System.out.println("User should be logged in successfully");
		
		int size=dr.findElements(By.xpath("//*[@value='oneway']")).size();
		
		if(size>=1)
		{
			System.out.println("Login successfully");
		}
		else
		{
		   System.out.println("login failed");	
		}
		dr.close();
	   
	}
	
	@When("^I enter (.*?) and (.*?) on login screen$")
	public void i_enter_mercury_and_mercury_on_login_screen(String username, String password) throws Throwable 
	{
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
	    
	}

}
