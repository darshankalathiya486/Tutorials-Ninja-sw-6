package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductAlphaBaltic {

    @And("I click on sort By Position Tab")
    public void iClickOnSortByPositionTab() {
        new DesktopPage().clickOnSortByPosition();
    }
    
    @And("I select Sort By position Name : Z to A")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().selectSortByZToA("Name (Z - A)");

    }

    @Then("I will see the Product arrange in Descending order")
    public void iWillSeeTheProductArrangeInDescendingOrder() {
        String expectedResult = String.valueOf(new DesktopPage().afterSorting());
        String actualResult = String.valueOf(new DesktopPage().beforeSorting());
        Assert.assertEquals(actualResult,expectedResult);


    }


}

