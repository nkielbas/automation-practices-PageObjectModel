package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;

import static config.WebDriverSingleton.driver;

public class WomenCategoryPage extends BasePage {

    public WomenCategoryPage() {
        super();
    }

    @FindBy(className = "ajax_add_to_cart_button")
    private WebElement addToCartButton;

    @FindBy(id = "layer_cart")
    private WebElement addToCartPopup;

    @Step
    public void checkingOpeningWomenCategory() {
        Assertions.assertTrue(driver.getCurrentUrl().contains("id_category=3"), "Incorrect URL");
    }

    @Step
    public void addToCart (){
        addToCartButton.click();
        Assertions.assertTrue(addToCartPopup.isDisplayed(), "The pop up is not displayed");
    }
}
