package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@Given("^user should open a browser on the system$")
public void user_should_open_a_browser_on_the_system() {
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}

@When("^user enters orangeHRM Application urlAddress$")
public void user_enters_orangeHRM_Application_urlAddress() {
   driver.get(applicationUrlAddress);
}

@Then("^user should be able to navigate to orangeHRM application Login Page$")
public void user_should_be_able_to_navigate_to_orangeHRM_application_Login_Page() {
 String   expected_OrangeHRMApplication_LogInPageTitle="orangeHRM";
String  actual_OrangeHRMApplication_LogInPageTitle=driver.getTitle();
System.out.println(actual_OrangeHRMApplication_LogInPageTitle);
	System.out.println("User successfully navigated to orangeHRM login page");

}

@Then("^user should enter \"([^\"]*)\",\"([^\"]*)\" and click on Login button$")
public void user_should_enter_and_click_on_Login_button(String userName, String passWord) {
	
  WebElement username=driver.findElement(By.id("txtUsername"));
  username.clear();
  username.sendKeys(userName);
  
 WebElement password=driver.findElement(By.id("txtPassword"));
  password.clear();
  password.sendKeys(passWord);
  
 WebElement logInButton=driver.findElement(By.id("btnLogin"));
  logInButton.click();
  
  
}

@Then("^user should be navigate to homePage$")
public void user_should_be_navigate_to_homePage()  {
String	actual_OrangeHRMApplicationTitle=driver.getTitle();
String	expected_OrangeHRMApplicationTitle="OrangeHRM";
if (actual_OrangeHRMApplicationTitle.equalsIgnoreCase(expected_OrangeHRMApplicationTitle))
{System.out.println("True");}
else
{	System.out.println("False");    }
}


@Then("^user should close the orangeHRM application$")
public void user_should_close_the_orangeHRM_application() {
   driver.close();
   
}


}
