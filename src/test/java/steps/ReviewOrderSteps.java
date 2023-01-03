package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ReviewOrderPage;

public class ReviewOrderSteps {

    ReviewOrderPage reviewOrderPage;

    public ReviewOrderSteps(){
        reviewOrderPage = new ReviewOrderPage();
    }

    @Then("user in review order page")
    public void userInReviewOrderPage() {
        assert reviewOrderPage.getTitleReviewOrder().equals("Review your order");
    }

    @And("review order product name is {string}")
    public void reviewOrderProductNameIs(String productName) {
        assert reviewOrderPage.getProductNameReviewOrder().equals(productName);
    }

    @And("scroll to see detail in review order page")
    public void scrollToSeeDetailInReviewOrderPage() {
        reviewOrderPage.scrollToDetail();
    }

    @And("review order deliver address full name is {string}")
    public void reviewOrderDeliverAddressFullNameIs(String fullName) {
        assert reviewOrderPage.getFullNameDeliverAddress().equals(fullName);
    }

    @And("review order deliver address address is {string}")
    public void reviewOrderDeliverAddressAddressIs(String address) {
        assert reviewOrderPage.getAddressDeliverAddress().equals(address);
    }

    @And("review order payment method card name is {string}")
    public void reviewOrderPaymentMethodCardNameIs(String cardName) {
        assert reviewOrderPage.getCardNamePaymentMethod().equals(cardName);
    }

    @And("review order payment method card number is {string}")
    public void reviewOrderPaymentMethodCardNumberIs(String cardNumber) {
        assert reviewOrderPage.getCardNumberPaymentMethod().equals(cardNumber);
    }

    @And("review order total items is {string}")
    public void reviewOrderTotalItemsIs(String totalItems) {
        assert reviewOrderPage.getTotalItemReviewOrder().contains(totalItems);
    }

    @When("user click place order")
    public void userClickPlaceOrder() {
        reviewOrderPage.clickPlaceOrderButton();
    }
}
