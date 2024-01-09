package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static config.WebDriverSingleton.driver;

public class HomePageWithBestsellerTab extends BasePage {

    public HomePageWithBestsellerTab() {
        super();
    }
    @Step
    public void checkingOpeningBestsellerTab() {
        WebElement ulElement = driver.findElement(By.id("home-page-tabs"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        for (WebElement li : liElements) {
            String classAttributeValue = li.getAttribute("class");
            if(classAttributeValue.contains("active")){
                WebElement aElement = li.findElement(By.tagName("a"));
                Assertions.assertTrue(aElement.getAttribute("class").contains("blockbestsellers"), "Incorret tab is active");
                break;
            }
        }
    }
}
