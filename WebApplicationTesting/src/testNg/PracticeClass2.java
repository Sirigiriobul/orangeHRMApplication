package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass2 {
	WebDriver driver;
	Actions act;
	

@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
driver=new EdgeDriver();
	String	orangeHrmApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(orangeHrmApplicationUrl);

}
@Test
public void test  () throws IOException  {
	FileInputStream profile=new FileInputStream("./src/propertiesFile/PropertiesFile.properties");
Properties pr=new Properties();
pr.load(profile);

FileInputStream file=new FileInputStream("./src/com/ExcelWorkBook/multipleTestData.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.getRow(1);
Cell userName=row.getCell(0);
Cell password=row.getCell(1);

String userNameData=userName.getStringCellValue();
String passwordData=password.getStringCellValue();



WebElement  userNameElement=driver.findElement(By.id(pr.getProperty("userNameElement")));
userNameElement.sendKeys(userNameData);

WebElement  passwordElement=driver.findElement(By.id(pr.getProperty("passwordElement")));
passwordElement.sendKeys(passwordData);
}
@Test
public void test2() {
//	driver.findElement(By.id(property.get))

}
}