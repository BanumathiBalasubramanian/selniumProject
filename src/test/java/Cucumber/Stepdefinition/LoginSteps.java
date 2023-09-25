package Cucumber.Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");

    }

    @When("User is entering user name and password")
    public void user_is_entering_user_name_and_password() {
        System.out.println("User is entering user name and password");
    }

    @When("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("User click on login button");
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Login should be successful");
    }
}
