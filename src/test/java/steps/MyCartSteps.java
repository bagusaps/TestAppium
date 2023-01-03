package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyCartPage;
import pages.ProductDetailPage;

public class MyCartSteps {

    MyCartPage myCartPage;

    public MyCartSteps(){
        myCartPage = new MyCartPage();
    }

    @Then("user in my cart page")
    public void userInMyCartPage() {
        assert myCartPage.getMyCartPageTitle().equalsIgnoreCase("My Cart");
    }

    @And("my cart page item name is {string}")
    public void myCartPageItemNameIs(String itemName) {
        assert myCartPage.getItemName().equalsIgnoreCase(itemName);
    }

    @And("my cart page item quantity is {string}")
    public void myCartPageItemQuantityIs(String quantity) {
        assert myCartPage.getItemQuantity().equals(quantity);
    }

    @And("my cart page item total quantity is {string}")
    public void myCartPageItemTotalQuantityIs(String totalQuantity) {
        assert myCartPage.getItemTotalQuantity().contains(totalQuantity);
    }

    @When("user click proceed to checkout")
    public void userClickProceedToCheckout() {
        myCartPage.clickProceedToCheckoutButton();
    }
}
