package tests;

import pages.LoginPage;
import pages.RegistrationPage;
import setup.SetupDriver;


abstract class BaseTest extends SetupDriver {

    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
}
