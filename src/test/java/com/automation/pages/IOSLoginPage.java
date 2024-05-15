package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.support.FindBy;

public class IOSLoginPage extends BasePage implements LoginPage {

    @FindBy(id = "test-Username")
    WebElement usernameInput;

    @FindBy(id = "test-Password")
    WebElement passwordInput;

    @FindBy(id = "test-LOGIN")
    WebElement loginBtn;

    @FindBy(id = "test-Error message")
    WebElement lockedOutErrorMsg;

    public void openApplication() {
        // Intentionally blank for future use
    }

    public boolean isLoginScreenDisplay() {
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public boolean isLockedOutUserErrorMsgDisplayed() {
        return lockedOutErrorMsg.isDisplayed();
    }

    public String getLockedOutErrorMsg() {
        return lockedOutErrorMsg.getText();
    }

}
