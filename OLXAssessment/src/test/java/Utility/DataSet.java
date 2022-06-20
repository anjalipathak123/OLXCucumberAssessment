package Utility;

import org.testng.annotations.DataProvider;

public class DataSet {

	@DataProvider(name="dataHere")
	public static Object[][] data()
	{
		return new Object[][] {{"cars"},{"watch"}};
	}
}
