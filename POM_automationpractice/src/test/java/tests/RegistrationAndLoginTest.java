package tests;

import config.TestConfig;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class RegistrationAndLoginTest extends TestConfig {
    @Test
    public void registration() {
        new HomePage()
                .openSignInPage()
                .submitCreateAccountForm()
                .submitRegistrationForm()
                .checkingRegistration();
    }

    @Test
    public void login() {
        new HomePage()
                .openSignInPage()
                .LogIn()
                .checkingLogin();
    }
}
