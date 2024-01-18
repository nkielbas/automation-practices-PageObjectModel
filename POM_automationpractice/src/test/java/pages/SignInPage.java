package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tools.DataFaker;

    public class SignInPage extends BasePage {

        public SignInPage() {
            super();
        }

        private DataFaker faker = new DataFaker();

        @FindBy(id = "email_create")
        private WebElement emailInput;

        @FindBy(id = "SubmitCreate")
        private WebElement createAccountButton;

        @FindBy(id = "email")
        private WebElement emailLogin;

        @FindBy(id = "passwd")
        private WebElement passwordLogin;

        @FindBy(id = "SubmitLogin")
        private WebElement submitLoginButton;

        private void emailEntry(String email) {

            emailInput.sendKeys(email);
        }

        @Step
        public SignUpPage submitCreateAccountForm() {
            emailEntry(faker.FakeEmail());
            createAccountButton.click();
            return new SignUpPage();
        }

        @Step
        public ProfilePage LogIn() {
            emailLogin.sendKeys("nktest@test.pl");
            passwordLogin.sendKeys("nktestpass");
            submitLoginButton.click();
            return new ProfilePage();
        }
    }

