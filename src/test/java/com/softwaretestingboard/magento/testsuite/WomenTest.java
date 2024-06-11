package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends TestBase {
    WomenPage womenPage = new WomenPage();
    public void selectMenu(String menuName) {
        // Click on element
        womenPage.clickOnMenu(menuName);
    }
    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu and Mouse Hover on Tops
        String menuName = "Women"; // Example menu item
        selectMenu(menuName);
        //Select Sort By filter “Product Name”
        womenPage.selectOption();
        List<String> actualProductNames = womenPage.verifyProductOrder();
        List<String> expectedProductNames = womenPage.reverseProductOrder(actualProductNames);
        Assert.assertEquals(actualProductNames,expectedProductNames);
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        String menuName = "Women"; // Example menu item
        selectMenu(menuName);
        //Select Sort By filter “Product Name”
        womenPage.selectOptionPrice();
        womenPage.priceDisplay();
    }
}
