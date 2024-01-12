package tests;

import config.TestConfig;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class BasketProcessTest extends TestConfig {

    @Test
    public void addToCartTest() {
        new HomePage()
                .GoToWomenCategory()
                .addToCart();
    }

}
