package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelOperationsSureshAnna {
	public static void main(String[] args) {
		
WebDriver driver;
 System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
String orangeHrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver=new EdgeDriver();
			
			}
public void excelOperation() throws IOException {
FileInputStream file =new FileInputStream("./src/com/ExcelWorkBook/multipleTestData.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");

}



}
		
	
