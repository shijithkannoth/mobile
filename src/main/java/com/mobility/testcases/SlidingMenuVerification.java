package com.mobility.testcases;

import com.mobility.commonFunctions.Config;
import com.mobility.commonFunctions.WebDriverFunctions;
import com.mobility.projectFunctions.ObjectIdentifier;
import com.mobility.projectFunctions.ProjectFunctions;
import org.testng.annotations.Test;

/**
 * Created by manikandan.ppe on 21/03/17.
 */
public class SlidingMenuVerification {

    @Test
    public void verifySlidingMenuOptions() {
        ProjectFunctions.navigateToHomeFromBottomIcon();
        ProjectFunctions.openSlidingMenu();
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuHelp, "Help text is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuApplicationInfo, "Application info option is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuFaqs, "Faqs option is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuLegal, "Legal text is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuEULA, "EULA text is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuTermsandConditions, "Terms and condition option is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuActions, "Actions text is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuCallSupport, "Call support option is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuLogout, "Logout option is not displaying");

    }

    @Test
    public void verifyApplicationInfoPage() {
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuApplicationInfo);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuApplicationInfoHeader, "Application info header is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuApplicationVersion, "Application version is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuApplicationDataSource, "Application data source is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuApplicationEnviroment, "Application environment is not displaying");
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuApplicationBackArrowButton);
    }

    @Test
    public void verifyFaqsPage() {

        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuFaqs);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuFaqsHeader, "FAQs  header is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuFaqsNeedAccess, "FAQs Need access option is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuFaqsForgetPassword, "FAQs Forget password option is not displaying");
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuFaqsBackArrowButton);
    }

    @Test
    public void verifyEULAPage() {
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuEULA);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuEULAHeader, "EULA Header is not displaying");

        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuEULAAgreement, "EULA Agreement is not displaying");
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuEULABackArrowButton);
    }

    @Test
    public void verifyTermsAndConditionsPage() {
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuTermsandConditions);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuTermsAndConditionsHeader, "T and C Header is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuTermsAndConditionsRights, " T and C Rights is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.slidingMenuTermsAndConditionsTrademark, "T and C Trademark is not displaying");
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuTermsAndConditionsBackArrowButton);

    }

    @Test
    public void verifyLogoutPopUp() {
        WebDriverFunctions.clickOnElement(ObjectIdentifier.slidingMenuLogout);
        WebDriverFunctions.waitFor(3000);
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.logoutPopUpTitle, "logout pop up title is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.logoutPopUpBodyMsg, " logout pop up body message is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.logoutPopUpNoButton, " logout pop up No is not displaying");
        WebDriverFunctions.assertElementisDisplayed(ObjectIdentifier.logoutPopUpYesButton, " logout pop up Yes is not displaying");
        WebDriverFunctions.clickOnElement(ObjectIdentifier.logoutPopUpNoButton);

    }

}
