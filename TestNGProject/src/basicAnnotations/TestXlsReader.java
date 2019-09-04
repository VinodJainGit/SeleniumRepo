package basicAnnotations;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader reader=new Xls_Reader("D:\\SeleniumRepo\\TestNGProject\\src\\basicAnnotations\\TestData.xls");
		
		 int rows=reader.getRowCount("sheet1");
		 //System.out.println(rows);
		 
		 int cols=reader.getColCount("sheet1");
		 //System.out.println(cols);
		
		 
		 for (int r = 1; r <= rows; r++) 
		 {
			 for (int c = 1; c <= cols; c++) 
			 {
				 System.out.print(reader.getCellData("sheet1", r,c)+" ");
				 reader.setCellData("sheet1", r, c, "ABC");
				
			}
			System.out.println();
		}
		 

	}

}
