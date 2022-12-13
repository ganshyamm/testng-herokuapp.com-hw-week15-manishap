package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends UtilityClass {

    @CacheLookup
    @FindBy(id = "username")
    WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"content\"]/div/h2")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your username is invalid!')]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "/div[contains(text(),'Your password is invalid!')]")
    WebElement errorMessage1;


    public void userName(String username1) {
        Reporter.log("Enter username" + userName);
        sendTextToElement(userName, username1);
    }

    public void Password(String password1) {
        Reporter.log("Enter password" + password);
        sendTextToElement(password, password1);
    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on login link " + loginButton);
        clickOnElement(loginButton);
    }
    public String verifyTextMessage() {
        Reporter.log("verify text message");
        return getTextFromElement(verifyText);
    }
    public String verifyErrorMessage() {
        Reporter.log("verify error message");
        return getTextFromElement(errorMessage);
    }

    public String verifyErrorMessage1() {
        Reporter.log("verify error message1");
        return getTextFromElement(errorMessage1);
    }

}
