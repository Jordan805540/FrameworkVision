package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	Properties prop;
	FileInputStream fis;
	
	
	public BaseClass() throws IOException
	{
		prop = new Properties();
		
		  String filepath = System.getProperty("user.dir")+"\\config.properties";
		  
		  fis = new FileInputStream(filepath);
		  
		 prop.load(fis); 
		
	}

}
