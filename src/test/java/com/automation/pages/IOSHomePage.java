package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IOSHomePage extends BasePage implements HomePage{

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PRODUCTS']")
    WebElement pageTitle;

    @FindBy(id="test-Menu")
    WebElement burgerMenu;

    @FindBy(id = "test-LOGOUT")
    WebElement logoutLink;

    public boolean isHomeScreenDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void clickOnHomeBurgerMenu() {
        int height = burgerMenu.getSize().getHeight();
        int width = burgerMenu.getSize().getWidth();

        int xDistance = burgerMenu.getLocation().getX();
        int yDistance = burgerMenu.getLocation().getY();

        int targetX = (int) (xDistance + width * 0.9);
        int targetY = (int) (yDistance + height * 0.9);

        tap(targetX, targetY);
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }
}
