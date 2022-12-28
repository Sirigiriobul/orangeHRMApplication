package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TsrtcApplicationUrl {
public static void main(String[] args) throws IOException {
	
	WebDriver driver;
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\browserDriverFiles\\msedgedriver.exe");
	driver=new EdgeDriver();
	String tsrtcApplicationUrl="https://www.tsrtconline.in/oprs-web/?ref=w3use";
	driver.get(tsrtcApplicationUrl);
	driver.manage().window().maximize();
	
	File tsrtcApplicationScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tsrtcApplicationScreenshot, new File (".ScreenShots/tscrtc.png"));
	
	driver.close();
}
}