package fileHandler;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader reader=new Xls_Reader("D:\\SeleniumRepo\\BasicCoreJava\\src\\fileHandler\\TestData.xls");
		
		 int rows=reader.getRowCount("sheet1");
		 System.out.println(rows);
		 
		 int cols=reader.getColCount("sheet1");
		 System.out.println(cols);
		 
		 
		 for (int r = 1; r <= rows; r++) 
		 {
			 for (int c = 1; c <= cols; c++) 
			 {
				 System.out.print(reader.getCellData("sheet1", r,c)+" ");
				
			}
			System.out.println();
		}
		 

	}

}
