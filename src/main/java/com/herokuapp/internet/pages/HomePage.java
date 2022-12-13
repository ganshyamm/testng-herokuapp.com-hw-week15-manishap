package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends UtilityClass {
    @FindBy(linkText = "Log in")
    WebElement loginLink;


    @FindBy(linkText = "Register")
    WebElement registerLink;

    // By loginLink = By.linkText("Log in");
    // By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}
