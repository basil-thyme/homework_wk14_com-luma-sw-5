package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    GearTestPage gearTestPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        gearTestPage = new GearTestPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        //Mouse Hover on Gear Menu
        gearTestPage.mouseHoverOnGearMenu();

        //Click on Bags
        gearTestPage.clickOnBags();

        //Click on Product Name ‘Overnight Duffle’
        gearTestPage.clickOnProductName();

        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearTestPage.getTextFromProductName(), "Overnight Duffle", "Error message: Product name is not matching");

        //Change Qty 3
        gearTestPage.clearAnElement();
        gearTestPage.changeQuantity("3");

        //Click on ‘Add to Cart’ Button.
        gearTestPage.clickOnAddToCart();

        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearTestPage.getTextFromAfterAddToCart(), "You added Overnight Duffle to your shopping cart.", "Error message: message is not matching");

        //Click on ‘shopping cart’ Link into message
        gearTestPage.clickOnShoppingCart();

        //Verify the product name ‘	Overnight Duffle’
        Assert.assertEquals(gearTestPage.getTextFromOverNightDuffleBag(),  "Overnight Duffle", "Error message: message is not matching");

        //Verify the Qty is ‘3’
        Assert.assertEquals(gearTestPage.getTextFromTheEnteredQuantity(), "3", "Error message: Quantity is not matching");

        //Verify the product price ‘$135.00’
        Assert.assertEquals(gearTestPage.getTextFromProductPrice(), "$135.00", "Error message: Price is not matching");

        //Change Qty to ‘5’
        gearTestPage.clearAnElementFromUpdatedShoppingCart();
        gearTestPage.updateTheQuantity("5");

        //Click on ‘Update Shopping Cart’ button
        gearTestPage.updateShoppingCart();

        //Verify the product price ‘$225.00’
        Assert.assertEquals(gearTestPage.getTextFromUpdatedProductPrice(), "$225.00", "Error message: Price is not matching");

    }

}
