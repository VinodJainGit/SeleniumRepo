package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@Test(dataProvider="getData2")
	public void loginName(String userName, String passWord) 
	{
		
		System.out.println(userName);
		System.out.println(passWord);
	}
	
	@DataProvider
	public String [][] getData() 
	{
		String [][] data=new String[3][2];
		
		//Row 1
		data[0][0]="User1";
		data[0][1]="Password1";
		
		//Row 2
		data[1][0]="User2";
		data[1][1]="Password2";
		
		//Row 3
		data[2][0]="User3";
		data[2][1]="Password3";
		
		
		return data;
		
	}
	
	@DataProvider
	public String [][] getData2() throws IOException 
	{
		Xls_Reader reader=new Xls_Reader("D:\\SeleniumRepo\\TestNGProject\\src\\basicAnnotations\\TestData.xls");
		
		 int rows=reader.getRowCount("sheet1");
		 //System.out.println(rows);
		 
		 int cols=reader.getColCount("sheet1");
		 //System.out.println(cols);
		 
		 String [][] data=new String[rows][cols];
		 
		 for (int r = 1; r <= rows; r++) 
		 {
			 for (int c = 1; c <= cols; c++) 
			 {
				// System.out.print(reader.getCellData("sheet1", r,c)+" ");
				 
				
				
			}
			
		 }
		
		
		return data;
		
	}
	
}
