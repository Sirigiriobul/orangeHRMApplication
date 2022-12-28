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

public class ExcelOperationScript {
public static void main(String[] args) throws IOException, InterruptedException {
	

	WebDriver driver;
System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
 String orangeHrmApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver=new EdgeDriver();

 FileInputStream file=new FileInputStream("./src/com/ExcelWorkBook/WriteTestData1.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.getRow(0);
 Cell userName=row.getCell(0);
Cell passWord=row.getCell(1);

String  orageHrmUserName=userName.getStringCellValue();
System.out.println(orageHrmUserName);

String  orangeHrmPassWord=passWord.getStringCellValue();
System.out.println(orangeHrmPassWord);

//      name="txtUsername"
 //       name="txtPassword

//        id="btnLogin"
driver.get(orangeHrmApplicationUrlAddress);
driver.findElement(By.name("txtUsername")).sendKeys(orageHrmUserName);


driver.findElement(By.name("txtPassword")).sendKeys(orangeHrmPassWord);
//driver.findElement(By.id("btnLogin")).click();


}
}






