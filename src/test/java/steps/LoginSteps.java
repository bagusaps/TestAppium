package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps(){
        loginPage = new LoginPage();
    }

    @Then("user in login page")
    public void userInLoginPage() {
        assert loginPage.getLoginPageTitle().equals("Login");
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsernameLogin(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPasswordLogin(password);
    }

    @And("user click login")
    public void userClickLogin() {
        loginPage.clickLoginButton();
    }



}
