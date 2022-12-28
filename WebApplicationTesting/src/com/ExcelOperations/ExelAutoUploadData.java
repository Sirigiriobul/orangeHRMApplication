package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class ExelAutoUploadData {
	public static void main(String[] args) {
		
	
	WebDriver driver;
    System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
	String orangeHrmUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver=new EdgeDriver();
	driver.get(orangeHrmUrl);
	driver.manage().window().maximize();
	}

/*	FileInputStream file=new FileInputStream("C:\\Users\\dell\\OneDrive\\Desktop\\multipleTestData.xlsx");
	XSSFWorkbook workBook =new XSSFWorkbook("file");
	XSSFSheet sheet=workBook.getSheet("Sheet1");
Row	row=sheet.getRow(1);
 Cell cell=row.getCell(0);
 Cell cell1=row.getCell(1);
 String userName=cell.getStringCellValue();
String	passWord=cell1.getStringCellValue();

//WebElement	userNameElement=driver.findElement(By.name("txtUsername")).sendKeys(username);
*/





}
