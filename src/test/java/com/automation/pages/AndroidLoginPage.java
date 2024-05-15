package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidLoginPage extends BasePage implements LoginPage{

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    WebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    WebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
    WebElement loginBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Error message']")
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
