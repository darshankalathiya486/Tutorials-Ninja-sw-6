package com.tutorialsninja.steps;

import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.pages.MacBookPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.tutorialsninja.utility.Utility.getRandomAlphaNumericString;

public class LapAndNoteOrderSuccessfully {
    @And("I selects Product MacBook")
    public void iSelectsProductMacBook() {
        new LaptopAndNoteBookPage().clickOnMacbook();
    }

    @And("I verifies the text MacBook")
    public void iVerifiesTheTextMacBook() {
        Assert.assertEquals(new MacBookPage().getTextFromMacBook(), "MacBook", "MacBook Product not display");
    }

    @And("I clicks on the Add To Cart button")
    public void iClicksOnTheAddToCartButton() {
        new MacBookPage().clickOnAddToCart();
    }

    @Then("I verifies the message Success: You have added MacBook to your shopping cart!")
    public void iVerifiesTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertTrue(new MacBookPage().isSuccessMessageAppearing(), "Message Doesn't Appear");
    }

    @And("I verifies the product name MacBook")
    public void iVerifiesTheProductNameMacBook() {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), "MacBook", "Product Name Doesn't appear");
    }

    @And("I changes the quantity")
    public void iChangesTheQuantity() {
        new ShoppingCartPage().clearAndAddQuantity("2");
    }

    @And("I clicks on the Update button")
    public void iClicksOnTheUpdateButton() {
        new ShoppingCartPage().clickOnUpdate();
    }

    @Then("I verifies the message Success: You have modified your shopping cart!")
    public void iVerifiesTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertTrue(new ShoppingCartPage().isSuccessMessageAppearing("Success: You have modified your shopping cart!"), "Cart not modified");
    }

    @And("I verifies the total")
    public void iVerifiesTheTotal() {
        Assert.assertEquals(new ShoppingCartPage().getTotalText(), "£737.45", "Total not matched");
    }

    @And("I clicks on the Checkout button")
    public void iClicksOnTheCheckoutButton() {
        new ShoppingCartPage().clickOnCheckout();
    }

    @And("I verifies the text Checkout")
    public void iVerifiesTheTextCheckout() {
        Assert.assertEquals(new CheckOutPage().getCheckoutText(), "Checkout", "Checkout not displayed");
    }

    @And("I verifies the text New Customer")
    public void iVerifiesTheTextNewCustomer() {
        Assert.assertEquals(new CheckOutPage().getNewCustomerText(), "New Customer", "New Customer not displayed");
    }

    @And("I clicks on the Guest Checkout radio button")
    public void iClicksOnTheGuestCheckoutRadioButton() {
        new CheckOutPage().clickOnGuestCheckoutRadioButton();
    }

    @And("I clicks on the Continue button")
    public void iClicksOnTheContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("I fills the mandatory fields")
    public void iFillsTheMandatoryFields() {
        new CheckOutPage().enterBillingDetailsFirstName("Meet");
        new CheckOutPage().enterBillingDetailsLastName("patel");
        new CheckOutPage().enterBillingDetailsEmail("Patel" + getRandomAlphaNumericString(4) + "@gmail.com");
        new CheckOutPage().enterBillingDetailsTelephone("07654321234");
        new CheckOutPage().enterBillingDetailsAddress("11 harrow Road");
        new CheckOutPage().enterBillingDetailsCity("Harrow");
        new CheckOutPage().enterBillingDetailsPostcode("HA91Sf");
        new CheckOutPage().enterBillingDetailsCountry("United Kingdom");
    }

    @And("I click on the Continue Button")
    public void iClickOnTheContinueButton() {
        new CheckOutPage().clickOnContinueBillingButton();
    }

    @And("I adds comments about the order into the text area")
    public void iAddsCommentsAboutTheOrderIntoTheTextArea() {
        new CheckOutPage().enterComment("Nothing Specific.");
    }

    @And("I checks the Terms & Conditions checkbox")
    public void iChecksTheTermsConditionsCheckbox() {
        new CheckOutPage().clickOnAgreeToTermsAndConditions();
    }

    @Then("I verifies the message Warning: Payment method required!")
    public void iVerifiesTheMessageWarningPaymentMethodRequired() {
        Assert.assertTrue(new CheckOutPage().isPaymentWarningAppearing(), "Payment Warning not displayed");
    }

}
