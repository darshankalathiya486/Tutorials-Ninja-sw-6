package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenuListField;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopTab;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNoteBooksTab;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccounts;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement loginAccountText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencySelector;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement currencyGBP;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement showAllComponents;





    public void chooseCurrencySelector() {
        clickOnElement(currencySelector);
    }

    public void chooseCurrencyGBP(){
        clickOnElement(currencyGBP);
    }

    public void selectMenu(String menu) {
        if (menu == "Desktops") {
            //Find Desktop tab, hover and click on "Show All Desktops"
            mouseHoverToElement(desktopTab);
            Reporter.log("Clicking on Show all Desktops" + showAllDesktops.toString());
            clickOnElement(showAllDesktops);


        } else if (menu == "Laptops & Notebooks") {
            //Find Laptops & Notebooks tab, hover and click on "Show All Laptops & Notebooks"
            mouseHoverToElement(laptopsAndNoteBooksTab);
            Reporter.log("Clicking on Show all Desktops" + showAllLaptopsAndNotebooks.toString());
            clickOnElement(showAllLaptopsAndNotebooks);


        } else if (menu == "Components") {
            //Find Components tab, hover and click on "Show All Components"
            mouseHoverToElement(componentsTab);
            Reporter.log("Clicking on Show all Desktops" + showAllComponents.toString());
            clickOnElement(showAllComponents);


        } else {
            System.out.println("Please enter valid Top-menu name or check actual Top-menu name");
        }
    }

    public void mouseHoverAndClickOnDesktop() {
        Reporter.log("Hovering and Clicking on desktop " + desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);

    }

    public void mouseHoverAndClickOnLaptopsAndNotebooks() {
        Reporter.log("Hovering and Clicking on laptops and notebooks " + laptopsAndNoteBooksTab.toString());
        mouseHoverToElementAndClick(laptopsAndNoteBooksTab);

    }

    public void mouseHoverAndClickOnComponents() {
        Reporter.log("Hovering and Clicking on components " + componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);

    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountsList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountsList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountsList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccount() {
        Reporter.log("Clicking on my account " + myAccounts.toString());
        clickOnElement(myAccounts);

    }

    public String getRegisterAccountText() {
        Reporter.log("Getting register account text " + registerAccountText.toString());

        return getTextFromElement(registerAccountText);
    }

    public String getLoginAccountText() {
        Reporter.log("Getting login account text " + loginAccountText.toString());

        return getTextFromElement(loginAccountText);
    }
}
