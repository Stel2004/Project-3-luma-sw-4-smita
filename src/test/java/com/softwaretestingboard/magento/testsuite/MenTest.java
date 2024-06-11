package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *  1. userShouldAddProductSuccessFullyTo
 *  ShoppinCart()
 *  * Mouse Hover on Men Menu
 *  * Mouse Hover on Bottoms
 *  * Click on Pants
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on size
 *  32.
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on colour
 *  Black.
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on
 *  ‘Add To Cart’ Button.
 *  * Verify the text
 *  ‘You added Cronus Yoga Pant to your shopping cart.’
 *  * Click on ‘shopping cart’ Link into
 *  message
 *  * Verify the text ‘ShoppingCart.’
 *  * Verify the product name ‘CronusYogaPant’
 *  * Verify the product size ‘32’
 *  * Verify the product colour ‘Black’
 */
public class MenTest extends TestBase {
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        Thread.sleep(2000);
        menPage.mouseOverToMenAndClickOnPant();
        menPage.mouseoverToProductAndClickOnSize();
        menPage.clickOnBlack();
        menPage.mouseOverAndAddToCartButton();
        Thread.sleep(1000);
        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.verifyText(menPage.addToCartText);
        Assert.assertEquals(actualText,expectedText,"Text not matched");
        // Click on ‘shopping cart’ Link into message
        clickOnElement(menPage.shoppingCartLink);
        // Verify the text ‘Shopping Cart.
        expectedText = "Shopping Cart";
        actualText = menPage.verifyText(menPage.shoppingCartText);
        Assert.assertEquals(actualText,expectedText,"Shopping cart Text not match");
        // Verify the product name ‘Cronus Yoga Pant’
        expectedText = "Cronus Yoga Pant";
        actualText = menPage.verifyText(menPage.pantText);
        Assert.assertEquals(actualText,expectedText,"Pant text not match");
        // Verify the product size ‘32’
        expectedText = "32";
        actualText = menPage.verifyText(menPage.pantSize);
        Assert.assertEquals(actualText,expectedText,"Pant size not match");
        // Verify the product colour ‘Black’
        expectedText = "Black";
        actualText = menPage.verifyText(menPage.pantColor);
        Assert.assertEquals(actualText,expectedText,"Pant color not match");

    }

}
