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


public class SignInPage {
	
	@BeforeClass
	public void applaunch()
	{
	Base obj = new Base();
	obj.launchApp();
	WebDriverFunctions.waitFor(20000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException
	{	
	
	Thread.sleep(4000);	
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
	/*verifySignInButton();
	signIntoApp(ProjectConfig.appLoginUserName, ProjectConfig.appLoginPassword);
	*/
	}
	
    public void verifyUserNameEditBox()
    {
    System.out.println("Test Before");
   	Assert.assertTrue(Config.driver.findElementByClassName("android.widget.EditText").isDisplayed(), "Username edit box is not displaying");
   	System.out.println("Test2 Pass");
    }
    
    public void verifyPasswordEditBox()
    {
    Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.passwordEditBox).isDisplayed(), "Password edit box is not displaying");
    }
    public void verifyRememberUsernameoption()
    {
    Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.RememberUsernameoption).isDisplayed(), "RememberUsername is not displaying");
    }
    
    public void verifySignInButton()
    {
    Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.signInButton).isDisplayed(), "SignIn button is not displaying");
    }
    
    public void signIntoApp(String username, String password)
    {
    Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.usernameEditBox).sendKeys(username);
    Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.passwordEditBox).sendKeys(password);
    Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.RememberUsernameoption).click();
 /* //clicking on Remember option
    WebElement SwitchText = Config.driver.findElementByAccessibilityId("tgl-2-0");
    SwitchText.click();*/
    WebDriverFunctions.waitFor(3000);
  	Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.signInButton).click();
    WebDriverFunctions.waitFor(4000);
    Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.homeTextInHomePage).isDisplayed(), "Login to app is not working");
    }

}
