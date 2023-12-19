package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MacBookPage extends Utility {

    private static final Logger log = LogManager.getLogger(MacBookPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macBookText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;

    public String getTextFromMacBook() {
        Reporter.log("Getting macbook text " + macBookText.toString());

        return getTextFromElement(macBookText);
    }

    public void clickOnAddToCart() {
        Reporter.log("Clicking on add to cart Button " + addToCart.toString());
        clickOnElement(addToCart);

    }

    public Boolean isSuccessMessageAppearing() {
        Reporter.log("Verifying if success message contains " + "Success: You have added MacBook to your shopping cart!");

        return getTextFromElement(successMessage).contains("Success: You have added MacBook to your shopping cart!");
    }

    public void clickOnShoppingCart() {
        Reporter.log("Clicking on shopping cart " + shoppingCart.toString());
        clickOnElement(shoppingCart);

    }
}
