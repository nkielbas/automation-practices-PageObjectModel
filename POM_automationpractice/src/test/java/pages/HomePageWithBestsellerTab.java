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
        List<WebElement> Tabs = driver.findElements(By.xpath("//ul[@id='home-page-tabs']/li"));
        for (WebElement li : Tabs) {
            String classAttributeValue = li.getAttribute("class");
            if(classAttributeValue.contains("active")){
                WebElement activeClass = li.findElement(By.tagName("a"));
                Assertions.assertTrue(activeClass.getAttribute("class").contains("blockbestsellers"), "Incorret tab is active");
                break;
            }
        }
    }
}
