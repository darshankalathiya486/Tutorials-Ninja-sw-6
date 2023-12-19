package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsPath;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement dropDownPath;

    String sortAToZ = "Name (A - Z)";
    String sortZToA = "Name (Z - A)";
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='HTC Touch HD']")
    WebElement productHTCTouchHD;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='iPhone']")
    WebElement productIPhone;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='iPod Classic']")
    WebElement productIPodClassic;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement productMacBook;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook Air']")
    WebElement productMacBookAir;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sony VAIO']")
    WebElement productSonyVAIO;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HTC Touch HD']") //h1[normalize-space()='HTC Touch HD']
    WebElement productHTCTouchHDText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='iPhone']")
    WebElement productIPhoneText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='iPod Classic']")
    WebElement productIPodClassicText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement productMacBookText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook Air']")
    WebElement productMacBookAirText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Sony VAIO']")
    WebElement productSonyVAIOText;



    public String getDesktopText() {
        Reporter.log("Getting desktop text " + desktopText.toString());

        return getTextFromElement(desktopText);
    }

    public void clickOnSortByPosition() {
        Reporter.log("Clicking on sort by button " + dropDownPath.toString());
        clickOnElement(dropDownPath);

    }

    public void selectSortByAToZ(String text) {
        Reporter.log("select A to Z" + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);

    }

    public void selectSortByZToA(String text) {
        Reporter.log("select" + sortZToA + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);

    }

    public void clickOnHTCTouchHD() {
        clickOnElement(productHTCTouchHD);
    }

    public void clickOnIPhone() {
        clickOnElement(productIPhone);
    }

    public void clickOnIPodClassic() {
        clickOnElement(productIPodClassic);
    }

    public void clickOnMacBook() {
        clickOnElement(productMacBook);
    }

    public void clickOnMacBookAir() {
        clickOnElement(productMacBookAir);
    }

    public void clickOnSonyVAIO() {
        clickOnElement(productSonyVAIO);
    }

    public String getHTCTouchHDText() {
        return getTextFromElement(productHTCTouchHDText);
    }

    public String getIPhoneText() {
        return getTextFromElement(productIPhoneText);
    }

    public String getIPodClassicText() {
        return getTextFromElement(productIPodClassicText);
    }

    public String getMacBookText() {
        return getTextFromElement(productMacBookText);
    }

    public String getMacBookAirText() {
        return getTextFromElement(productMacBookAirText);
    }

    public String getSonyVAIOText() {
        return getTextFromElement(productSonyVAIOText);
    }

    public ArrayList<String> expectedList() {
        // Get all the products name and stored into array list
        List<WebElement> products = productsPath;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        return originalProductsName;
    }

    public ArrayList beforeSorting() {
        List<WebElement> product = productsPath;
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement list : product) {
            originalList.add(list.getText());
        }
        return originalList;
    }

    public ArrayList afterSorting() {
        Collections.reverse(beforeSorting());
        System.out.println(beforeSorting());
        List<WebElement> products = productsPath;
        ArrayList<String> afterSortingList = new ArrayList<>();
        for (WebElement newSortList : products) {
            afterSortingList.add(newSortList.getText());
        }
        return afterSortingList;
    }


}
