package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static config.WebDriverSingleton.driver;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

   private Actions action = new Actions(driver);

    @FindBy(className = "header_user_info")
    private WebElement signInButton;

    @FindBy(className = "sf-with-ul")
    private WebElement WomenCategory;

    @FindBy(xpath = "//a[@title='Tops' and contains(@href, 'id_category=4')]")
    private WebElement TopsSubcategory;

    @FindBy(xpath = "//a[@class='blockbestsellers' and contains(@href, 'blockbestsellers')]")
    private WebElement BestsellerTab;

    @FindBy(id = "search_query_top")
    private WebElement searchbox;

    @Step
    public SignInPage openSignInPage() {
        signInButton.click();
        return new SignInPage();
    }

    @Step
    public WomenCategoryPage GoToWomenCategory() {
        WomenCategory.click();
        return new WomenCategoryPage();
    }

    @Step
    public TopsSubcategoryPage GoToTopsSubcategory() {
        action.moveToElement(WomenCategory).perform();
        TopsSubcategory.click();
        return new TopsSubcategoryPage();
    }

    @Step
    public HomePageWithBestsellerTab GoToBestsellerTab(){

        BestsellerTab.click();
        return new HomePageWithBestsellerTab();
    }

    @Step
    public SearchingResultPage SearchingProducts(String searchTerm){
        searchbox.sendKeys(searchTerm);
        searchbox.submit();
        return new SearchingResultPage();
    }
}

