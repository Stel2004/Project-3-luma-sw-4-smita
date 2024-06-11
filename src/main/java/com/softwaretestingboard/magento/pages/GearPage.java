package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By gmenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");
    By prod = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By actualText = By.xpath("//span[@class='base']");
    By quamt = By.xpath("//input[@id='qty']");
    int quantity = 3;
    By cart = By.xpath("//button[@id='product-addtocart-button']");
    By newText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shop_cart = By.xpath("//a[normalize-space()='shopping cart']");
    By p_name = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quant_value = By.xpath("//input[@title='Qty']");
    By value_price = By.xpath("(//span[@class='cart-price']//span)[2]");
    By change_quant = By.xpath("(//input[@class='input-text qty'])[1]");
    By update = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By product_price = By.xpath("(//span[@class='cart-price']//span)[2]");

    public void mouseOverToGearAndClickOnBags() {
        mouseHoverToElement(gmenu);
        //mouseHoverToElement(bags);
        mouseHoverToElementAndClick(bags);
    }

    public void clickProduct() {
        mouseHoverToElementAndClick(prod);
    }

    public String getProductText() {
     return getTextFromElement(actualText);
    }
    public void changeTo(){
        clearText(quamt);
        sendTextToElement(quamt, "3");
    }
    public void clickOnCart(){
        clickOnElement(cart);
    }
    public String verifyProduText(){
        return getTextFromElement(newText);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shop_cart);
    }
    public String verufyProductUpdateText(){
        return getTextFromElement(p_name);
    }
    public void verifyValue(){
        clearText(quant_value);
        sendTextToElement(quant_value,"3");
    }
    public String verifyPeoductPrice(){
        return getTextFromElement(value_price);
    }
    public void Changeto5(){
        clearText(change_quant);
        sendTextToElement(change_quant,"5");
    }
    public void updateCart(){
        clickOnElement(update);

    }
    public String verifyProductPriceFinal(){

        return getTextFromElement(product_price);
    }
}