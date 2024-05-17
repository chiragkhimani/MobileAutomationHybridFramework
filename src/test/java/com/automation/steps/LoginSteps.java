package com.automation.steps;

import com.automation.pages.AndroidLoginPage;
import com.automation.pages.IOSLoginPage;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps() {
        String env = System.getProperty("platform");

        if(env.equals("ios")) {
            loginPage = new IOSLoginPage();
        }else{
             loginPage = new AndroidLoginPage();
        }

    }

    @Given("user open application")
    public void user_open_application() {
        loginPage.openApplication();
    }

    @Then("verify user is on login screen")
    public void verify_user_is_on_login_screen() {
        Assert.assertTrue(loginPage.isLoginScreenDisplay());
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username, password);
    }


    @Then("verify locked out user error message is displayed")
    public void verifyLockedOutUserErrorMessageIsDisplayed(String message) {
        Assert.assertTrue(loginPage.isLockedOutUserErrorMsgDisplayed());
        Assert.assertEquals(message, loginPage.getLockedOutErrorMsg());
    }


}
