package Utility;

import com.relevantcodes.extentreports.ExtentReports;

public class returnExtent {
	
	public static ExtentReports returnReport()
	{
		ExtentReports report=new ExtentReports("./ExtentReports/report.html");
		return report;
	}

}
