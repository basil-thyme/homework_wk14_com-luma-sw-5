package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class MenTestPage extends Utility {
    @CacheLookup
    @FindBy(css = "#ui-id-5")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-23")
    WebElement pants;

    @CacheLookup
    @FindBy(css = "img[alt='Cronus Yoga Pant ']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size32;

    @CacheLookup
    @FindBy(css = "#option-label-color-93-item-49")
    WebElement colourBlack;

    @CacheLookup
    @FindBy(xpath = "//div[@class='actions-primary']//span[text()='Add to Cart'][1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']" )
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base' and text()='Shopping Cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSizeText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColorText;

    public void mouseHoverOnMenMenu() {
        Reporter.log("MouseHover on menMenu ");
        CustomListeners.test.log(Status.PASS, "MouseHover on menMenu");
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomMenu() {
        Reporter.log("MouseHover on bottomMenu " );
        CustomListeners.test.log(Status.PASS, "MouseHover on bottomMenu ");
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPants() {
        Reporter.log("Clicking on Pants" );
        CustomListeners.test.log(Status.PASS, "Clicking on Pants");
        clickOnElement(pants);
    }


    public void mouseHoverAndClickOnProductSize() {
        Reporter.log("MouseHover and click on cronusYogaPant " );
        CustomListeners.test.log(Status.PASS, "MouseHover and click on cronusYogaPant  ");
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverAndClickOnProductColour() {
        Reporter.log("MouseHover and click on colourBlack " );
        CustomListeners.test.log(Status.PASS, "MouseHover and click on colourBlack  ");
        mouseHoverToElementAndClick(colourBlack);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Clicking on addToCart" );
        CustomListeners.test.log(Status.PASS, "Clicking on addToCar");
        clickOnElement(addToCart);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Clicking on shoppingCartLink" );
        CustomListeners.test.log(Status.PASS, "Clicking on shoppingCartLink");
        clickOnElement(shoppingCartLink);
    }
    public String getTextForVerification() {
        Reporter.log("Get text from the ‘You added Cronus Yoga Pant to your shopping cart.’ ");
        CustomListeners.test.log(Status.PASS, "Get text from the ‘You added Cronus Yoga Pant to your shopping cart.’");
        return getTextFromElement(verifyText);
    }

    public String getTextFromShoppingCart() {
        Reporter.log("Get text from shoppingCart ‘Shopping Cart.’");
        CustomListeners.test.log(Status.PASS, "Get text from shoppingCart ‘Shopping Cart.’");
        return getTextFromElement(shoppingCartText);
    }

    public String getTextFromProductName() {
        Reporter.log("Get text from productName ‘Cronus Yoga Pant’");
        CustomListeners.test.log(Status.PASS, "Get text from productName ‘Cronus Yoga Pant’");
        return getTextFromElement(productNameText);

    }

    public String getTextFromProductSize() {
        Reporter.log("Get text from productSize ‘32’");
        CustomListeners.test.log(Status.PASS, "Get text from productSize ‘32’");
        return getTextFromElement(productSizeText);
    }

    public String getTextFromProductColour() {
        Reporter.log("Get text from productColour ‘Black’ ");
        CustomListeners.test.log(Status.PASS, "Get text from productColour ‘Black’ ");
        return getTextFromElement(productColorText);

    }
}





