package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class YandexPageObject {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://dzen.ru/?yredirect=true";
    public YandexPageObject(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DRIVER_DURATION)); //испольуем ожидание
        driver.get(DRIVER_SITE);
    }
    //Кнопка для ввода текста в поисковой строке
    private By findButton = By.xpath(".//div[@class='mini-suggest__popup mini-suggest__popup_svg_yes mini-suggest__popup_theme_tile mini-suggest__popup_type-icon_yes mini-suggest__popup_redesigned-navs_yes mini-suggest__popup_services_empty mini-suggest__popup_has-items_yes']");
    //Кнопка для перехода в раздел "Соусы"
  //  private By sauceButton = By.xpath(".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']//span[text()='Соусы']");
    //Кнопка для перехода в раздел "Начинки"
  //  private By fillingsButton = By.xpath(".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']//span[text()='Начинки']");

    @Step("Проверка на корректную работу поля Булки")
    public void clickFindsButton(){
       driver.findElement(findButton).click();
    }
    @Step("Проверка на корректную работу поля Соусы")
    public void writeRequest(String request){
        driver.findElement(findButton).sendKeys(request);
    }
}


