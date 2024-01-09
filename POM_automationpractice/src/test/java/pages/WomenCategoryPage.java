package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static config.WebDriverSingleton.driver;

public class WomenCategoryPage extends BasePage {

    public WomenCategoryPage() {
        super();
    }

    @Step
    public void checkingOpeningWomenCategory() {
        Assertions.assertTrue(driver.getCurrentUrl().contains("id_category=3"), "Incorrect URL");
    }
}
