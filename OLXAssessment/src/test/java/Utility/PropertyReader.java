package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	static FileInputStream inpFile;
	public static String browserReader(String b) throws Exception
	{
		
			File file=new File("./src/main/java/Configure.properties");
			FileInputStream inpFile=new FileInputStream(file);
			Properties prop=new Properties();
			prop.load(inpFile);
			String browser=prop.getProperty(b);
			return browser;
		}
		
		public static String baseURLReader() throws Exception
		{
			File file=new File("./src/main/java/Configure.properties");
			FileInputStream inpFile=new FileInputStream(file);
			Properties prop=new Properties();
			prop.load(inpFile);
			String baseURL=prop.getProperty("baseURL");
			return baseURL;
		}
	        
	

}
