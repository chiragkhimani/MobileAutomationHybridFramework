package com.automation.pages;

public interface LoginPage {
    void openApplication();

    boolean isLoginScreenDisplay();

    void doLogin(String username, String password);

    boolean isLockedOutUserErrorMsgDisplayed();

    String getLockedOutErrorMsg();

}
