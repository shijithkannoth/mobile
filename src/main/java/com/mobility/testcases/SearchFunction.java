package com.mobility.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ProjectConfig;
import com.mobility.projectFunctions.ProjectFunctions;


public class SearchFunction {

	@BeforeClass
	public void applaunch()
	{
	Base obj = new Base();
	obj.launchApp();
	WebDriverFunctions.waitFor(10000);
    
    List <WebElement> text = Config.driver.findElementsByClassName("android.widget.EditText");
    text.get(0).sendKeys(ProjectConfig.appLoginUserName);
    WebDriverFunctions.waitFor(3000);
    text.get(1).sendKeys(ProjectConfig.appLoginPassword);
    WebDriverFunctions.waitFor(3000);
    List <WebElement> button = Config.driver.findElementsByClassName("android.widget.Button");
    /*for (int i = 0 ; i<= button.size(); i ++){
    	
    	System.out.println(button.get(i).getText());
    }*/
    WebDriverFunctions.waitFor(3000);
    button.get(1).click();
    WebDriverFunctions.waitFor(20000);
    
	}
	
	
	@Test
	public void verifySearchFromTicketsTab()
	{
	try {
		ProjectFunctions.navigateToTicketsFromBottomIcon();	
		WebDriverFunctions.waitFor(3000);
		ProjectFunctions.searchWithValidInput("Billing");
		ProjectFunctions.searchWithInvalidInput("gshsjhs");
	} catch (Exception e) {
		e.printStackTrace();
		Assert.assertTrue(false, "failed to validate search from ticket tab");
	}
	}
	
	@Test
	public void verifySearchFromSitesTab()
	{
	try {
		ProjectFunctions.navigateToSitesFromBottomIcon();	
		WebDriverFunctions.waitFor(8000);
		System.out.println("Came back and going");
		ProjectFunctions.searchWithValidInput("7 MASON");
		ProjectFunctions.searchWithInvalidInput("gshsjhs");
	} catch (Exception e) {
		e.printStackTrace();
		Assert.assertTrue(false, "failed to validate search from sites tab");
	}
	}
	
	
}
