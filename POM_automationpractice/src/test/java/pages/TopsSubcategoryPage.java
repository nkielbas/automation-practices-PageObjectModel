package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static config.WebDriverSingleton.driver;


public class TopsSubcategoryPage extends BasePage {

    public TopsSubcategoryPage() {
        super();
    }

    @Step
    public void checkingOpeningTopsSubcategory() {
        Assertions.assertTrue(driver.getCurrentUrl().contains("id_category=4"), "Incorrect URL");
    }
}
