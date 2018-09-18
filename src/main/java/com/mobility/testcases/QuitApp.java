package com.mobility.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectConfig;
import com.mobility.projectFunctions.ProjectFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.projectFunctions.ObjectIdentifier;


public class QuitApp {
	
	/*@Test
	public void verifyLogout()
	{
	try {
		ProjectFunctions.navigateToHomeFromBottomIcon();	
		WebDriverFunctions.waitFor(3000);
		Config.driver.findElementByAccessibilityId(ObjectIdentifier.Logout).click();
		WebDriverFunctions.waitFor(2000);
		Config.driver.findElementByAccessibilityId(ObjectIdentifier.LogoutYes).click();
	} catch (Exception e) {
		e.printStackTrace();
		Assert.assertTrue(false, "Not Able to Logout");
	}
	}*/
	
	

	@BeforeClass
	public void applaunch()
	{
	Base obj = new Base();
	obj.launchApp();
	WebDriverFunctions.waitFor(20000);
    
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
    WebDriverFunctions.waitFor(50000);
    
	}
	
	
	@Test
	public void closeApp()
	{
	Config.driver.quit();	
	}

}
