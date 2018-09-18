package com.mobility.projectFunctions;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;

public class ProjectFunctions {

    public static void navigateToHomeFromBottomIcon() {
        WebDriverFunctions.waitFor(3000);
        Config.driver.findElementByAccessibilityId(ObjectIdentifier.homeTab).click();
        Assert.assertTrue(Config.driver.findElementById(ObjectIdentifier.homeTab).isSelected(), "navigation to Home page failed");
    }

    public static void navigateToSitesFromBottomIcon() {
    	
    	System.out.println("Started123");
        WebDriverFunctions.waitFor(8000);
        Config.driver.findElementByXPath(ObjectIdentifier.sitesIconAtBottom).click();
        WebDriverFunctions.waitFor(2000);
        Assert.assertTrue(Config.driver.findElementByXPath(ObjectIdentifier.sitesIconAtBottom).isSelected(), "navigation to sites page failed");
        WebDriverFunctions.waitFor(7000);
        System.out.println("StarteEnded75723d123");
    }

    public static void navigateToTicketsFromBottomIcon() {
    	System.out.println("Started");
        WebDriverFunctions.waitFor(5000);
        Config.driver.findElementByXPath(ObjectIdentifier.ticketIconAtBottom).click();
        WebDriverFunctions.waitFor(1000);
        Assert.assertTrue((Config.driver.findElementByXPath(ObjectIdentifier.ticketIconAtBottom).getAttribute("selected")).equals("true"), "Ticket icon at bottom of page is not selected when user navigated to tickets page");
        System.out.println("Ended");
    }


    public static void searchWithValidInput(String searchInput) {
    	WebDriverFunctions.waitFor(13000);
    	
    	 List <WebElement> text = Config.driver.findElementsByClassName("android.widget.Button");
    	    text.get(0).click();
    	 WebDriverFunctions.waitFor(1000);
    	 Config.driver.findElementByClassName("android.widget.EditText").sendKeys("7 MASON");
        /*Config.driver.findElementByXPath(ObjectIdentifier.searchBox).sendKeys(searchInput);
        WebDriverFunctions.waitFor(3000);*/
      //  WebDriverFunctions.pressEnterFromKeyBoard();
        WebDriverFunctions.waitFor(3000);
        Config.driver.findElementByXPath("(//*[@class='android.widget.Button']/..)[2]").click();
    }

    public static void searchWithInvalidInput(String searchInput) {

        //Config.driver.findElementByClassName(ObjectIdentifier.searchBox).clear();
        Config.driver.findElementByAccessibilityId(ObjectIdentifier.search_BackArrow).click();
        WebDriverFunctions.waitFor(2000);
        Config.driver.findElementByClassName(ObjectIdentifier.searchBox).sendKeys(searchInput);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.pressEnterFromKeyBoard();
        WebDriverFunctions.waitFor(3000);
        Assert.assertTrue(Config.driver.findElementById(ObjectIdentifier.noResultsFoundText).isDisplayed(), "No results found text is not displaying");
        Config.driver.findElementByAccessibilityId(ObjectIdentifier.search_BackArrow).click();
    }

    public static void openSlidingMenu() {
        WebDriverFunctions.waitFor(3000);
        Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.slidingMenuIcon).click();
        WebDriverFunctions.waitFor(5000);
        // Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.slidingMenuHeader).isSelected(), "navigation to sliding menu page failed");
    }

    public static void closeSlidingMenu() {
        WebDriverFunctions.waitFor(2000);
        Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.slidingMenuCloseButton).click();
        WebDriverFunctions.waitFor(3000);
        // Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.slidingMenuHeader).isSelected(), "navigation to sliding menu page failed");
    }
}
