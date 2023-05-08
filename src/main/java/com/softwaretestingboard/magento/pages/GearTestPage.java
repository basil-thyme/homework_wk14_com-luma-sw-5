package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearTestPage extends Utility {

    @CacheLookup
    @FindBy(css = "#ui-id-6")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-25")
    WebElement bags;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Overnight Duffle']")
    WebElement overNightDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement VerifyProductNameText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement enterQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextAddToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement VerifyOverNightDuffleText;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement actualQtyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPriceText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement qtyInShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedPriceElementText;


    public void mouseHoverOnGearMenu() {
        Reporter.log("MouseHover on gearMenu ");
        CustomListeners.test.log(Status.PASS, "MouseHover on gearMenu");
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        Reporter.log("Click on Bags ");
        CustomListeners.test.log(Status.PASS, "Click on Bags");
        clickOnElement(bags);
    }

    public void clickOnProductName() {
        Reporter.log("Click on Product Name ‘Overnight Duffle’ ");
        CustomListeners.test.log(Status.PASS, "Click on Product Name ‘Overnight Duffle’");
        clickOnElement(overNightDuffle);
    }

    public String getTextFromProductName() {
        Reporter.log("Get text from the Product Name ‘Overnight Duffle’ ");
        CustomListeners.test.log(Status.PASS, "Get text from the Product Name ‘Overnight Duffle’");
        return getTextFromElement(VerifyProductNameText);
    }

    public void changeQuantity(String qty) {
        Reporter.log("Change Qty 3 ");
        CustomListeners.test.log(Status.PASS, "Change Qty 3");
        sendTextToElement(enterQuantity, qty);
    }

    public void clearAnElement() {
        Reporter.log("Clear an element ");
        CustomListeners.test.log(Status.PASS, "Clear an element");
        clearValue(enterQuantity);
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on ‘Add to Cart’ Button. ");
        CustomListeners.test.log(Status.PASS, "Click on ‘Add to Cart’ Button.");
        clickOnElement(addToCart);

    }

    public String getTextFromAfterAddToCart() {
        Reporter.log("Get text from the ‘You added Overnight Duffle to your shopping cart.’ ");
        CustomListeners.test.log(Status.PASS, "Get text from the ‘You added Overnight Duffle to your shopping cart.’ ");
        return getTextFromElement(verifyTextAddToCartText);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on ‘shopping cart’");
        CustomListeners.test.log(Status.PASS, "Click on ‘shopping cart’");
        clickOnElement(shoppingCart);
    }

    public String getTextFromOverNightDuffleBag() {
        Reporter.log("Get text from the product name ‘Overnight Duffle’ ");
        CustomListeners.test.log(Status.PASS, "Get text from the product name ‘Overnight Duffle’");
        return getTextFromElement(VerifyOverNightDuffleText);
    }

    public String getTextFromTheEnteredQuantity() {
        Reporter.log("Get text from the Qty '3' ");
        CustomListeners.test.log(Status.PASS, "Get text from the Qty '3' ");
        return getAnAttributesFromTheElement(actualQtyText);
    }

    public String getTextFromProductPrice() {
        Reporter.log("Get text from the product price ‘$135.00’ ");
        CustomListeners.test.log(Status.PASS, "Get text from the product price ‘$135.00’ ");
        return getTextFromElement(productPriceText);
    }

    public void updateShoppingCart() {
        Reporter.log("update the ShoppingCart ");
        CustomListeners.test.log(Status.PASS, "update the ShoppingCart ");
        clickOnElement(updateShoppingCart);
    }

    public void updateTheQuantity(String qty) {
        Reporter.log("update the Quantity to '5' ");
        CustomListeners.test.log(Status.PASS, "update the Quantity to '5' ");
        sendTextToElement(qtyInShoppingCart, qty);
    }

    public void clearAnElementFromUpdatedShoppingCart() {
        Reporter.log("clearAnElementFromUpdatedShoppingCart");
        CustomListeners.test.log(Status.PASS, "clearAnElementFromUpdatedShoppingCart");
        clearValue(qtyInShoppingCart);
    }

    public String getTextFromUpdatedProductPrice() {
        Reporter.log("Get text from the product price '$225.00’  ");
        CustomListeners.test.log(Status.PASS, "Get text from the product price '$225.00’ ");
        return getTextFromElement(updatedPriceElementText);
    }

}
