package Utility;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenShot {

	public static String addScreenshot(WebDriver driver,String failedMethod) throws IOException
	{
		String logFileName= new SimpleDateFormat("yyMMddmm'.png'").format(new Date());
		failedMethod = failedMethod + logFileName;
		String Directory=System.getProperty("user.dir")+"//ScreenShots//OLXScreenshot";
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Destination=Directory+failedMethod;
		FileUtils.copyFile(srcFile,new File( Destination));
		return Destination;
	}
}
