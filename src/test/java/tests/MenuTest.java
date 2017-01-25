package tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import testingData.TestingData;


@RunWith(DataProviderRunner.class)
public class MenuTest extends BaseTest implements TestingData {

    @Test
    @UseDataProvider("developSoftwareSubmenu")
    public void verifyDevelopSoftwareSubmenu(String submenuLink, String pageTitle){
        menuPage.goToDevelopSoftwareSubmenu(submenuLink);
        menuPage.assertPageTitle(pageTitle);
    }

    @Test
    @UseDataProvider("saasLink")
    public void verifySaaSPageLink(String link, String title) throws InterruptedException {
        menuPage.goToDevelopSoftwareSubmenu(LINK_SAAS_SUBMENU);
        menuPage.clickOnPageLink(link);
        menuPage.assertPageTitle(title);
    }

    @Test
    @UseDataProvider("findSolutionSubmenu")
    public void verifyFindSolutionSubmenu(String submenuLink, String pageTitle){
        menuPage.goToFindSolutionSubmenu(submenuLink);
        menuPage.assertPageTitle(pageTitle);
    }

    @Test
    @UseDataProvider("startupLink")
    public void verifyForStartupsPageLinks(String link, String title){
        menuPage.goToFindSolutionSubmenu(LINK_FOR_STARTUPS_SUBMENU);
        menuPage.clickOnPageLink(link);
        menuPage.assertPageTitle(title);
    }

    @Test
    @UseDataProvider("smallAndMediumEnterprisesLink")
    public void verifyForSmallAndMediumEnterprisesPageLinks(String link, String title){
        menuPage.goToFindSolutionSubmenu(LINK_FOR_SMALL_AND_MEDIUM_ENTERPRISES);
        menuPage.clickOnPageLink(link);
        menuPage.assertPageTitle(title);
    }

    @Test
    @UseDataProvider("ceosLink")
    public void verifyForCEOsPageLinks(String link, String title){
        menuPage.goToFindSolutionSubmenu(LINK_FOR_CEOS);
        menuPage.clickOnPageLink(link);
        menuPage.assertPageTitle(title);
    }

    @DataProvider
    public static Object[][] developSoftwareSubmenu(){
        return new Object[][]{
                {LINK_SAAS_SUBMENU,SAAS_TITLE},
                {LINK_ATM_SUBMENU,ATM_TITLE},
                {LINK_RD_SUBMENU,RD_TITLE},
                {LINK_ADM_SUBMENU,ADM_TITLE}
        };
    }

    @DataProvider
    public static Object[][] saasLink(){
        return new Object[][]{
                {PAGE_LINK_AGILE,AGILE_TITLE},
                {PAGE_LINK_ATM,ATM_TITLE}
        };
    }

    @DataProvider
    public static Object[][] findSolutionSubmenu(){
        return new Object[][]{
                {LINK_FOR_STARTUPS_SUBMENU,FOR_STARTUPS_TITLE},
                {LINK_FOR_SMALL_AND_MEDIUM_ENTERPRISES,FOR_SMALL_AND_MEDIUM_ENTERPRISES_TITLE},
                {LINK_FOR_CEOS,FOR_CEOS_TITLE}
        };
    }

    @DataProvider
    public static Object[][] startupLink(){
        return new Object[][]{
                {STARTUP_TACIT,STARTUP_TACIT_TITLE},
                {STARTUP_POWWOW,STARTUP_POWWOW_TITLE},
                {STARTUP_SAY_WHAT,STARTUP_SAY_WHAT_TITLE},
                {STARTUP_PANA,STARTUP_PANA_TITLE},
                {STARTUP_PLAY_FITNESS,STARTUP_PLAY_FITNESS_TITLE},
                {STARTUP_TRULY_SHARE,STARTUP_TRULY_SHARE_TITLE},
                {STARTUP_NOCA,STARTUP_NOCA_TITLE},
                {STARTUP_PLAY_SPORT,STARTUP_PLAY_SPORT_TITLE},
                {STARTUP_PREFFERED_ENERGY_SERVICES,STARTUP_PREFFERED_ENERGY_SERVICES_TITLE},
                {STARTUP_RAZORCOAST,STARTUP_RAZORCOAST_TITLE},
                {STARTUP_RTP_FINANCIALS,STARTUP_RTP_FINANCIALS_TITLE},
                {STARTUP_NUTRITION_SYSTEMS,STARTUP_NUTRITION_SYSTEMS_TITLE}
        };
    }

    @DataProvider
    public static Object[][] smallAndMediumEnterprisesLink(){
        return new Object[][]{
                {IKOBO,IKOBO_TITLE},
                {MEDICAL_BILLING,MEDICAL_BILLING_TITLE},
                {NEXERA,NEXERA_TITLE},
                {EPLY,EPLY_TITLE}
        };
    }

    @DataProvider
    public static Object[][] ceosLink(){
        return new Object[][]{
                {VENDINI,VENDINI_TITLE},
                {VIAMERICAS,VIAMERICAS_TITLE},
                {SAVING_PATH,SAVING_PATH_TITLE},
                {STARTUP_PREFFERED_ENERGY_SERVICES,STARTUP_PREFFERED_ENERGY_SERVICES_TITLE}
        };
    }

}
