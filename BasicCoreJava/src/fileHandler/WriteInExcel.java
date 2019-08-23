package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException 
	{
       String filepath="D:\\SeleniumRepo\\BasicCoreJava\\src\\fileHandler\\TestData.xls";
		
		FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet("Sheet1");
		
		
		//Rows
		HSSFRow row=sheet.getRow(11);
		if(row ==null)
			row=sheet.createRow(11);
		
		//Cell
		HSSFCell cell=row.getCell(2);
		if(cell ==null)
			cell=row.createCell(2);
		
		cell.setCellValue("Vinod");
		
		FileOutputStream filewrite=new FileOutputStream(filepath);
		
		wb.write(filewrite);

	}

}
