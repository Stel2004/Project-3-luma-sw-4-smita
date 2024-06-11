package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


/***
 *  Write down the following test into WomenTestclass
 *  1. verifyTheSortByProductNameFilter
 *  * Mouse Hover on Women Menu
 *  * Mouse Hover on Tops
 *  * Click on Jackets
 *  * Select Sort By filter “Product Name”
 *  * Verify the products name display in
 *  alphabetical order
 *  2. verifyTheSortByPriceFilter
 *  * Mouse Hover on Women Menu
 *  * Mouse Hover on Tops
 *  * Click on Jackets
 *  * Select Sort By filter “Price”
 *  * Verify the products price display in
 *  Low to High
 */

public class GearTest extends TestBase {


        GearPage gearPage= new GearPage();
    @Test
        public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        // Mouse Hover on Gear Menu
        // Click on Bags
        // Click on Product Name ‘Overnight Duffle’
        gearPage.mouseOverToGearAndClickOnBags();
        gearPage.clickProduct();
        //clickOnElement(By.xpath("//a[normalize-space()='Overnight Duffle']"));
        // Verify the text ‘Overnight Duffle’
        String exp= gearPage.getProductText();
        Assert.assertEquals(exp,"Overnight Duffle");
        // Change Qty 3

        gearPage.changeTo();

        // Click on ‘Add to Cart’ Button.
        gearPage.clickOnCart();
        Thread.sleep(1000);
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals("You added Overnight Duffle to your shopping cart.",
                gearPage.verifyProduText());
        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();

        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals("Overnight Duffle",
                gearPage.verufyProductUpdateText());
        //Verify the Qty is ‘3’
        gearPage.verifyValue();
        //Assert.assertEquals("3",gearPage.verifyPeoductPrice());
        // Verify the product price ‘$135.00’
        Assert.assertEquals("$135.00",
                gearPage.verifyPeoductPrice());
        Thread.sleep(1000);
        // Change Qty to ‘5’
        gearPage.Changeto5();

        // Click on ‘Update Shopping Cart’ button
        gearPage.updateCart();
        System.out.println("Updated");

        Thread.sleep(1000);
        // Verify the product price ‘$225.00’
        Assert.assertEquals("$225.00", gearPage.verifyProductPriceFinal());
    }
}
