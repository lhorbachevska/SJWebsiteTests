package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.MenuPage;
import pages.RegistrationPage;

import java.io.IOException;


abstract class BaseTest {
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    MenuPage menuPage = new MenuPage();

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://softjourn.com");
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void tearDown() throws IOException {
        WebDriverRunner.closeWebDriver();
    }
}
