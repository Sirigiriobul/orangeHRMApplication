package com.BrowserAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://google.com");
		
		File googleScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(googleScreenShot, new File("./ScreenShots/googleHomePage.png"));
		
		
		driver.close();
		
	}

}
