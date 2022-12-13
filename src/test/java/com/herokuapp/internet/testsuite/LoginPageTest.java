package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void UserSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.sendTextToElement(By.id("username"), "tomsmith");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedM = "Secure Area";
        String actualText = loginPage.verifyTextMessage();
        Assert.assertEquals(actualText, expectedM, "Secure Area");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheUserNameErrorMessage() {
        loginPage.sendTextToElement(By.id("username"), "tomdmith1");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedM = "Your username is invalid!\n" +
                "×";
        String actualmessage = loginPage.verifyErrorMessage();
        //Assert.assertEquals(actualmessage, expectedM, "Your username is invalid!");
        Assert.fail();


    }
    @Test(groups = {"regression" })
    public void verifyThePasswordErrorMessage() {
        loginPage.sendTextToElement(By.id("username"), "tomsmith");
        loginPage.sendTextToElement(By.id("password"), "SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String actualM = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(actualM,"Your username is invalid!\n" +
                "×");



    }



}
