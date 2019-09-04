package basicSelenium;

import java.io.IOException;

import basicSelenium.Xls_Reader;

public class MethodTesting {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader reader=new Xls_Reader("D:\\SeleniumRepo\\SeleniumProject\\src\\basicSelenium\\TestData.xls");
		
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
				 reader.setCellData2("sheet1", r, c, "Y");
				 
				
				
			}
			
		 }
		

	}

}
