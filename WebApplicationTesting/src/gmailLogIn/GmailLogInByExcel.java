package gmailLogIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogInByExcel {
	WebDriver driver;
	
	void setUp() {
	String	gmailApplicationUrlAddress="https://accounts.google.com/v3/signin/identifier?dsh=S-401857153%3A1671857270066221&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5TVm93oNWat-fpP4qWRIJgWkFSnSBQTSe7Gr4jhbeyMjp-DOIlNIOuTJvAlYzEtL5_je0R";
		System.setProperty("webdriver.chrome.driver","/.browserDriverFiles/msedgedriver.exe");
	driver.get(gmailApplicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	}
public void logIn() throws IOException {
	FileInputStream prfile=new FileInputStream("./src/propertiesFile/GmailPropertiesFile.properties");
	Properties pr=new Properties();
	pr.load(prfile);
	
	FileInputStream file=new FileInputStream("./src/com/ExcelWorkBook/TestData2.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook("file");
	XSSFSheet sheet=workBook.getSheet("Sheet1");
   Row	row =sheet.getRow(0);
 Cell cell1=row.getCell(0);
 Cell cell2=row.getCell(1);
 
 cell1.getStringCellValue();
   cell2.getStringCellValue();
   
//     WebElement  userNameElement=driver.findElement(By.id(pr.getProperty(userName)));
   
   
   
   
   
   
   

}
}
