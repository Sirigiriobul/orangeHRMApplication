package com.dragAndDropOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDragOwn {
WebDriver driver;
public void setUp() {
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
driver=new EdgeDriver();
String  jQueryApplicationUrl="https://jqueryui.com/droppable/";
	driver.get(jQueryApplicationUrl);
	
}
@Test(priority=1)
	public void process() {
//		<iframe src="/resources/demos/droppable/default.html"
//		class="demo-frame"></iframe>
		
	WebElement	jQueryFrameBlock=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(jQueryFrameBlock);
	
	}
@Test(priority=2)
	public void draggableOperation() throws FileNotFoundException {
FileInputStream file=new FileInputStream("./src/propertiesFile/PropertiesFile.properties");
Properties pr=new Properties();
	driver.findElement(By.id(pr.getProperty("userNameElement")));
	
	// WebElement draggableElement=driver.findElement(By.xpath("//*[@id='draggable']"));


//*[@id="draggable"]
/*		<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
		<p>Drag me to my target</p>
	</div>     */
	}
@Test(priority=3)
	public void droppableOperation () {
WebElement		droppableAreaElement=driver.findElement(By.xpath("//*[@id='droppable']"));
	
Actions act=new Actions(driver);
//    act.dragAndDrop(draggableElement, droppableAreaElement).
		//*[@id="droppable"]
	}
}
