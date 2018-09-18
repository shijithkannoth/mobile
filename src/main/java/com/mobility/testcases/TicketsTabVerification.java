package com.mobility.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectFunctions;

public class TicketsTabVerification {


	@Test
	public void VerifyTicketstabNavigation()
	{
		try{
			ProjectFunctions.navigateToTicketsFromBottomIcon();
		}

		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertTrue(false, "Navigation to ticket tab failed");
		}
	}
	@Test
	public void VerifyActiveTkctTab()
	{
		try {
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.activeTicketsTab).click();
			WebDriverFunctions.waitFor(4000);
			Assert.assertTrue((Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.activeTicketsTab).getAttribute("checked")).equals("true"), "Active Tickets not  selected");

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Active Tickets tab not dispalyed");
		}
	}

	@Test
	public void VerifyClosedTkctTab()
	{
		try {
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.closedTicketsTab).click();
			WebDriverFunctions.waitFor(4000);
			Assert.assertTrue((Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.closedTicketsTab).getAttribute("checked")).equals("true"), "Active Tickets not  selected");
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Closed Tickets tab not dispalyed");
		}
	}
	@Test
	public void VerifyTotalOpneClosedTkts()
	{
		try {
			Assert.assertTrue(Config.driver.findElementById(ObjectIdentifier.totalActiveTickets).isDisplayed(), "Total active tickets card is not displaying");
			Assert.assertTrue(Config.driver.findElementById(ObjectIdentifier.totalClosedTickets).isDisplayed(), "Total Closed tickets card is not displaying");

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Total active closed tickets cards is not displaying");
		}
	}

}


