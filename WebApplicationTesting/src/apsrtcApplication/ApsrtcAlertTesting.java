package apsrtcApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApsrtcAlertTesting {
	WebDriver driver;
	
@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
		driver= new EdgeDriver();
	String	apsrtcApplicationUrl="https://www.apsrtconline.in/oprs-web/";
driver.get(apsrtcApplicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
	public void applicationTest() throws InterruptedException {
		driver.findElement(By.id("searchBtn")).click();
		Alert alt;
		alt = driver.switchTo().alert();
		Thread.sleep(3000);
	alt.accept();
				
//      id="searchBtn

	
	}
}
