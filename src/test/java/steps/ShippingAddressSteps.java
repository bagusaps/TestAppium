package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShippingAddressPage;

public class ShippingAddressSteps {

    ShippingAddressPage shippingAddressPage;

    public ShippingAddressSteps(){
        shippingAddressPage = new ShippingAddressPage();
    }

    @Then("user in checkout shipping address page")
    public void userInCheckoutShippingAddressPage() {
        assert shippingAddressPage.getShippingAddressTitle().equals("Enter a shipping address");
    }

    @When("user input full name {string} in checkout shipping address page")
    public void userInputFullNameInCheckoutShippingAddressPage(String fullName) {
        shippingAddressPage.inputFullNameShippingAddress(fullName);
    }

    @And("user input address line one {string} in checkout shipping address page")
    public void userInputAddressLineOneInCheckoutShippingAddressPage(String addressOne) {
        shippingAddressPage.inputAddressLineOneShippingAddress(addressOne);
    }

    @And("user input city {string} in checkout shipping address page")
    public void userInputCityInCheckoutShippingAddressPage(String city) {
        shippingAddressPage.inputCityShippingAddress(city);
    }

    @And("user input zipcode {string} in checkout shipping address page")
    public void userInputZipcodeInCheckoutShippingAddressPage(String zipCode) {
        shippingAddressPage.inputZipCodeShippingAddress(zipCode);
    }

    @And("user input country {string} in checkout shipping address page")
    public void userInputCountryInCheckoutShippingAddressPage(String country) {
        shippingAddressPage.inputCountryShippingAddress(country);
    }

    @And("user click to payment")
    public void userClickToPayment() {
        shippingAddressPage.clickToPaymentButton();

    }


}
