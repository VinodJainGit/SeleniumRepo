package basicAnnotations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Xls_Reader 
{
	String filepath=null;
	
	public Xls_Reader(String filepath)
	{
		this.filepath=filepath;
		
	}
	
	public String getCellData(String sheetName,int rowNum, int colNum) throws IOException
	{
       FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet(sheetName);
		
		
		//Rows
		HSSFRow row=sheet.getRow(rowNum-1);
		
		
		//Cell
		HSSFCell cell=row.getCell(colNum-1);
		
		String value=cell.getStringCellValue();
		
		
		return value;
		
	}
	
	
	/*
	 * public String getCellData(String sheetName,int rowNum, String colName) throws
	 * IOException { FileInputStream file=new FileInputStream(filepath);
	 * 
	 * 
	 * //Work book HSSFWorkbook wb=new HSSFWorkbook(file);
	 * 
	 * //Work sheet HSSFSheet sheet= wb.getSheet(sheetName);
	 * 
	 * 
	 * //Rows HSSFRow row=sheet.getRow(rowNum-1);
	 * 
	 * 
	 * 
	 * 
	 * //Cell Cell cell1 = row.getCell(i,Row.CREATE_NULL_AS_BLANK); String
	 * cellValue1 = cell1.getStringCellValue(); HSSFCell cell=row.getCell(colName);
	 * 
	 * String value=cell.getStringCellValue();
	 * 
	 * 
	 * return value;
	 * 
	 * }
	 */
	
	
	public void setCellData(String sheetName,int rowNum, int colNum,String value) throws IOException
	{
        FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet(sheetName);
		
		
		//Rows
		HSSFRow row=sheet.getRow(rowNum-1);
		if(row ==null)
			row=sheet.createRow(rowNum-1);
		
		//Cell
		HSSFCell cell=row.getCell(colNum-1);
		if(cell ==null)
			cell=row.createCell(colNum-1);
		
		cell.setCellValue(value);
		
		FileOutputStream filewrite=new FileOutputStream(filepath);
		
		wb.write(filewrite);
		
		
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
       FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet(sheetName);
		
		
		return sheet.getLastRowNum()+1;
		
	}
	
	public int getColCount(String sheetName) throws IOException
	{
       FileInputStream file=new FileInputStream(filepath);
		
		
		//Work book
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet= wb.getSheet(sheetName);
		
		return sheet.getRow(0).getLastCellNum();
		
	}

}
