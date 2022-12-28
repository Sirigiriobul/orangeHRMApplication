package com.dragAndDropOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JqueryDragAndDropOperation {
	WebDriver driver;
	@BeforeTest
public void setUp() {
	System.setProperty("webdriver.edge.driver", "./browserDriverFiles/msedgedriver.exe");
String 	jqueryApplicationUrl="https://jqueryui.com/droppable/";
	driver=new EdgeDriver();
	driver.get(jqueryApplicationUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}
	@Test(priority=1)
public void dragOperation() throws InterruptedException {
//	<iframe src="/resources/demos/droppable/default.html" 
//	class="demo-frame"></iframe>
	
WebElement	dragOperation=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(dragOperation);
	
/*	<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative; left: -9px; top: 8px;">
	<p>Drag me to my target</p>
</div>   */
WebElement	draggableElement=driver.findElement(By.id("draggable"));
	
WebElement	droppableElement=driver.findElement(By.id("droppable"));

Actions act=new Actions(driver);
act.dragAndDrop(draggableElement, droppableElement).build().perform();
	
	Thread.sleep(8000);
/*	<div id="droppable" class="ui-widget-header ui-droppable ui-state-highlight">
	<p>Dropped!</p>
</div>   */
}
@Test(priority = 2)
public void operation() {
	driver.quit();
	
}


}

