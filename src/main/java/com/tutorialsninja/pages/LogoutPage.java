package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LogoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogoutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logoutText;

    public String getTextFromLogout() {
        Reporter.log("Getting logout text " + logoutText.toString());

        return getTextFromElement(logoutText);
    }
}
