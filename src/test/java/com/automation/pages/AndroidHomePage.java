package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidHomePage extends BasePage implements HomePage{

    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    WebElement pageTitle;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-Menu']")
    WebElement burgerMenu;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    WebElement logoutLink;

    public boolean isHomeScreenDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void clickOnHomeBurgerMenu() {
       burgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }
}
