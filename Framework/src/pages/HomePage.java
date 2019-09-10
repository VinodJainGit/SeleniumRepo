package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	 WebDriver dr;
		
		public HomePage(WebDriver dr)
		{
			this.dr=dr;
		}

		By userName=By.name("userName");
		By passWord=By.name("password");
		By login=By.name("login");
		
		public void login(String userName,String passWord)
		{
			
			
			dr.findElement(this.userName).sendKeys(userName);
			dr.findElement(this.passWord).sendKeys(passWord);
			dr.findElement(login).click();
			
			
		}


}
