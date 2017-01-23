package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage extends BasePage{

    WebDriver driver;

    private SelenideElement emailField() {
        return $(By.xpath("//*[@type='email']"));
    }

    private SelenideElement passwordField() {
        return $(By.xpath("//*[@type='password']"));
    }

    private SelenideElement submitButton() {
        return $(By.xpath("//*[@id='login']"));
    }

    private SelenideElement forgotPasswordLink() {
        return $(By.xpath("//*[@href='https://softjourn.com/en/password/email']"));
    }

    private SelenideElement emailBoxField(){
        return $(By.xpath("//*[@id='Email']"));
    }

    private SelenideElement nextButtonEmailBox(){
        return $(By.xpath("//*[@id='next']"));
    }

    private SelenideElement passwordEmailBoxField(){
        return $(By.xpath("//*[@id='Passwd']"));
    }

    private SelenideElement signinButtonEmailBox(){
        return $(By.xpath("//*[@id='signIn']"));
    }

    private SelenideElement searchFieldEmailBox(){
        return $(By.xpath("//*[@name='q']"));
    }

    private SelenideElement chooseLetter(){
        return $(By.xpath("//*[@class='xY a4W']"));
    }

    private SelenideElement linkToResetPassword(){
        return $(By.xpath("//*//a[contains(text(),'softjourn')]"));
    }

    private SelenideElement emailReset() {
        return $(By.name("email"));
    }
    private SelenideElement passwordConfirmResetPasswField(){
        return $(By.xpath("//*[@name='password_confirmation']"));
    }


    private SelenideElement resetConfirmButton(){
        return $(By.xpath("//*[@id='reset']"));
    }

    public void forgotPassword(String email){
        click(forgotPasswordLink());
        type(email,emailField());
        click(submitButton());
    }

    public void openEmailBox(String email, String password, String searchText){
        open("https://gmail.com");
        type(email,emailBoxField());
        click(nextButtonEmailBox());
        type(password,passwordEmailBoxField());
        click(signinButtonEmailBox());
        click(searchFieldEmailBox());
        type(searchText,searchFieldEmailBox());
        searchFieldEmailBox().sendKeys(Keys.ENTER);
        click(chooseLetter());
        String url = linkToResetPassword().getText();
        open(url);
    }

    public void resetPassword(String email, String password){
        type(email,emailReset());
        type(password, passwordField());
        type(password,passwordConfirmResetPasswField());
        click(resetConfirmButton());
    }

    public void openLoginForm(){
        clickOnMenuButton();
        click(loginButton());
    }

    public void loginWith(Data user){
        openLoginForm();
        type(user.email,emailField());
        type(user.password,passwordField());
        submitButton().click();
    }

    public void logout(){
        click(menuButton());
        loginButton().waitUntil(appears,2000);
        click(loginButton());
    }
}
