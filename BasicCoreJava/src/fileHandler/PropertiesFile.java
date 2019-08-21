package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile
{

	public static void main(String[] args) throws IOException 
	{
		Properties or=new Properties();
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\fileHandler\\OR.properties");
		
		or.load(file);
		
		System.out.println(or.get("name"));
		
		System.out.println(System.getProperty("user.dir"));
		
	}

}
