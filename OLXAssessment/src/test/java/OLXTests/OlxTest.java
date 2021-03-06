package OLXTests;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OlxTest {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions action;
	public static WebDriverWait wait;
	public static long length;
	public static long width;
	
	public static void initializeDriver(String browser) throws Exception
	{
		driver=Utility.SetDriverProperty.setDriver(Utility.PropertyReader.browserReader(browser), driver);
	}
	public static void navigateToUrl() throws Exception
	{
		driver.get(Utility.PropertyReader.baseURLReader());
	}
	public static void enterProductOnSearchField(String s)
	{
		wait=new WebDriverWait(driver,5);
		WebElement search=Pages.HomePage.searchField(driver);
		wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(s);
		
	}
	public static void clickOnSearchButton()
	{
    js=(JavascriptExecutor) driver;
	WebElement searchButt=	Pages.HomePage.searchButton(driver);
	js.executeScript("arguments[0].click();", searchButt);
	}
	public static void forScrolling()
	{
		js=(JavascriptExecutor) driver;
		length=(Long)js.executeScript("return window.innerHeight;");
		System.out.println(length);
		js.executeScript("window.scrollBy(0,564);");
		System.out.println("scrolled");
		
	}
	public static void handleWindow()
	{
		String handle1=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String handle : handles)
		{
			if(handle.equalsIgnoreCase(handle1))
			{
				driver.switchTo().window(handle1);
			}
		}
		
	}
	public static String getTitle()
	{
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public static void clickOnLogin()
	{
		WebElement login=Pages.HomePage.loginButton(driver);
		try
		{
			action.moveToElement(login).click().perform();
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void clickOnContinueWithPhone()
	{
		wait=new WebDriverWait(driver,5);
		WebElement phone=Pages.HomePage.conituneWithPhone(driver);
		wait.until(ExpectedConditions.elementToBeClickable(phone)).click();;
	}
	
	public static void manageAlert()
	{
		driver.switchTo().alert().accept();
	}
	public static void manageIframe()
	{
		driver.switchTo().frame(0);
	}
	 
}
