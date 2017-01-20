package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage extends BasePage {



    private SelenideElement registrationForm() {
        return $(By.xpath("//*[@class='form-link']"));
    }

    private SelenideElement nameField() {
        return $(By.xpath("//*[@name='name']"));
    }

    private SelenideElement emailField() {
        return $(By.xpath("//*[@name='email']"));
    }

    private SelenideElement passwordField() {
        return $(By.xpath("//*[@name='password']"));
    }

    private SelenideElement confirmPasswordField() {
        return $(By.xpath("//*[@name='password_confirmation']"));
    }

    private SelenideElement signUpButton() {
        return $(By.xpath("//*[@id='login']"));
    }


    public void registerWith(Data user){
        clickOnMenuButton();
        click(loginButton());
        click(registrationForm());
        type(user.name, nameField());
        type(user.email, emailField());
        type(user.password, passwordField());
        type(user.confirmPassw, confirmPasswordField());
        click(signUpButton());
    }
}
