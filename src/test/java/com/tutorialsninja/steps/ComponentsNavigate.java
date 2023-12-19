package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComponentsNavigate {
    @When("I Mouse Hover On Components Tab")
    public void iMouseHoverOnComponentsTab() {
        new HomePage().mouseHoverAndClickOnComponents();
    }

    @And("I call select Menu method and pass menu Show All Components")
    public void iCallSelectMenuMethodAndPassMenuShowAllComponents() {
        new HomePage().selectMenu("Components");
    }

    @Then("I Successfully on Components Page")
    public void iSuccessfullyOnComponentsPage() {
        String expectedComponents = "Components";
        String actualComponents = new ComponentsPage().getComponentsText();
        Assert.assertEquals(actualComponents,expectedComponents);
    }
}
