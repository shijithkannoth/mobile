package com.mobility.testcases;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectConfig;

public class Base {
	
	WebDriverFunctions wf = new WebDriverFunctions();
	
	public void launchApp()
	{
	try {
		DesiredCapabilities caps = 	wf.appCapabilities(ProjectConfig.deviceName, ProjectConfig.platformVersion,ProjectConfig.platformName, ProjectConfig.appPackage, ProjectConfig.appActivity);
		Config.driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		Config.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverFunctions.waitFor(5000);
	} catch (Exception e) {
		e.printStackTrace();
		Assert.assertTrue(false, "Failed to launch app");
	}		
	}

	public void appLogin()
	{
		
		try {
			Config.driver.findElementByAccessibilityId(ObjectIdentifier.usernameEditBox).sendKeys(ProjectConfig.appLoginUserName);
			Thread.sleep(1000);
			Config.driver.findElementByAccessibilityId(ObjectIdentifier.passwordEditBox).sendKeys(ProjectConfig.appLoginPassword);
			Thread.sleep(3000);
			Config.driver.findElementByAccessibilityId(ObjectIdentifier.signInButton).click();
			
			Thread.sleep(1000);
		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to login to app due to some exception"+e);
		
		
	}
	}
	
	
}

