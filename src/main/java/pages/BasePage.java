package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by SJ on 18.01.2017.
 */
public class BasePage {

    protected SelenideElement menuButton(){
        return $(By.xpath("//*[@class='menu-line']"));
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
        element.click();;
    }

    public String getWarningMessage(){
        return warningBlock().getText().toUpperCase();
    }


}
