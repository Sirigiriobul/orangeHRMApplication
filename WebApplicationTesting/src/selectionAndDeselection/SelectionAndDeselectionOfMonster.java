package selectionAndDeselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectionAndDeselectionOfMonster {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\browserDriverFiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		String monsterApplicationUrl="https:my.monsterindia.com/Sponsored_popup.html";
		
		driver.get(monsterApplicationUrl);
		driver.manage().window().maximize();
	//	<span class="multiselect__placeholder modal-ref-class textWrapper">
		//Maximum 2 industries can be selected
//	</span>	

		driver.close();
	}

}








