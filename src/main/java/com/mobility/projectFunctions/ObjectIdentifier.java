package com.mobility.projectFunctions;

public class ObjectIdentifier {

    //SignIn Page
    public static final String usernameEditBox = "new UiSelector().text(\"  Username\")";
    public static final String passwordEditBox = "new UiSelector().text(\"  Password\")";
    public static final String signInButton = "new UiSelector().description(\"SIGN IN \")";
    public static final String RememberUsernameoption = "new UiSelector().description(\"  Remember\")";
    public static final String RememberUsernamecheckboxEnable = "tgl-2-0";
    public static final String RememberUsernamecheckboxDisable = "tgl-73-0";
    public static final String homeTextInHomePage = "new UiSelector().description(\"HOME\")";
    public static final String Forgotpassword = "FORGOT PASSWORD? ";
    public static final String NeedAccess = "NEED ACCESS? ";

    //Home Page

    public static final String welcomeBackText = "//android.view.View[@text='Welcome Back Prod Doe']";
    public static final String HomeHeader = "//android.view.View[@text='HOME']";
    public static final String LogoutYes = "YES ";
    public static final String LogoutNo = "NO ";
    public static final String siteCircuitUtilizationText = "//android.view.View[@text='ENHANCED MGMT SITE UTILIZATION']";
    public static final String viewSitesLink = "//android.view.View[@text='VIEW SITES >']";
    public static final String nowTab = "//android.widget.ToggleButton[@text='NOW']";
    public static final String lastFourHoursTab = "//android.widget.ToggleButton[@text='4 HR']";
    public static final String lastTwelveHoursTab = "//android.widget.ToggleButton[@text='12 HR']";
    public static final String troubleTicketsText = "//android.view.View[@text='TROUBLE TICKETS']";
    public static final String viewTicketsLink = "//android.view.View[@text='VIEW TICKETS >']";
    public static final String ticketsIconAtBottom = "custom ticket ";
    public static final String homeTab = "//android.view.View[@text='home']";

    // Sites Page

    public static final String sitesWithUtilizationText = "SITES WITH UTILIZATION";
    public static final String sitesHeader = "//android.view.View[@text='SITES']";
    public static final String sitesIconAtBottom = "//android.view.View[@text='custom locations']";
    public static final String viewSiteDetailsLink = "VIEW SITE DETAILS";
    public static final String viewCircuitDetailsLink = "VIEW CIRCUIT DETAILS";
    public static final String dynamicCapacityLink = "new UiSelector().descriptionContains(\"Dynamic Capacity\")";
    public static final String AboveTab = "new UiSelector().descriptionContains(\"ABOVE 85%\")";
    public static final String BetweenTab = "new UiSelector().descriptionContains(\"85% - 65%\")";
    public static final String UnderTab = "new UiSelector().descriptionContains(\"UNDER 65%\")";
    public static final String AboveTabText = "new UiSelector().descriptionContains(\"ABOVE 85%\")";
    public static final String BetweenTabText = "new UiSelector().descriptionContains(\"85% - 65%\")";
    public static final String UnderTabText = "new UiSelector().descriptionContains(\"UNDER 65%\")";


    //Tickets

    public static final String TicketpageHeader = "//android.view.View[@text='TROUBLE TICKETS']";
    public static final String activeTicketText = "ACTIVE TICKETS ";
    public static final String ticketIconAtBottom = "//android.view.View[@text='custom ticket']";
    public static final String activeTicketsTab = "new UiSelector().description(\"ACTIVE TICKETS\")";
    public static final String closedTicketsTab = "new UiSelector().description(\"CLOSED TICKETS\")";
    public static final String totalActiveTickets = "ACTIVE<br />TICKETS";
    public static final String totalClosedTickets = "CLOSED<br />TICKETS";
    public static final String forwardArrow = "arrow forward";

    public static final String ticketDetailsTextInHeader = "TICKET DETAILS";
    public static final String ticketDetail_CustomerName = "new UiSelector().descriptionContains(\"Customer Name\")";
    public static final String ticketDetail_ContactPhone = "new UiSelector().descriptionContains(\"Contact Phone\")";
    public static final String ticketDetail_Summary = "new UiSelector().descriptionContains(\"Summary of Issue\")";
    public static final String ticketDetail_ServiceID = "new UiSelector().descriptionContains(\"Service ID\")";
    public static final String ticketDetail_Contact = "new UiSelector().descriptionContains(\"Contact\")";
    public static final String ticketDetail_BackArrow = "arrow back ";

    //Circuit Details
    public static final String circuitDetailsTextInHeader = "CIRCUIT DETAILS";
    public static final String aLocText = "A LOC";
    public static final String zLocText = "Z LOC";
    public static final String circuitID = "VLXX/140142/DEMO";
    public static final String DynamicCapacityOff = "Dynamic Capacity: Off";
    public static final String DynamicCapacityOn = "Dynamic Capacity: On";


    //Set DC

    public static final String setDCTextInHeader = "SET DYNAMIC CAPACITY";
    public static final String setDC_CircuitID = "Circuit ID: VLXX/109482/DEMO";
    public static final String setBandWidthText = "SET BANDWIDTH";
    public static final String setBandWidth_MIN = "new UiSelector().descriptionContains(\"MIN\")";
    public static final String setBandWidth_2x = "new UiSelector().descriptionContains(\"2x\")";
    public static final String setBandWidth_MAX = "new UiSelector().descriptionContains(\"MAX\")";
    public static final String setDurationText = "SET DURATION";
    public static final String setduration_DefaultTime = "1 Hour(s)";
    public static final String arrowUP = "arrow up ";
    public static final String arrowDown = "arrow down ";
    public static final String costPerhour = "new UiSelector().descriptionContains(\"Cost per hour\")";
    public static final String estimatedCost = "new UiSelector().descriptionContains(\"Estimated total\")";
    public static final String dynamicCapacityButton = "new UiSelector().className(\"android.widget.CheckBox\")";
    public static final String dynamicCapacityButtonId = "undefined";

    public static final String SetDcSubmit = "Set Dynamic Capacity ";
    public static final String SetDCPopup = "Activate Dynamic Capacity Increase?";
    public static final String SetDcPopupAgree = "AGREE ";
    public static final String SetDcPopupdisAgree = "DISAGREE ";


    //Search

    public static final String searchBox = "//android.widget.Button[@text='search']";
    public static final String noResultsFoundText = "NO RESULTS FOUND";
    public static final String clearSearchButton = "android.widget.Button";
    public static final String search_BackArrow = "arrow back ";

    // Sliding Menu
    public static final String slidingMenuIcon = "new UiSelector().descriptionContains(\"menu \")";
    public static final String slidingMenuHeader = "new UiSelector().description(\"MENU\")";
    public static final String slidingMenuHelp = "new UiSelector().description(\"Help\")";
    public static final String slidingMenuApplicationInfo = "new UiSelector().descriptionContains(\"Application Info\")";
    public static final String slidingMenuApplicationInfoId = "Application Info";

    public static final String slidingMenuFaqs = "new UiSelector().descriptionContains(\"Frequently Asked Questions\")";
    public static final String slidingMenuFaqsId = "Frequently Asked Questions";

    public static final String slidingMenuLegal = "new UiSelector().description(\"Legal\")";
    public static final String slidingMenuEULA = "new UiSelector().description(\"EULA\")";
    public static final String slidingMenuTermsandConditions = "new UiSelector().descriptionContains(\"Terms & Conditions\")";
    public static final String slidingMenuActions = "new UiSelector().description(\"Actions\")";
    public static final String slidingMenuCallSupport = "new UiSelector().description(\"Call Support\")";
    public static final String slidingMenuLogout = "new UiSelector().description(\"Logout\")";
    public static final String slidingMenuCloseButton = "new UiSelector().description(\"close \")";

    //Sliding Menu Application info option
    public static final String slidingMenuApplicationInfoHeader = "new UiSelector().description(\"APPLICATION INFO\")";
    public static final String slidingMenuApplicationVersion = "new UiSelector().descriptionContains(\"Application Version:\")";
    public static final String slidingMenuApplicationDataSource = "new UiSelector().description(\"Data Source: Stubbed\")";
    public static final String slidingMenuApplicationEnviroment = "new UiSelector().description(\"Environment: ENV4\")";
    public static final String slidingMenuApplicationBackArrowButton = "new UiSelector().description(\"arrow back \")";

    //Sliding Menu Faqs option
    public static final String slidingMenuFaqsHeader = "new UiSelector().description(\"FAQ\")";
    public static final String slidingMenuFaqsNeedAccess = "new UiSelector().description(\"Need Access \")";
    public static final String slidingMenuFaqsForgetPassword = "new UiSelector().description(\"Forgot Password \")";
    public static final String slidingMenuFaqsBackArrowButton = "new UiSelector().description(\"arrow back \")";

    //Sliding Menu EULA
    public static final String slidingMenuEULAHeader = "new UiSelector().description(\"EULA\")";
    public static final String slidingMenuEULAAgreement = "new UiSelector().descriptionContains(\"© Level 3 Communications, LLC.  \n" +
            "Mobile App License Agreement\")";
    public static final String slidingMenuEULABackArrowButton = "new UiSelector().description(\"arrow back \")";

    //Sliding Menu TERMS AND CONDITIONS
    public static final String slidingMenuTermsAndConditionsHeader = "new UiSelector().description(\"TERMS AND CONDITIONS\")";
    public static final String slidingMenuTermsAndConditionsRights = "new UiSelector().description(\"Intellectual Property Rights\")";
    public static final String slidingMenuTermsAndConditionsTrademark = "new UiSelector().description(\"Trademark/Service Mark Information\")";
    public static final String slidingMenuTermsAndConditionsBackArrowButton = "new UiSelector().description(\"arrow back \")";

    //Sliding Menu Logout
    public static final String logoutPopUpTitle = "new UiSelector().description(\"Are you sure?\")";
    public static final String logoutPopUpBodyMsg = "new UiSelector().description(\"Are you sure you want to log out?\")";
    public static final String logoutPopUpNoButton = "new UiSelector().description(\"NO \")";
    public static final String logoutPopUpYesButton = "new UiSelector().description(\"YES \")";


}
