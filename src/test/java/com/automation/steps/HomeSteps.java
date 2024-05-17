package com.automation.steps;

import com.automation.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage;

    public HomeSteps(){
        String env = System.getProperty("platform");

        if(env.equals("ios")) {
            homePage = new IOSHomePage();
        }else{
            homePage = new AndroidHomePage();
        }
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed());
    }

    @When("user click on home burger menu")
    public void userClickOnHomeBurgerMenu() {
        homePage.clickOnHomeBurgerMenu();
    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
        homePage.clickOnLogoutLink();
    }

    @When("user click on the product {string}")
    public void userClickOnTheProduct(String productName) {
        homePage.clickOnProduct(productName);
    }

    @And("click on the ALL ITEMS menu")
    public void clickOnTheALLITEMSMenu() {
        homePage.clickOnAllItemsLink();
    }
}
