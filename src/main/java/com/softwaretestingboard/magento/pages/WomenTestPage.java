package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class WomenTestPage extends Utility {

    @CacheLookup
    @FindBy(css = "#ui-id-4")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-9")
    WebElement topsMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-11")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement dropDownList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']")
    WebElement priceElements;

    public void mouseHoverOnWomenMenu() {
        Reporter.log("mouseHoverOnWomenMenu" );
        CustomListeners.test.log(Status.PASS, "mouseHoverOnWomenMenu");
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        Reporter.log("mouseHoverOnTops" );
        CustomListeners.test.log(Status.PASS, "mouseHoverOnTops");
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        Reporter.log("clickOnJackets" );
        CustomListeners.test.log(Status.PASS, "clickOnJackets");
        clickOnElement(jackets);
    }

    public void selectSortByFilter(int index) {
        Reporter.log("Get selection by sorting filter" );
        CustomListeners.test.log(Status.PASS, "Get selection by sorting filter");
        selectByIndexFromDropDown(dropDownList, index);
    }

    public  ArrayList<String>  returnActualProductNameArrayList() {
        List<WebElement> listOfElements = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
        Reporter.log("Get the product name verification" );
        CustomListeners.test.log(Status.PASS, "Get the product name verification");
        return actualList;

    }

    public   ArrayList<String> returnActualPriceArrayList() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
        Reporter.log("Get the product price verification" );
        CustomListeners.test.log(Status.PASS, "Get the product price verification");
        return actualList;

    }






}
