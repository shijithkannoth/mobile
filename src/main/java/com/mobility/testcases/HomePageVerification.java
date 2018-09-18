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


public class HomePageVerification {
	
	
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
	
	@Test(priority=0)
    public void verifyHomeTab()
    {
    	try {
			//verify Welcome Message
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.welcomeBackText).isDisplayed(), "Welcome message not displayed");
			//verify Circuit Utilization and Sites Link
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.siteCircuitUtilizationText).isDisplayed(), "Circuit Utilization link not dispalyed");	
			Thread.sleep(1000);
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.viewSitesLink).isDisplayed(), "View sites Link not displayed");	
			Thread.sleep(1000);
			//Verify Set Time Interval
			Thread.sleep(2000);
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.nowTab).isDisplayed(), "Now Option not Dispalyed");
			Thread.sleep(500);
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.lastFourHoursTab).isDisplayed(), "Last 4 hours Option not Dispalyed");
			Thread.sleep(500);
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.lastTwelveHoursTab).isDisplayed(), "Last 12 hoursOption not Dispalyed");	
			Thread.sleep(500);
		    //Verify Trouble Tickets and View Tickets Link
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.troubleTicketsText).isDisplayed(), "Troble Tickets Option not Dispalyed");
			Thread.sleep(500);
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.viewTicketsLink).isDisplayed(), "View Tickets Link  not Dispalyed");
			Thread.sleep(500);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
}
	@Test(priority=1)
	public void verifyTicketsTabfromHome()
	{
		try {
			Config.driver.findElementByXPath(ObjectIdentifier.viewTicketsLink).click();
			Thread.sleep(10000);
			//Click on View Sites Link
			//Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.ticketsIconAtBottom).click();
			//Thread.sleep(3000);
			//verify You will see sites page
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.TicketpageHeader).isDisplayed(), "Tickets page not  displayed");
			//Assert.assertTrue((Config.driver.findElementByAccessibilityId(ObjectIdentifier.ticketsIconAtBottom).getAttribute("selected")).equals("true"), "Ticket icon at bottom of page is not selected when user navigated to tickets page");

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Tickets page naviagetion form view tickets link failed");
		}
	}
	@Test(priority=3)
	 public void verifySitesTabfromHome()
    {
    	try {
			//Click on View Sites Link
    		Config.driver.findElementByXPath(ObjectIdentifier.viewSitesLink).click();
    		Thread.sleep(10000);
			//verify You will see sites page
			Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.sitesHeader).isDisplayed(), "Sites page not  displayed");	
			
		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false, "Sites page verification failed");
		}
    }
	@Test(priority=4)
	public void verifyHomefromSites()
	{
	try {
		Config.driver.findElementByXPath(ObjectIdentifier.homeTab).click();
		Thread.sleep(10000);
		Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.HomeHeader).isDisplayed(), "home page navigation from sites is not working");
	} catch (Exception e) {
		
		e.printStackTrace();
		Assert.assertTrue(false, "Home page verification failed");
	}
	
	}

	@Test(priority=2)
	public void verifyHomefromTickets()
	{
	try {
		Config.driver.findElementByXPath(ObjectIdentifier.homeTab).click();
		Thread.sleep(10000);
		Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.HomeHeader).isDisplayed(), "home page navigation from sites is not working");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	}
	
}
