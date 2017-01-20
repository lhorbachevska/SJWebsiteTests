package tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.Data;
import testingData.TestingData;



@RunWith(DataProviderRunner.class)

public class LoginTest extends BaseTest implements TestingData {

    @Test
    public void verifySuccessLogin() {
        loginPage.loginWith(loginValidCredentials);
        loginPage.positiveTestAssertion(LOGIN_SUCCESS_MESSAGE);
    }

    @Test
    @UseDataProvider("loginNegativeCases")
    public void verifyLoginWithWrongCredentials(Data data, String warningMessage) {
        loginPage.loginWith(data);
        loginPage.negativeTestAssertion(warningMessage);
    }

    @DataProvider
    public static Object[][] loginNegativeCases() {
        return new Object[][]{
                {loginInvalidCred, LOGIN_INVALID_CREDENTIALS_MESSAGE},
                {loginEmptyEmail, LOGIN_EMPTY_EMAIL_MESSAGE},
                {loginEmptyPassw, LOGIN_EMPTY_PASSWORD_MESSAGE},
                {loginEmptyFields, LOGIN_EMPTY_FIELDS_MESSAGE}
        };
    }


    @Test
    public void resetPassword() throws InterruptedException {
        loginPage.openLoginForm();
        loginPage.forgotPassword(EMAIL_TO_RESET_PASSWORD);
        loginPage.openEmailBox(EMAIL_TO_RESET_PASSWORD, PASSWORD_TO_RESET,SEARCH_LETTER_TO_RESET);
        loginPage.resetPassword(EMAIL_TO_RESET_PASSWORD,PASSWORD_TO_RESET);
        loginPage.positiveTestAssertion(LOGIN_SUCCESS_MESSAGE);
    }

}
