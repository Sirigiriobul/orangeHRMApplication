package selectionAndDeselection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OsmaniaUniversity {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\browserDriverFiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		String osmaniaApplicationUrl="https://www.osmania.ac.in/";
		
		driver.get(osmaniaApplicationUrl);
		driver.manage().window().maximize();

		WebElement osmaniaLanguageDropDown=driver.findElement(By.id("gtranslate_selector"));
		Select selection=new Select(osmaniaLanguageDropDown);
	List <WebElement>	allSelectedLanguageNames=driver.findElements(By.tagName("option"));
	System.out.println(allSelectedLanguageNames);
	int sizeofAllLanguages=allSelectedLanguageNames.size();
	System.out.println("The total Languages size is :"+sizeofAllLanguages);
		
	for(int i=0;i<sizeofAllLanguages;i++)
	{ 
		String language=allSelectedLanguageNames.get(i).getText();
	System.out.println(i+" "+language);
	selection.selectByIndex(i);
	
	}
	}
}