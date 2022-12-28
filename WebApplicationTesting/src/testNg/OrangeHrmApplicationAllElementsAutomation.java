
package testNg;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmApplicationAllElementsAutomation {
	WebDriver driver;
	Actions act;
	Logger logg=Logger.getLogger(OrangeHrmApplicationAllElementsAutomation.class );

@BeforeTest
	public void setUp() {
	PropertyConfigurator.configure("Log4j.properties");
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
driver=new EdgeDriver();
	String	orangeHrmApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(orangeHrmApplicationUrl);
}

Logger log =Logger.getLogger(OrangeHrmApplicationAllElementsAutomation.class);
@Test
public void logInCredentials() {
	driver.manage().window().maximize();
WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.getText();
System.out.println(("The username element name is "+userNameElement));
logg.info("logInCredentials test successfully done");

    userNameElement.sendKeys("Obul123");

WebElement passwordElement=driver.findElement(By.id("txtPassword"));
passwordElement.sendKeys("Obulobul@123");

//id="openIdProvider
 WebElement  alternativeElement=driver.findElement(By.id("openIdProvider"));
alternativeElement.click();
//    name="Submit
 WebElement   logInButtonElement=driver.findElement(By.name("Submit"));
logInButtonElement.click();
}

/*public void headerElements () throws InterruptedException {
act=new Actions(driver);
Thread.sleep(2000);
//	<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
WebElement	adminElement=driver.findElement(By.id("menu_admin_viewAdminModule"));
	act.moveToElement(adminElement).build().perform();
//	id="menu_admin_Job
WebElement	adminElementL=driver.findElement(By.id("menu_admin_Job"));
	
*/
	
	
}


