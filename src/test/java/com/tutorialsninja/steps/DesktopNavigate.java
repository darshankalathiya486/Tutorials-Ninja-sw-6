package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopNavigate {
    @Given("I am In Home Page")
    public void iAmInHomePage() {
    }

    @When("I Mouse Hover On Desktop Tab")
    public void iMouseHoverOnDesktopTab() {
        new HomePage().mouseHoverAndClickOnDesktop();
    }

    @And("I call select Menu method and pass menu Show All Desktops")
    public void iCallSelectMenuMethodAndPassMenuShowAllDesktops() {
        new HomePage().selectMenu("Desktops");
    }


    @Then("I Successfully on Desktops Page")
    public void iSuccessfullyOnDesktopsPage() {
        String expectedDesktop = "Desktops";
        String actualDesktop = new DesktopPage().getDesktopText();
        Assert.assertEquals(actualDesktop,expectedDesktop);
    }
}
