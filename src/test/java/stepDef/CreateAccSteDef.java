package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CreateAccountObject;

import static base.Config.driver;

public class CreateAccSteDef {
    CreateAccountObject ca = new CreateAccountObject(driver);


    @Given("I am in the Target Homepage")
    public void iAmInTheTargetHomepage() {
        ca.homepage();

    }

    @And("I Click in the sign in button")
    public void iClickInTheSignInButton() {
    }

    @And("I Click in the Create Account button")
    public void iClickInTheCreateAccountButton() {
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
    }

    @And("I enter First name")
    public void iEnterFirstName() {
    }

    @And("I enter Last name")
    public void iEnterLastName() {
    }

    @And("I enter Mobile phone number")
    public void iEnterMobilePhoneNumber() {
    }

    @And("I enter the password")
    public void iEnterThePassword() {
    }

    @When("I click on create account button")
    public void iClickOnCreateAccountButton() {
    }

    @Then("I should be able to create account successfully")
    public void iShouldBeAbleToCreateAccountSuccessfully() {
    }
}
