package tests;

import config.TestConfig;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class SearchingProductsTest extends TestConfig {
    @Test
    public void Searching() {
        String searchTerm = "dress";
        new HomePage()
                .SearchingProducts(searchTerm)
                .checkingSearchingResult(searchTerm);
    }

}
