package com.AmazonTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BasicTestingOfAmazon {
	WebDriver driver;
	
@BeforeTest
	public void setUp() {
System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
String	amazonApplicationUrl="https://www.amazon.in";
driver=new EdgeDriver();
driver.get(amazonApplicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
}

@Test
public void amazonHeaderRowElements() {
	
//	class="nav-a  	
//	//*[@id="nav-xshop"]/a[1]
//	//*[@id="nav-xshop"]/a[2]
	//*[@id="nav-xshop"]/a[4]
//	<a href="/gp/bestsellers/?ref_=nav_cs_bestsellers" class="nav-a  " tabindex="0" data-csa-c-type="link" 
//	data-csa-c-slot-id="nav_cs_1" data-csa-c-content-id="nav_cs_bestsellers" data-csa-c-id="8101xq-2slp2f-h1wqzs-yozer0">Best Sellers</a>

	WebElement  amazonMiniTvElement=driver.findElement(By.xpath("//*[@id='nav-xshop']/a[1]"));
amazonMiniTvElement.click();
	
	}		
	}