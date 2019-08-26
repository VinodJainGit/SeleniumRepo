package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HWTestNGClass
{
	@Test(dataProvider="getData2")
	public void loginName(String userName, String passWord) 
	{
		
		System.out.print(userName+" ");
		System.out.println(passWord);
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
				 
				 data[r-1][c-1]=reader.getCellData("sheet1", r,c);
				
			}
			
		 }
		
		
		return data;
		
	}
	

}
