package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.MenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    MenTestPage menTestPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        menTestPage = new MenTestPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //Mouse Hover on Men Menu
        menTestPage.mouseHoverOnMenMenu();

        //Mouse Hover on Bottoms
        menTestPage.mouseHoverOnBottomMenu();

        //Click on Pants
        menTestPage.clickOnPants();

        //Mouse Hover on product name Cronus Yoga Pant’ and click on size 32.
        menTestPage.mouseHoverAndClickOnProductSize();

        //Mouse Hover on product name @Cronus Yoga Pant’ and click on colour Black.
        menTestPage.mouseHoverAndClickOnProductColour();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menTestPage.clickOnAddToCartButton();

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menTestPage.getTextForVerification(), "You added Cronus Yoga Pant to your shopping cart.", "Error message:texts are not matching");

        //Click on ‘shopping cart’ Link into message
        menTestPage.clickOnShoppingCart();

        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menTestPage.getTextFromShoppingCart(), "Shopping Cart", "Error message: ShoppingCart text is not matching");

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menTestPage.getTextFromProductName(), "Cronus Yoga Pant", "Error message: productName text is not matching");

        // Verify the product size ‘32’
        Assert.assertEquals(menTestPage.getTextFromProductSize(), "32", "Error message: productSize text is not matching");

        //Verify the product colour ‘Black’
        Assert.assertEquals(menTestPage.getTextFromProductColour(), "Black", "Error message: productColour text is not matching");

    }


}
