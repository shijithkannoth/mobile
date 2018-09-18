package com.mobility.testcases;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectFunctions;


public class SetDynamicCapacity {

    @Test
    public void navigateToSetDC() {
        try {
            ProjectFunctions.navigateToSitesFromBottomIcon();
            WebDriverFunctions.waitFor(2000);
            Config.driver.findElementByAccessibilityId(ObjectIdentifier.viewSiteDetailsLink).click();
            WebDriverFunctions.waitFor(5000);
            Config.driver.findElementByAccessibilityId(ObjectIdentifier.viewCircuitDetailsLink).click();
            WebDriverFunctions.waitFor(5000);
            Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.dynamicCapacityLink).isDisplayed(), "Dynamic Capacity link not displayed");
            WebDriverFunctions.waitFor(5000);
        } catch (Exception e) {
            System.out.println(e);
            Assert.assertTrue(false, "navigation to Set DC failed due to exception");
        }
    }

    @Test
    public void verifyCircuitDetailTabContent() {
        try {
            WebDriverFunctions.waitFor(2000);
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.circuitID).isDisplayed(), "Circuit ID not dispalyed");
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.circuitDetailsTextInHeader).isDisplayed(), "Circuit Details text in header not dispalyed");
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.aLocText).isDisplayed(), "ALoc not displayed");
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.zLocText).isDisplayed(), "ZLoc not displayed");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(false, "Circuit details tab content verification failed");
        }
    }

    @Test
    public void enableDC() {
        WebDriverFunctions.waitFor(3000);
        MobileElement elementById = (MobileElement) Config.driver.findElementByAndroidUIAutomator(ObjectIdentifier.dynamicCapacityButton);
        Point p = elementById.getLocation();
        TouchAction touchAction = new TouchAction(Config.driver);
        touchAction.longPress(elementById,p.getX(),p.getY()).perform();
//        JavascriptExecutor js = (JavascriptExecutor) Config.driver;
//        js.executeScript("$('#undefined').trigger('tap');");
       // touchAction.press(elementById,p.getX(),p.getY()).perform();
       // touchAction.press(p.getX(),p.getY()).perform();
        //touchAction.tap(p.getX(),p.getY()).perform();
        WebDriverFunctions.waitFor(5000);
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setDCTextInHeader).isDisplayed(), "set DC text in header is not dispalyed");
    }

    /*@Test
    public void enableDC1()
    {
    List chkBx = Config.driver.findElementsByClassName("android.widget.CheckBox");
    String a=chkBx.get(0).getAttribute("checked");
    System.out.println("Check box is" + a);
     WebElement checkBox = Config.driver.findElementByAccessibilityId("DC ACTIVE:");
     if(checkBox.isSelected()){
      checkBox.click();
     }
    }*/
    @Test
    public void verifySetDynamicCapacityTabInfo() {
        try {
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.aLocText).isDisplayed(), "ALoc not displayed");
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.zLocText).isDisplayed(), "ZLoc not displayed");
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setDC_CircuitID).isDisplayed(), "Circuit ID not dispalyed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void verifyElementsOfSetBandWidthOption() {
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setBandWidthText).isDisplayed(), "Set Bandwidth Header not available");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setBandWidth_MIN).isDisplayed(), "MIN Option not Dispalyed");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setBandWidth_2x).isDisplayed(), "2X Option not Dispalyed");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setBandWidth_MAX).isDisplayed(), "MAX Option not Dispalyed");
    }

    @Test
    public void verifyElementsOfSetDurationOption() {
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setDurationText).isDisplayed(), "Set Duration Option not Dispalyed");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.setduration_DefaultTime).isDisplayed(), "1 hours header  not Dispalyed");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.arrowUP).isDisplayed(), "Arrow up Option not Dispalyed");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.arrowDown).isDisplayed(), "Arrow Down Option not available");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.costPerhour).isDisplayed(), "Cost per hr 10$ option not available");
        Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.estimatedCost).isDisplayed(), "Estimated per hr 10$ option not available");
    }

    @Test
    public void SubmitSetDc() {
        try {
            Config.driver.findElementByClassName(ObjectIdentifier.setBandWidth_2x).click();
            WebDriverFunctions.waitFor(5000);
            Config.driver.findElementByClassName(ObjectIdentifier.SetDcSubmit).click();
            Assert.assertTrue(Config.driver.findElementByAccessibilityId(ObjectIdentifier.SetDCPopup).isDisplayed(), "set DC text in header is not dispalyed");
            Config.driver.findElementByClassName(ObjectIdentifier.SetDcPopupAgree).click();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(false, "Set Dc not working");
        }

    }

}

