package tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.Data;
import testingData.TestingData;



@RunWith(DataProviderRunner.class)
public class RegistrationTest extends BaseTest implements TestingData {

    @Test
    public void verifySuccessRegistration(){
        registrationPage.registerWith(signupSuccess);
        registrationPage.positiveTestAssertion(LOGIN_SUCCESS_MESSAGE);
    }

    @Test
    @UseDataProvider("registerNegativeCases")
    public void verifyRegistrationNegativeCases(Data data, String warningMessage) {
        registrationPage.registerWith(data);
        registrationPage.negativeTestAssertion(warningMessage);
    }

    @DataProvider
    public static Object[][] registerNegativeCases() {
        return new Object[][]{
                {signupEmptyFields, SIGNUP_EMPTY_FIELDS_MESSAGE},
                {signupEmptyConfirmPasswordField, LOGIN_EMPTY_PASSWORD_MESSAGE},
                {signupConfirmPasswordDiffers, LOGIN_EMPTY_PASSWORD_MESSAGE},
                {signupEmptyEmailField, LOGIN_EMPTY_EMAIL_MESSAGE},
                {signupEmptyEmailPasswordFields, SIGNUP_EMPTY_EMAIL_PASSWORD_MESSAGE},
                {signupEmptyNameField, SIGNUP_EMPTY_NAME_MESSAGE},
                {signupEmptyPasswordFields, LOGIN_EMPTY_PASSWORD_MESSAGE},
                {signupNonLetterName, SIGNUP_EMPTY_NAME_MESSAGE},
                {signupPasswordLessThan6Symbols, LOGIN_EMPTY_PASSWORD_MESSAGE}
        };
    }

}
