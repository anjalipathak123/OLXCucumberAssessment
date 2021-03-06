package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement searchField(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@placeholder=\"Find Cars, Mobile Phones and more...\"]"));
	}
	public static WebElement searchButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[@class=\"_3b3oR\"]"));
	}
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class=\"rui-39-wj rui-3-PNI rui-1JPTg RgSo4 _1oFFI\"]"));
	}
	public static WebElement conituneWithPhone(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class=\"rui-39-wj rui-3evoE rui-1JPTg _3IKPU rui-2NuAg\"]"));
	}
	
}
