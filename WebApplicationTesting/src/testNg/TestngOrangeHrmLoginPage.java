package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

import jdk.jfr.Percentage;

public class TestngOrangeHrmLoginPage {
	WebDriver driver;

	@BeforeTest
	public void applicationLaunch() {
	System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
String orangeHrmApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver=new EdgeDriver();
driver.get(orangeHrmApplicationUrl);
driver.manage().window().maximize();
}
	@Test
	public void logInPage() throws IOException {
		FileInputStream userNameFile=new FileInputStream("/.propertiesFile/PropertiesFile.properties");
Properties pr=new Properties();
pr.load(userNameFile);

WebElement	logInButtonElement=driver.findElement(By.id(pr.getProperty("txtUsername")));
	logInButtonElement.sendKeys("Obul123");	
	
WebElement	passwordElement=driver.findElement(By.id("txtPassword"));
	passwordElement.sendKeys("Obulobul@123");
	
	WebElement logInButton=driver.findElement(By.name("Submit"));
	logInButton.click();
	
	}
	//id="menu_pim_viewPimModule"
	@Test
	public void mouseHoverOperation () throws InterruptedException {
		Actions act=new Actions(driver);
	WebElement	pimElement =driver.findElement(By.id("menu_pim_viewPimModule"));
	Thread.sleep(1000);
	act.moveToElement(pimElement).build().perform();
WebElement addEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
addEmployeeElement.click();
//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
WebElement	firstNameElement=driver.findElement(By.name("firstName"));
firstNameElement.sendKeys("Sirigiri");

  WebElement  middleNameElement=driver.findElement(By.id("middleName"));
middleNameElement.sendKeys("Obulesh");

//   /html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input
//WebElement photographUploadElement=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		

 //    id="lastName"
	WebElement	lastNameElement=driver.findElement(By.id("lastName"));
	lastNameElement.sendKeys("Janardhana");	
//photographUploadElement.click();
//*[@id="photofile"]
WebElement  fileUpload=driver.findElement
(By.xpath("//*[@id='photofile']"));
Thread.sleep(2000);
fileUpload.sendKeys("C:\\Users\\dell\\OneDrive\\Desktop\\Screenshots\\Assignment Screenshots");
	Thread.sleep(3000);
	
//	id="btnSave
	
WebElement	saveElement=driver.findElement(By.id("btnSave"));
saveElement.click();

	
//		<input class="duplexBox valid" type="file"
//		name="photofile" id="photofile">
	}
	}	

	
	
