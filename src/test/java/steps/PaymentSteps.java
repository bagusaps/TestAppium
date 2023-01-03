package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaymentPage;

public class PaymentSteps {

    PaymentPage paymentPage;

    public PaymentSteps(){
        paymentPage = new PaymentPage();
    }

    @Then("user in checkout payment page")
    public void userInCheckoutPaymentPage() {
        assert paymentPage.getPaymentTitle().equals("Enter a payment method");
    }

    @When("user input full name {string} in checkout payment page")
    public void userInputFullNameInCheckoutPaymentPage(String fullName) {
        paymentPage.inputFullNamePayment(fullName);
    }

    @And("user input card number {string} in checkout payment page")
    public void userInputCardNumberInCheckoutPaymentPage(String cardNumber) {
        paymentPage.inputCardNumberPayment(cardNumber);
    }

    @And("user input expiration date {string} in checkout payment page")
    public void userInputExpirationDateInCheckoutPaymentPage(String expirationDate) {
        paymentPage.inputExpirationDate(expirationDate);
    }

    @And("user input security code {string} in checkout payment page")
    public void userInputSecurityCodeInCheckoutPaymentPage(String securityCode) {
        paymentPage.inputSecurityCodePayment(securityCode);
    }

    @And("user click review order")
    public void userClickReviewOrder() {
        paymentPage.clickReviewOrderButton();

    }


}
