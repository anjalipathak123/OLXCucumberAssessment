package Utility;

import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import OLXTests.OlxTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

public class RunnerClass  extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner testNGCucumberRunner;
	ExtentReports report;
	ExtentTest test;



	@BeforeClass(alwaysRun=true)
	@Parameters({"browser"})
	public void setUPClass(String browser) throws Exception {

	if(browser.equals(null))
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browser", "chrome");
	}
    report=Utility.returnExtent.returnReport();
    test=report.startTest("OLX Reports");
    OLXTests.OlxTest.initializeDriver(browser);
	testNGCucumberRunner =new TestNGCucumberRunner(this.getClass());
	System.out.println("test is started");
	}




//	@Test(dataProvider="dataHere", dataProviderClass=DataSet.class)
	public void runScenarios() {
	System.out.println("test is running");
	}
	
	@AfterMethod
	public void result(ITestResult i) throws Exception
	{
		if(i.getStatus()==ITestResult.FAILURE)
		{
			String path=Utility.takeScreenShot.addScreenshot(OLXTests.OlxTest.driver, i.getName());
			String imagePath=test.addScreenCapture(path);
			test.log(LogStatus.FAIL, imagePath,i.getName());
		}
	}



	@AfterClass
	public void afterClass() {
	testNGCucumberRunner.finish();
	report.endTest(test);
	report.flush();
//	OlxTest.driver.close();
	}



	

}
