package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static config.WebDriverSingleton.getInstance;
import static config.WebDriverSingleton.quit;
import static java.util.concurrent.TimeUnit.SECONDS;

public class TestConfig {

    private WebDriver driver;

    @BeforeEach
    public void before (){
        String baseUrl = "http://automationpractice.pl";

        driver = getInstance();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get(baseUrl);
    }

  @AfterEach
   public void after () {
       quit();
   }
}
