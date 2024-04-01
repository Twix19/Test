import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.YandexPageObject;
import static org.junit.Assert.assertTrue;

public class YandexTest {
    WebDriver driver = setUpDriver();
    YandexPageObject yandex = new YandexPageObject(driver);
    static final String PATH_TO_CHROME = "chromedriver.exe";
    static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";


    public WebDriver setUpDriver() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @Test
    public void goToConstructor() {
       yandex.clickFindsButton();
       yandex.writeRequest("яндекс маркет");

    }
}