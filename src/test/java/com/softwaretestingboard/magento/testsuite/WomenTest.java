package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.WomenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    WomenTestPage womenTestPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        womenTestPage = new WomenTestPage();
    }


    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        womenTestPage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        womenTestPage.mouseHoverOnTops();

        //Click on Jackets
        womenTestPage.clickOnJackets();

        //Select Sort By filter “Product Name”
        womenTestPage.selectSortByFilter(1);

        //Verify the products name display in alphabetical order
        ArrayList<String> expectedList = womenTestPage.returnActualProductNameArrayList();
        Collections.sort(expectedList);
        Assert.assertEquals(womenTestPage.returnActualProductNameArrayList(), expectedList, "Error message: Products are not displayed in alphabetical order");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        womenTestPage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        womenTestPage.mouseHoverOnTops();

        //Click on Jackets
        womenTestPage.clickOnJackets();

        //Select Sort By filter “Price”
        womenTestPage.selectSortByFilter(2);

        //Verify the products price display in Low to High
        ArrayList<String> returnedActualList = womenTestPage.returnActualPriceArrayList();
        ArrayList<String> actualList = new ArrayList<>();
        for (String str : returnedActualList) {
            String s = str;
            s = s.replaceAll("\\$", "");
            actualList.add(s);
        }

        ArrayList<String> returnedExpectedList = womenTestPage.returnActualPriceArrayList();
        ArrayList<String> expectedList = new ArrayList<>();
        for (String str : returnedExpectedList) {
            String s = str;
            s = s.replaceAll("\\$", "");
            expectedList.add(s);
        }

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message:products price is not display in Low to High");
    }
}


