package com.OHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;

public class OrangeHRMApplicationLogInpage extends BaseTest{
public OrangeHRMApplicationLogInpage() 
{
PageFactory.initElements( driver, this);

}
@FindBy(xpath="//*[@id=\"divLogo\"]/img")
WebElement oHRM_LogInPageImageL ;

@FindBy(id="txtUsername")
WebElement userNameL;

public void oHRM_LogInPageImageValidation() {
	boolean flag=oHRM_LogInPageImageL.isDisplayed();
	Assert.assertTrue(flag, "OHRM Loginpage image is not found");
	System.out.println("orangeHRM image Element identified successfully");
}

}
