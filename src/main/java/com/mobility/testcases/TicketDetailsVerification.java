package com.mobility.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectFunctions;


public class TicketDetailsVerification {


	@Test
	public void ClickTicketstab()
	{
		try {
			ProjectFunctions.navigateToTicketsFromBottomIcon();
			WebDriverFunctions.waitFor(3000);
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "navigation failed");
		}
	}
	@Test
	public void navigateToTicketDetail()
	{
		try {
			//Config.driver.findElementByAccessibilityId(ObjectIdentifier.activeTicketsTab).click();
			Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.closedTicketsTab).click();
			WebDriverFunctions.waitFor(3000);
			Config.driver.findElementByAccessibilityId(ObjectIdentifier.forwardArrow).click();
			Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.ticketDetailsTextInHeader).isDisplayed(), "Ticket Deatl Header not  displayed");		
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Ticket Details not dispalyed");
		}
	}
	@Test
	public void VerifyElementsOfTicketdetailPage()
	{
		try {

			//Verify Created and Last updated time
			//Assert.assertTrue(Config.driver.findElementByAccessibilityId(" Created: 4/9/2011, 9:52 AM").isDisplayed(), "Created Time  not displayed");

			//Assert.assertTrue(Config.driver.findElementByAccessibilityId(" Last Update: 2/2/2017, 1:02 PM").isDisplayed(), "Lastupdated Time not Dispalyed");

			//Verify Customer related options 
			Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketDetail_CustomerName).isDisplayed(), "Customer Name not Dispalyed");
			Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketDetail_ContactPhone).isDisplayed(), "Contact phone number not Dispalyed");
			Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketDetail_Summary).isDisplayed(), "Summary of issue not Dispalyed");
			Thread.sleep(2000);
			//Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketDetail_ServiceID).isDisplayed(), "Service Id  not Dispalyed");
			//Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketDetail_Contact).isDisplayed(), "Contact not Dispalyed");
			Thread.sleep(2000);
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Ticket detail page elements veryfication failed");
		}
	}

	@Test
	public void VerifyTicketDetailBackbutton()
	{
		try {
			if(Config.driver.findElementByAccessibilityId(ObjectIdentifier.ticketDetail_BackArrow).isDisplayed())
			{
				Config.driver.findElementByAccessibilityId(ObjectIdentifier.ticketDetail_BackArrow).click();
				WebDriverFunctions.waitFor(3000);
				Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.closedTicketsTab).isDisplayed(), "navigation of back arrow is not working");
			}
			else
			{
				Assert.assertTrue(false, "Ticket detail back arrow is not showing up");
			}

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Ticket Details Back button not working");
		}
	}

}
