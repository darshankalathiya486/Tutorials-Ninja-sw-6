package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class ProductAddToCart {
    @When("I Mouse Hover On Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new HomePage().chooseCurrencySelector();

    }

    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new HomePage().chooseCurrencyGBP();

    }

    @And("I select Sort By position Name : A to Z")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().selectSortByAToZ("Name (A - Z)");
    }

    @And("I selects product {string}")
    public void iSelectsProduct(String product) {
        if (Objects.equals(product, "HTC Touch HD")){
            new DesktopPage().clickOnHTCTouchHD();
        }else if(Objects.equals(product, "iPhone")) {
            new DesktopPage().clickOnIPhone();
        }else if(Objects.equals(product, "iPod Classic")) {
            new DesktopPage().clickOnIPodClassic();
        }else if(Objects.equals(product, "MacBook")) {
            new DesktopPage().clickOnMacBook();
        }else if(Objects.equals(product, "MacBook Air")) {
            new DesktopPage().clickOnMacBookAir();
        }else if(Objects.equals(product, "Sony VAIO")) {
            new DesktopPage().clickOnSonyVAIO();
        }else {
            System.out.println("select wrong Features ");
        }

    }

    @And("I verifies the text {string}")
    public void iVerifiesTheText(String product) {
        if (Objects.equals(product, "HTC Touch HD")){
            Assert.assertEquals(new DesktopPage().getHTCTouchHDText(),"HTC Touch HD");
        }else if(Objects.equals(product, "iPhone")) {
            Assert.assertEquals(new DesktopPage().getIPhoneText(),"iPhone");
        }else if(Objects.equals(product, "iPod Classic")) {
            Assert.assertEquals(new DesktopPage().getIPodClassicText(),"iPod Classic");
        }else if(Objects.equals(product, "MacBook")) {
            Assert.assertEquals(new DesktopPage().getMacBookText(),"MacBook");
        }else if(Objects.equals(product, "MacBook Air")) {
            Assert.assertEquals(new DesktopPage().getMacBookAirText(),"MacBook Air");
        }else if(Objects.equals(product, "Sony VAIO")) {
            Assert.assertEquals(new DesktopPage().getSonyVAIOText(),"Sony VAIO");
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I enters quantity {string} using the Select class")
    public void iEntersQuantityUsingTheSelectClass(String quantity) {
        new ProductPage().clearAndAddQuantity(quantity);
    }

    @And("I clicks on the Add to Cart button")
    public void iClicksOnTheAddToCartButton() {
        new ProductPage().clickAddToCart();
    }

    @Then("I verifies the message {string}")
    public void iVerifiesTheMessage(String product) {
        if (Objects.equals(product, "HTC Touch HD")){
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added HTC Touch HD to your shopping cart!");
        }else if(Objects.equals(product, "iPhone")) {
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added iPhone to your shopping cart!");
        }else if(Objects.equals(product, "iPod Classic")) {
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added iPod Classic to your shopping cart!");
        }else if(Objects.equals(product, "MacBook")) {
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added MacBook to your shopping cart!");
        }else if(Objects.equals(product, "MacBook Air")) {
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added MacBook Air to your shopping cart!");
        }else if(Objects.equals(product, "Sony VAIO")) {
            Assert.assertEquals(new ProductPage().isSuccessMessageAppearing(),"Success: You have added Sony VAIO to your shopping cart!");
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I clicks on the link shopping cart displayed in the success message")
    public void iClicksOnTheLinkShoppingCartDisplayedInTheSuccessMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @And("I verifies the text Shopping Cart")
    public void iVerifiesTheTextShoppingCart() {
        String expectedText = "Shopping Cart";
        String actualText = new ShoppingCartPage().isShoppingCartAppearing().substring(0,13);
        Assert.assertEquals(actualText,expectedText);

    }

    @And("I verifies the product name {string}")
    public void iVerifiesTheProductName(String product) {
            if (Objects.equals(product, "HTC Touch HD")){
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"HTC Touch HD");
            }else if(Objects.equals(product, "iPhone")) {
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"iPhone");
            }else if(Objects.equals(product, "iPod Classic")) {
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"iPod Classic");
            }else if(Objects.equals(product, "MacBook")) {
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"MacBook");
            }else if(Objects.equals(product, "MacBook Air")) {
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"MacBook Air");
            }else if(Objects.equals(product, "Sony VAIO")) {
                Assert.assertEquals(new ShoppingCartPage().getProductName(),"Sony VAIO");
            }else {
                System.out.println("select wrong Features ");
            }
    }

    @And("I verifies the model {string}")
    public void iVerifiesTheModel(String model) {
        if (Objects.equals(model, "Product 1")){
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"Product 1");
        }else if(Objects.equals(model, "product 11 ")) {
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"product 11");
        }else if(Objects.equals(model, "product 20")) {
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"product 20");
        }else if(Objects.equals(model, "Product 16")) {
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"Product 16");
        }else if(Objects.equals(model, "Product 17")) {
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"Product 17");
        }else if(Objects.equals(model, "Product 19")) {
            Assert.assertEquals(new ShoppingCartPage().getModelText(),"Product 19");
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I verifies the total {string}")
    public void iVerifiesTheTotal(String price) {
        if (Objects.equals(price, "£74.73")){
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£74.73");
        }else if(Objects.equals(price, "£75.46")) {
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£75.46");
        }else if(Objects.equals(price, "£74.73")) {
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£74.73");
        }else if(Objects.equals(price, "£368.73")) {
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£368.73");
        }else if(Objects.equals(price, "£736.23")) {
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£736.23");
        }else if(Objects.equals(price, "£736.23")) {
            Assert.assertEquals(new ShoppingCartPage().getTotalText(),"£736.23");
        }else {
            System.out.println("select wrong Features ");
        }

    }



}


