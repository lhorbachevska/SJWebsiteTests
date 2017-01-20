package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class BasePage {

    protected SelenideElement menuButton(){
        return $(By.xpath("//*[@class='menu-line']"));
    }

    protected SelenideElement loginButton() {
        return $(By.xpath("//*[@class='auth']"));
    }

    protected SelenideElement warningBlock() {
        return $(By.xpath("//*[@class='message alert-warning']"));
    }

    protected void clickOnMenuButton(){
        click(menuButton());
    }

    protected void type (String inputText, SelenideElement element){
        element.waitUntil(visible,5000);
        element.setValue(inputText);
    }

    protected void click(SelenideElement element){
        element.waitUntil(visible,10000);
        element.click();
    }

    private String getWarningMessage(){
        return warningBlock().getText().toUpperCase();
    }

    private String getSuccessMes(){
        click(menuButton());
        loginButton().waitUntil(appears,1000);
        return loginButton().getText().toUpperCase();
    }

    public void negativeTestAssertion(String expected){
        Assert.assertEquals(expected,getWarningMessage());
    }

    public void positiveTestAssertion(String expected){
        Assert.assertEquals(expected,getSuccessMes());
    }

}
