package selectionAndDeselection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class OsmaniaUniversityScreenshotUsingLoops {
	WebDriver driver;
	@BeforeTest
public void setup() {
	System.setProperty("webdriver.edge.driver","./browserDriverFiles/msedgedriver.exe" );
	String osmaniaUniversityUrlAddres="https://www.osmania.ac.in/";
	driver=new EdgeDriver();
	driver.get(osmaniaUniversityUrlAddres);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@Test
	
public void test1() {
WebElement	languageElement=driver.findElement(By.id("gtranslate_selector"));
//	<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
	Select selection=new Select(languageElement);
 List<WebElement>  osmaniaUniversityAllLanguages=driver.findElements(By.tagName("option"));
 System.out.println(osmaniaUniversityAllLanguages);
int   sizeOfAllLanguages=osmaniaUniversityAllLanguages.size();
	System.out.println("The Selected all languages are:"+sizeOfAllLanguages);
	
	for (int i=0;i<sizeOfAllLanguages;i++)
	{String	language=osmaniaUniversityAllLanguages.get(i).getText();
	System.out.println(i+" "+language);
	

	}	
	}
}
/*WebElement selectLanguageDropDown=driver.findElement(By.id("gtranslate_selector"));
Select selection=new Select(selectLanguageDropDown);
List<WebElement> selectLanguageNames=selectLanguageDropDown.findElements(By.tagName("option"));
System.out.println(selectLanguageNames);
int selectLanguageNamesCount=selectLanguageNames.size();
driver.manage().window().maximize();
for(int i=0;i<selectLanguageNamesCount;i++)
{
String language=selectLanguageNames.get(i).getText();
System.out.println(i+" " +language);
selection.selectByIndex(i);
File capturedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(capturedScreenshot, new File("./ApplicationScreenshot/"+i+""+language+"osmania.png"));
String actualTitle=driver.getTitle();
System.out.println(actualTitle);

}*/