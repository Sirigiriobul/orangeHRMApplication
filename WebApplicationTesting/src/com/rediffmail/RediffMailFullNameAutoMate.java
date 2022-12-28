package com.rediffmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffMailFullNameAutoMate {

	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
String orangeHrmApplicationUrl="https://is.rediff.com/signup/register";
driver=new EdgeDriver();
driver.get(orangeHrmApplicationUrl);
driver.manage().window().maximize();
}
	@Test
public void fullName() throws InterruptedException {
//	<input type="text" name="emailid" id="emailid" value="" class="txtbox1" onfocus="validateSignupForm(1)">
 //WebElement  fullNameElement=driver.findElement(By.name("emailid"));
//	fullNameElement.sendKeys(("Sirigiri Obulesh"));

	//	/html/body/div[3]/div[4]/div/form/div[5]/input
		WebElement	fullNameElement=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[5]/input"));
	Thread.sleep(3000);
		fullNameElement.sendKeys("Sirigiri Obulesh");
	
	
	}

}
