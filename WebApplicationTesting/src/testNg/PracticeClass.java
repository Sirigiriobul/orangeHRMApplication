package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass {
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
public void orangeHrm() throws IOException, InterruptedException {
	
	FileInputStream proFile =new FileInputStream("./src/propertiesFile/PropertiesFile.properties");
	Properties property=new Properties();
	property.load(proFile);
	Thread.sleep(3000);
	
	
WebElement	userNameElement=driver.findElement(By.id(property.getProperty("userNameElement")));
	userNameElement.sendKeys("Obul123");
    
}

}
