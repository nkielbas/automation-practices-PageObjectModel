package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import tools.DataFaker;


public class SignUpPage extends BasePage {

    public SignUpPage() {
        super();
    }

    private DataFaker faker = new DataFaker();

    @FindBy(id = "id_gender1")
    private WebElement genderInput;

    @FindBy(id = "customer_firstname")
    private WebElement FirstnameInput;

    @FindBy(id = "customer_lastname")
    private WebElement LastnameInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "submitAccount")
    private WebElement submitButton;

        private void fillInRegistrationForm() {
            genderInput.click();
            FirstnameInput.sendKeys(faker.FakeFirstname());
            LastnameInput.sendKeys(faker.FakeLastname());
            passwordInput.sendKeys(faker.FakePassword());
        }

    @Step
    public ProfilePage submitRegistrationForm() {
        fillInRegistrationForm();
        submitButton.click();
        return new ProfilePage();
    }

    }

