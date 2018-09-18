package com.mobility.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectFunctions;

public class SitesTabVerification {
	@Test
	public void ClickSitesstab()
	{
		try {
			ProjectFunctions.navigateToSitesFromBottomIcon();
			WebDriverFunctions.waitFor(3000);
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "navigation failed");
		}
	}
	@Test
	public void sitestabverification()
	{
		try {
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.AboveTab).click();
			WebDriverFunctions.waitFor(3000);
			Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.AboveTabText).isDisplayed(), "Above 85% Header not  displayed");	
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.BetweenTab).click();
			WebDriverFunctions.waitFor(3000);
			Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.BetweenTabText).isDisplayed(), "85%-65% not  displayed");	
			WebDriverFunctions.waitFor(3000);
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.UnderTab).click();
			Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.UnderTabText).isDisplayed(), "65% Below not  displayed");		
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Sites Utilizations not dispalyed");
		}
	}
}
