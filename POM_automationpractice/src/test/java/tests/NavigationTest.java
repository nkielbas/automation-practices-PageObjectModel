package tests;

import config.TestConfig;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class NavigationTest extends TestConfig {
    @Test
    public void BestsellerTab() {
        new HomePage()
                .GoToBestsellerTab()
                .checkingOpeningBestsellerTab();
    }

    @Test
    public void WomenCategory() {
        new HomePage()
                .GoToWomenCategory()
                .checkingOpeningWomenCategory();
    }

    @Test
    public void TopsSubcategory() {
        new HomePage()
                .GoToTopsSubcategory()
                .checkingOpeningTopsSubcategory();
    }
}
