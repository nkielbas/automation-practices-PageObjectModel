package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static config.WebDriverSingleton.driver;

public class ProfilePage extends BasePage {

    public ProfilePage() {
        super();
    }

    @FindBy(xpath = "//p[contains(@class, 'alert-success')]" )
    private WebElement successAlert;

    @Step
    public void checkingRegistration() {
        Assertions.assertTrue(successAlert.isDisplayed(), "The success alert is not displayed");
    }

    @Step
    public void checkingLogin() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("http://www.automationpractice.pl/index.php?controller=my-account"), "Incorrect URL");

    }


}
