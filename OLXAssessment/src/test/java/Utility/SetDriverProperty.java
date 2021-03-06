package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetDriverProperty {

	public static WebDriver setDriver(String browser,WebDriver driver)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(KeyPath.chromeDriverKey,KeyPath.chromeDriverPath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty(KeyPath.edgeDriverKey, KeyPath.edgeDriverPath);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
}
