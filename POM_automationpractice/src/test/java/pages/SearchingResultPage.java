package pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static config.WebDriverSingleton.driver;

public class SearchingResultPage extends BasePage{
    public SearchingResultPage() {
        super();
    }
    private String searchTermUpperFirstLetter;
    private String searchTermLowerFirstLetter;
    @Step
    public void checkingSearchingResult(String searchTerm){
        List<WebElement> searchingProducts = driver.findElements(By.xpath("//ul[@class='product_list grid row']//a[@class='product-name']"));
        if (!searchTerm.isEmpty())
        {
            searchTermUpperFirstLetter = searchTerm.substring(0,1).toUpperCase() + searchTerm.substring(1);
            searchTermLowerFirstLetter = searchTerm.substring(0,1).toLowerCase() + searchTerm.substring(1);
        }
        for (WebElement product : searchingProducts) {
            String productTitle = product.getAttribute("title");
            Assertions.assertTrue(productTitle.contains(searchTermUpperFirstLetter) || productTitle.contains(searchTermLowerFirstLetter),"Existing product does not match the conditional search");
        }
    }

}
