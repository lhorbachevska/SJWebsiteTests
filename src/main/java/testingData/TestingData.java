package testingData;

import pages.Data;

/**
 * Created by SJ on 19.01.2017.
 */
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
}
