package tests;

import pages.LoginPage;
import pages.RegistrationPage;
import setup.SetupDriver;

/**
 * Created by SJ on 19.01.2017.
 */
abstract class BaseTest extends SetupDriver {

    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
}
