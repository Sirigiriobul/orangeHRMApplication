package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotOfApsrtcWebSite {
	public static void main(String[] args) throws IOException  {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\browserDriverFiles\\msedgedriver.exe");
	driver=new EdgeDriver();
	String apsrtcLogInPageUrl="https://apsrtconline.in/oprs-web/guest/home.do?h=1";
	driver.get(apsrtcLogInPageUrl);
	driver.manage().window().maximize();
File apsrtcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);



FileUtils.copyFile(apsrtcScreenshot, new File ("C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\ScreenShots"));
	driver.close();
	}

}
//  File googleScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//  FileUtils.copyFile(googleScreenShot, new File("./ScreenShots/googleHomePage.png"));

/*import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
*/