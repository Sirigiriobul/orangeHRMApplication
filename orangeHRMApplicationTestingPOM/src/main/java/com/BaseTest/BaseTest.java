package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
public static WebDriver driver;
	
String orangeHRMApplicationURL="127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
	driver.get(orangeHRMApplicationURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

}

