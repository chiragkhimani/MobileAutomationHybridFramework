package com.automation.steps;

import com.automation.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDetailsSteps {

    ProductDetailsPage productDetailsPage;
    public ProductDetailsSteps(){
        String env = System.getProperty("platform");

        if(env.equals("ios")) {
            productDetailsPage = new IOSProductDetailsPage();
        }else{
            productDetailsPage = new AndroidProductDetailsPage();
        }
    }
    @Then("verify product details page is displayed")
    public void verifyProductDetailsPageIsDisplayed() {
        Assert.assertTrue(productDetailsPage.isPDPPageDisplayed());
    }

    @When("user click on add to cart button")
    public void userClickOnAddToCartButton() {
        productDetailsPage.clickOnAddToCart();
    }

    @Then("verify cart icon display the quantity count {string}")
    public void verifyCartIconDisplayTheQuantityCount(String quantity) {
        Assert.assertEquals(quantity, productDetailsPage.getCartQuantity());
    }

}
