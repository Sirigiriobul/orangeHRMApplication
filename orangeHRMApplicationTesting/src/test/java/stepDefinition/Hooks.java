package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		
	}
	@After
	public void tearDown() {
		
		driver.close();
	}
	public void orangeHRMApplicationMethods(Hooks hook)
	{
driver=Hooks.driver;
	
	}
}
