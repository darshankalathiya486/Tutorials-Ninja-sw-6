package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopsNavigate {
    @When("I Mouse Hover On Laptops & Notebooks Tab")
    public void iMouseHoverOnLaptopsNotebooksTab() {
        new HomePage().mouseHoverAndClickOnLaptopsAndNotebooks();
    }

    @And("I call select Menu method and pass menu Show All Laptops & Notebooks")
    public void iCallSelectMenuMethodAndPassMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Laptops & Notebooks");
    }

    @Then("I Successfully on Laptops & Notebooks Page")
    public void iSuccessfullyOnLaptopsNotebooksPage() {
        String expectedLaptopsAndNotebooks = "Laptops & Notebooks";
        String actualLaptopsAndNotebooks = new LaptopAndNoteBookPage().getLaptopAndNoteBookText();
        Assert.assertEquals(actualLaptopsAndNotebooks,expectedLaptopsAndNotebooks);
    }
}
