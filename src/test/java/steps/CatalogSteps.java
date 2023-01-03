package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CatalogPage;

public class CatalogSteps {
    CatalogPage catalogPage;

    public CatalogSteps(){
        catalogPage = new CatalogPage();
    }

    @Given("user in product catalog page")
    public void userInProductCatalogPage() {
        assert catalogPage.isCatalogPageDisplayed().equals(true);
    }
    @When("user click product {string}")
    public void userClickProduct(String productName) {
        catalogPage.clickProduct(productName);
    }

}
