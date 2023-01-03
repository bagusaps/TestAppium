package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailPage;

public class ProductDetailSteps{
    ProductDetailPage productDetailPage;

    public ProductDetailSteps(){
        productDetailPage = new ProductDetailPage();
    }

    @Then("user in product {string} detail page")
    public void userInProductDetailPage(String productName) {
        assert productDetailPage.getTitleProductDetailPage().equals(productName);
    }

    @When("user select color {string}")
    public void userSelectColor(String colorName) {
        productDetailPage.clickColorByColorName(colorName);
    }

    @When("user put quantity item is {int}")
    public void userPutQuantityItemIs(int quantity) {
        if(quantity>1){
            for(int i=1;i<quantity;i++){
               productDetailPage.clickIncreaseItemQuantity();
            }
        }
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        productDetailPage.clickAddtoCartButton();
    }

    @And("user click my cart icon")
    public void userClickMyCartIcon() {
        productDetailPage.clickMyCartIcon();
    }
}
