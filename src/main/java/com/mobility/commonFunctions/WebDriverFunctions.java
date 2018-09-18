package com.mobility.commonFunctions;

import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectConfig;

import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


public class WebDriverFunctions {

    public DesiredCapabilities appCapabilities(String deviceName, String platformVersion, String platformName, String appPackage, String appActivity) throws Exception {

    	 DesiredCapabilities caps = new DesiredCapabilities();
    	/* caps.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.0");
    	 caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8.1);
		 caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy On Nxt");
    	 caps.setCapability(MobileCapabilityType.DEVICE_NAME,"OnePlus 5");
    	 caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    	 caps.setCapability("appPackage", "com.level3.apps.mobility");
 		 caps.setCapability("appActivity", "com.level3.apps.mobility.MainActivity");
    	 
    	 caps.setCapability("appPackage", "app.com.droid.certintel");
    	 caps.setCapability("appActivity", "app.com.droid.certintel.src.Splash");
    	 caps.setCapability("noSign", true);
		 caps.setCapability("autoGrantPermissions", "true");
	//	 caps.setCapability("avd", "Nexus_6P_API_25");
		 caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 7200);
		//caps.setCapability(MobileCapabilityType.FULL_RESET, true);
*/    	
        caps.setCapability("deviceName", "OnePlus 5T");
        caps.setCapability("platformVersion", 8.1);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", "false");
      // caps.setCapability("unicodeKeyboard", "true");
      // caps.setCapability("resetKeyboard", "true");
        caps.setCapability("appPackage", "com.level3.apps.mobility");
        caps.setCapability("appActivity", "com.level3.apps.mobility.MainActivity");
//        caps.setCapability("unicodeKeyboard", true);
//        caps.setCapability("resetKeyboard", true);
        return caps;
    }

    public static void waitFor(long timeInMilisecond) {
        try {
            Thread.sleep(timeInMilisecond);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pressEnterFromKeyBoard() {
        Actions act = new Actions(Config.driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    /*
    This function as now support find elements by android ui automator
     */
    public static void assertElementisDisplayed(String objectIdentifer, String msg) {
        Assert.assertTrue(Config.driver.findElementByAndroidUIAutomator(objectIdentifer).isDisplayed(), msg);
    }

    /*
       This function as now support find elements by android ui automator
    */
    public static void clickOnElement(String objectIdentifer) {
        waitFor(3000);
        WebElement elementByAndroidUIAutomator = Config.driver.findElementByAndroidUIAutomator(objectIdentifer);
        Point p = elementByAndroidUIAutomator.getLocation();
        TouchAction touchAction = new TouchAction(Config.driver);
        touchAction.press(elementByAndroidUIAutomator,p.getX(),p.getY()).perform();
        waitFor(2000);

    }
}
