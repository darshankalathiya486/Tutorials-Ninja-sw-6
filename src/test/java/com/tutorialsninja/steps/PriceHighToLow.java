package com.tutorialsninja.steps;

import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PriceHighToLow {
    @And("I selects Sort By Price High > Low")
    public void iSelectsSortByPriceHighLow() {
        new LaptopAndNoteBookPage().selectPriceHighToLow("Price (High > Low)");
    }

    @Then("I verifies the Product prices are arranged in High to Low order")
    public void iVerifiesTheProductPricesAreArrangedInHighToLowOrder() {
        String expectedResult = String.valueOf(new LaptopAndNoteBookPage().afterSorting());
        String actualResult = String.valueOf(new LaptopAndNoteBookPage().beforeSorting());
        Assert.assertEquals(actualResult,expectedResult);

    }

}
