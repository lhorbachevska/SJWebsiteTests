package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class FindSolutionPage extends BasePage {



    public SelenideElement videoAdviceLink(){
        return $(By.xpath("//*[@href='https://www.youtube.com/watch?v=p8RarJusUvc&list=PLoIFFM6KB2HnafXZ-0VMDx4STDFrylUsE']"));
    }

    public SelenideElement videoAdviceTitle(){
        return $(By.xpath("//*[@id='eow-title']"));
    }

    public SelenideElement videoAdviceOnPageTitle(){
        return $(By.xpath("//*[text()='Pavel Asanov - Advice to startups']"));
    }


    public SelenideElement iKoboLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/C-Linux-CORBA-PostgreSQL']"));
    }

    public SelenideElement medicalBilling(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/NET-Ajax-FLEX-MSSQL']"));
    }

    public SelenideElement nexeraLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/Java-SOAP-Spring_Framework']"));
    }

    public SelenideElement ePlyLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/javascript-AJAX-Microsoft']"));
    }

    public SelenideElement vendiniLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/php-MySQL-LAMP-flash-open_source']"));
    }

    public SelenideElement viamericasLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/net-MSSQL-Visual_Studio']"));
    }

    public SelenideElement savingPathLink(){
        return $(By.xpath("//*[@href='https://softjourn.com/en/project/PHP-LAMP-Ukraine']"));
    }



}
