package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		String filepath="D:\\SeleniumRepo\\BasicCoreJava\\src\\fileHandler\\TestData.xls";
		
		FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet("Sheet1");
		
		
		//Rows
		HSSFRow row=sheet.getRow(0);
		
		//Cell
		HSSFCell cell=row.getCell(0);
		
		String value=cell.getStringCellValue();
		
		System.out.println(value);
		
	}

}
