package testingData;

import pages.Data;


public interface TestingData {

    Data loginValidCredentials = new Data("testlhor01@gmail.com","123456");
    Data loginInvalidCred = new Data("testlhor01@gmail.com","1234567");
    Data loginEmptyEmail = new Data ("","123456");
    Data loginEmptyPassw = new Data ("testlhor01@gmail.com","");
    Data loginEmptyFields = new Data("","");

    String LOGIN_SUCCESS_MESSAGE = "LOGOUT";
    String LOGIN_INVALID_CREDENTIALS_MESSAGE = "THESE CREDENTIALS DO NOT MATCH OUR RECORDS.";
    String LOGIN_EMPTY_EMAIL_MESSAGE = "THE EMAIL SHOULD BE SET";
    String LOGIN_EMPTY_PASSWORD_MESSAGE = "THE PASSWORD SHOULD BE SET";
    String LOGIN_EMPTY_FIELDS_MESSAGE = "THE EMAIL SHOULD BE SET\n" + "THE PASSWORD SHOULD BE SET";

    String LOGOUT_SUCCESS_MESSAGE = "LOGIN";

    Data signupEmptyFields = new Data("","","","");
    Data signupEmptyEmailPasswordFields = new Data("test","","","");
    Data signupEmptyPasswordFields = new Data("test","z@z.com","","");
    Data signupEmptyConfirmPasswordField = new Data("test","z@z.com","123456","");
    Data signupPasswordLessThan6Symbols = new Data("test","z@z.com","12345","12345");
    Data signupConfirmPasswordDiffers = new Data("test","z@z.com","123456","654321");
    Data signupEmptyEmailField = new Data("test","","123456","123456");
    Data signupEmptyNameField = new Data("","z@z.com","123456","123456");
    Data signupNonLetterName = new Data("123456789!@#$%^&*()_+","z@z.com","123456","123456");
    Data signupSuccess = new Data("test","z@t.com","123456","123456");

    String SIGNUP_EMPTY_FIELDS_MESSAGE = "THE NAME SHOULD BE SET\n" + "THE EMAIL SHOULD BE SET\n" + "THE PASSWORD SHOULD BE SET";
    String SIGNUP_EMPTY_EMAIL_PASSWORD_MESSAGE = "THE EMAIL SHOULD BE SET\n" + "THE PASSWORD SHOULD BE SET";
    String SIGNUP_EMPTY_NAME_MESSAGE = "THE NAME SHOULD BE SET";

    String EMAIL_TO_RESET_PASSWORD ="testlhor02@gmail.com";
    String PASSWORD_TO_RESET = "testlhor2";
    String SEARCH_LETTER_TO_RESET = "in:unread subject: your password reset link ";

    String LINK_SAAS_SUBMENU = "https://softjourn.com/en/cms/saas";
    String LINK_ATM_SUBMENU = "https://softjourn.com/en/cms/atm-ua";
    String LINK_RD_SUBMENU = "https://softjourn.com/en/cms/research-and-development";
    String LINK_ADM_SUBMENU = "https://softjourn.com/en/cms/Application_Development_&_Maintenance";

    String SAAS_TITLE = "SOFTWARE AS A SERVICE";
    String ATM_TITLE = "ASSEMBLY & TEAM MANAGEMENT (ATM)";
    String RD_TITLE = "RESEARCH & DEVELOPMENT";
    String ADM_TITLE = "APPLICATION DEVELOPMENT & MAINTENANCE";

    String LINK_CONTACT_US = "https://softjourn.com/en/contact-us";
    String CONTACT_US_TITLE = "CONTACT US";

    String PAGE_LINK_AGILE = "https://softjourn.com/en/article/agile";
    String PAGE_LINK_ATM = "https://softjourn.com/en/article/atm-ua";
    String AGILE_TITLE = "AGILE DEVELOPMENT METHODOLOGY";

    String LINK_FOR_STARTUPS_SUBMENU = "https://softjourn.com/en/cms/for-start-ups";
    String LINK_FOR_SMALL_AND_MEDIUM_ENTERPRISES = "https://softjourn.com/en/cms/for-smes";
    String LINK_FOR_CEOS = "https://softjourn.com/en/cms/for-ceos";

    String FOR_STARTUPS_TITLE = "FOR START UPS";
    String FOR_SMALL_AND_MEDIUM_ENTERPRISES_TITLE = "FOR SMALL AND MEDIUM ENTERPRISES";
    String FOR_CEOS_TITLE = "FOR CHIEF EXECUTIVE OFFICERS";

    String STARTUP_TACIT = "https://softjourn.com/en/project/android-mobile-app-restaurant-orders";
    String STARTUP_POWWOW = "https://softjourn.com/en/project/java-iOS-PowWow";
    String STARTUP_SAY_WHAT = "https://softjourn.com/en/project/android-ukraine-saywhat";
    String STARTUP_PANA = "https://softjourn.com/en/project/zend-php-brightcove_api-online-video-streaming";
    String STARTUP_PLAY_FITNESS = "https://softjourn.com/en/project/open-source-ukraine-sports-video-solution";
    String STARTUP_TRULY_SHARE = "https://softjourn.com/en/iphone-mobile-development-trulyshare";
    String STARTUP_NOCA = "https://softjourn.com/en/project/Glassfish-open_source-Drools-JavaScript";
    String STARTUP_PLAY_SPORT = "https://softjourn.com/en/project/social-network-development-playsport";
    String STARTUP_PREFFERED_ENERGY_SERVICES = "https://softjourn.com/en/project/php-MySQL-LAMP-SAAS-Ukraine";
    String STARTUP_RAZORCOAST = "https://softjourn.com/en/project/facebook-app-development-razorcoast";
    String STARTUP_RTP_FINANCIALS = "https://softjourn.com/en/project/ajax-php-MySQL-open_source-ukraine";
    String STARTUP_NUTRITION_SYSTEMS = "https://softjourn.com/en/project/PHP-MYSQL-Facebook";

    String STARTUP_TACIT_TITLE = "TACIT INNOVATIONS - ANDROID APP FOR PROCESSING RESTAURANT ORDERS!";
    String STARTUP_POWWOW_TITLE = "DELIVERING WINDOWS WEB AND DESKTOP APPS TO A TABLET";
    String STARTUP_SAY_WHAT_TITLE = "SAYWHAT - ANDROID APP FOR BETTER CALLING EXPERIENCE";
    String STARTUP_PANA_TITLE = "VIDEO STREAMING DONE EASILY";
    String STARTUP_PLAY_FITNESS_TITLE = "WORKOUT ONLINE ANYWHERE, ANYTIME";
    String STARTUP_TRULY_SHARE_TITLE = "SHARE PHOTOS OF PRODUCTS YOU LOVE WITH YOUR FRIENDS";
    String STARTUP_NOCA_TITLE = "START ACCEPTING PAYMENTS ON WEBSITES IN MINUTES";
    String STARTUP_PLAY_SPORT_TITLE = "PLAYSPORT – SPORTS SOCIAL COMMUNITY";
    String STARTUP_PREFFERED_ENERGY_SERVICES_TITLE = "PREFERRED ENERGY (PES) — SOFTWARE AS A SERVICE CONVERSION";
    String STARTUP_RAZORCOAST_TITLE = "RAZORCOAST FACEBOOK COMPETITION APPLICATION";
    String STARTUP_RTP_FINANCIALS_TITLE = "RTP FINANCIALS — PAYPARTNERS (ACQUIRED BY TRANSCARD)";
    String STARTUP_NUTRITION_SYSTEMS_TITLE = "OUR WORK WITH NUTRITION SYSTEMS";

    String IKOBO = "https://softjourn.com/en/project/C-Linux-CORBA-PostgreSQL";
    String MEDICAL_BILLING = "https://softjourn.com/en/project/NET-Ajax-FLEX-MSSQL";
    String NEXERA = "https://softjourn.com/en/project/Java-SOAP-Spring_Framework";
    String EPLY = "https://softjourn.com/en/project/javascript-AJAX-Microsoft";
    String IKOBO_TITLE = "IKOBO - ONLINE MONEY TRANSFER SERVICE";
    String MEDICAL_BILLING_TITLE = "A MORE INTUITIVE SYSTEM";
    String NEXERA_TITLE = "BUSINESS SOLUTIONS AGGREGATOR";
    String EPLY_TITLE = "ONLINE EVENT REGISTRATION SERVICES";

    String VENDINI = "https://softjourn.com/en/project/php-MySQL-LAMP-flash-open_source";
    String VIAMERICAS = "https://softjourn.com/en/project/net-MSSQL-Visual_Studio";
    String SAVING_PATH = "https://softjourn.com/en/project/PHP-LAMP-Ukraine";
    String VENDINI_TITLE = "VENDINI - SELL MORE TICKETS!";
    String VIAMERICAS_TITLE = "VIAMERICAS - WIRE TRANSFER SERVICES FOR LATIN AMERICA";
    String SAVING_PATH_TITLE = "SAVINGS PATH — SPEND MANAGEMENT SOLUTIONS";

}
