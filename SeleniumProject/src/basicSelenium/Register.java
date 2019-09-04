package basicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basicSelenium.Xls_Reader;

public class Register 
{ 
	ChromeDriver dr=null;
	boolean isLoginSuccessful=false;
	
	
	  @Test public void register() throws IOException 
	  { 
	  Xls_Reader reader=new Xls_Reader("D:\\SeleniumRepo\\SeleniumProject\\src\\basicSelenium\\DataForRegister.xls");
	  
	  int rows=reader.getRowCount("sheet1"); //System.out.println(rows);
	  
	  int cols=reader.getColCount("sheet1"); //System.out.println(cols);
	  
	  String [][] data=new String[rows][cols]; 
	  
	  
	  
	  for (int r = 1; r <= rows; r++)
	  {
	      for (int c = 1; c <= cols; c++)
	      {
	      //System.out.print(reader.getCellData("sheet1", r,c)+" ");
	  
	      data[r-1][c-1]=reader.getCellData("sheet1", r,c);
	      signIn();
	      
	      if(isLoginSuccessful)
	      {
	    	  reader.setCellData2("sheet1", r, c, "Y");
	      }
	      else
	      {
	    	  System.out.println("Login Failed");
	      }
	      
	  
	      }
	  
	  }
	  
	  
	  }
	 
	@Test
	//@Parameters({"userName", "passWord"})
	public void signIn() 
	{
		String userName="Abc";
		String passWord="Abc";
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			
	    dr=new ChromeDriver();
			
		dr.manage().window().maximize();
			
		dr.get("http://newtours.demoaut.com/");
		
		
		dr.findElement(By.linkText("REGISTER")).click();
		
		dr.findElement(By.id("email")).sendKeys(userName);
		dr.findElement(By.name("password")).sendKeys(passWord);
		dr.findElement(By.name("confirmPassword")).sendKeys(passWord);
		dr.findElement(By.name("register")).click();
		dr.findElement(By.linkText(" sign-in ")).click();
			
		login(userName, passWord);
	}
	
	@Test(dataProvider="signIn")
	public void login(String userName, String passWord) 
	{
		dr.findElement(By.name("userName")).sendKeys(userName);
		dr.findElement(By.name("password")).sendKeys(passWord);
		dr.findElement(By.name("login")).click();
		isLoginSuccessful=true;
		
	}
}
