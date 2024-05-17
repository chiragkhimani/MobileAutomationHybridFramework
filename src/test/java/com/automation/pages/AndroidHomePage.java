package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidHomePage extends BasePage implements HomePage{

    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    WebElement pageTitle;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-Menu']")
    WebElement burgerMenu;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    WebElement logoutLink;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-ALL ITEMS']")
    WebElement allItemsLink;

    String XPATH_PRODUCT_NAME = "//android.widget.TextView[@content-desc='test-Item title' and @text='%s']";

    public boolean isHomeScreenDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void clickOnHomeBurgerMenu() {
       burgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public void clickOnProduct(String productName){
        String loc = String.format(XPATH_PRODUCT_NAME, productName);
        driver.findElement(By.xpath(loc)).click();
    }

    public void clickOnAllItemsLink() {
        allItemsLink.click();
    }
}
