package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Inet on 1/23/2017.
 */
public class MainPage extends BasePage {
    public SelenideElement contactUsMenu(){
        return $(By.xpath(".//*/span[text()='Contact Us']"));
    }

    public SelenideElement contactUsSubmenu(){
        return $(By.xpath("(.//*/a[@href='https://softjourn.com/en/contact-us'])[1]"));
    }

    public SelenideElement pressKitSubmenu(){
        return $(By.xpath(".//*/a[@href='https://softjourn.com/en/cms/press_kit']"));
    }

}
