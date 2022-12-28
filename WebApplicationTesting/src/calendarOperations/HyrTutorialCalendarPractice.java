package calendarOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HyrTutorialCalendarPractice {

WebDriver driver;
@BeforeTest
	public void setUp() {
		
	System.setProperty("webdriver.edge.driver",".//browserDriverFiles/msedgedriver.exe" );
String hyrApplicationUrl="https://www.hyrtutorials.com/p/calendar-practice.html";
driver=new EdgeDriver();
driver.get(hyrApplicationUrl);
driver.manage().window().maximize();
}
	@Test
public void calendarTest() {
	int day=20;
	/*		WebElement	firstCalendarElement=driver.findElement(By.id("first_date_picker"));
		firstCalendarElement.click();
	WebElement	DateElement15=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]"));
DateElement15.click();   */
WebElement		secondElement=driver.findElement(By.id("second_date_picker"));
	secondElement.click();
WebElement	element20=driver.findElement(By.xpath("[//input[@id='second_date_picker']//a[text()="+day+"]"));
		element20.click();
		//		class="ui-datepicker-calendar"
//		id="first_date_picker"
//	}
	
	
//	class="ui-state-default ui-state-active
	
}
}