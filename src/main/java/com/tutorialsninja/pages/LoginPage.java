package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    public void sendEmail(String inputEmail) {
        Reporter.log("Enter email" + inputEmail + "to  field " + email.toString());
        sendTextToElement(email, inputEmail);

    }

    public void sendPassword(String inputPassword) {
        Reporter.log("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);

    }

    public void clickOnLogin() {
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);

    }
}
