package com.tutorialsninja.steps;


import com.tutorialsninja.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new OneHomePage().clickOnMyAccountLink();
    }

    @And("^I select \"([^\"]*)\" option from my account options$")
    public void iSelectOptionFromMyAccountOptions(String option){
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Returning Customer", new OneLoginPage().getReturningCustomerTextFromLoginPage());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new OneLoginPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new OneLoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new OneLoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("My Account",new OneLoginPage().getMyAccountText());
    }

    @Then("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() {
        Assert.assertEquals("Account Logout",new OneLogoutPage().getAccountLogoutText());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new OneLogoutPage().clickOnContinueButton();
    }
}
