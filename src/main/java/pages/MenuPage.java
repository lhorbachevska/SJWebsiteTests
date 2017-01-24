package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MenuPage extends BasePage {
    public SelenideElement developSoftwareMenu(){
        return $(By.xpath("//*[text()='Develop Software']"));
    }

    public SelenideElement findSolutionMenu(){
        return $(By.xpath("//*[text()='Find Solution']"));
    }

    public void goToDevelopSoftwareSubmenu(String link){
        clickOnMenuButton();
        click(developSoftwareMenu());
        click(submenu(link));
    }

    public void goToFindSolutionSubmenu(String link){
        clickOnMenuButton();
        click(findSolutionMenu());
        click(submenu(link));
    }
}
