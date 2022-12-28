package gmailApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsingXpathGmailApplicationAutomation {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
String gmailApplicationUrl="https://accounts.google.com/v3/signin/identifier?dsh=S906380354%3A1671123442560422&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh6spOi90xzPsXzI4Cp32OaWKBljiVccu0b93ncAIyH9qRd3sML-kirQSh6XPHH4hOzGlxGPfA";
driver=new EdgeDriver();
driver.get(gmailApplicationUrl);
driver.manage().window().maximize();
}
	@Test(priority=1)
public void automatingEmailOrPhone() {
	/*	<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" 
				spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value=""
				autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	
		<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" 
				spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" 
				autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	*/
	 WebElement emailOrPhoneElement=driver.findElement(By.name("identifier"));
	emailOrPhoneElement.sendKeys("sirigiriobulesh1618@gmail.com");
	
}
	@Test(priority=2)
	public void autoMatingNext() throws InterruptedException  {

	//WebElement	nextElement=driver.findElement(By.className("VfPpkd-RLmnJb"));
//	nextElement.click();
		
	//	<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
	//	<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
//	<div class="VfPpkd-RLmnJb"></div>
//	<div class="VfPpkd-RLmnJb"></div>
		
//		<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		//*[@id="identifierNext"]/div/button/div[3]
		//*[@id="identifierNext"]/div/button/div[3]
//		/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span
WebElement  nextButtonElement=driver.findElement(By.xpath("//div[@id='identifierNext']"));
nextButtonElement.click();
Thread.sleep(5000);
	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
	
}
}