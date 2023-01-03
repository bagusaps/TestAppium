package steps;

import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;

public class CheckoutCompleteSteps {

    CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteSteps(){
        checkoutCompletePage = new CheckoutCompletePage();
    }

    @Then("user in checkout complete page")
    public void userInCheckoutCompletePage() {
        assert checkoutCompletePage.getTitleCheckoutComplete().equals("Checkout Complete");
    }
}
