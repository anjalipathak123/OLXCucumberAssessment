package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

public static Object[][] returnDataFromExcel() throws Exception
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	Object[][] data;
	File file=new File("./src/test/resources/Excel/MyWorkBookForAssessment.xlsx");
	FileInputStream inpFile=new FileInputStream(file);
	wb=new XSSFWorkbook(inpFile);
	sheet=wb.getSheetAt(0);
	data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for(int i=0;i<sheet.getRow(0).getLastCellNum();i++)
	{
	    
	}
	
	return data;
	
}
}
