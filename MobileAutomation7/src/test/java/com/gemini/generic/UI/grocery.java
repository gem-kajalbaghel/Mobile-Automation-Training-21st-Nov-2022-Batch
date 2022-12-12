package com.gemini.generic.UI;

import com.gemini.generic.Locators.locators;
import com.gemini.generic.MobileAction;
import net.serenitybdd.core.pages.PageObject;

public class grocery extends PageObject {

    public void login() {
        MobileAction.typeText(locators.Login_name, "ABC", "Enter Username");
        MobileAction.waitSec(1);
        MobileAction.click(locators.Login_countryDropdown, "open country select dropdown");
        MobileAction.waitSec(1);
        MobileAction.click(locators.Login_country_select, "Select Angola");
        MobileAction.waitSec(1);
        MobileAction.click(locators.Login_Male, "Select gender Male");
        MobileAction.click(locators.btn_login, "Click Submit");
        MobileAction.waitSec(3);
    }

    public void Validate_login()
    {
        if(MobileAction.getTitle().equalsIgnoreCase("Products"))
            System.out.println("login Success");
        else
            System.out.println("login Fail");
    }

    public void Open_jordan4_retro() {
        MobileAction.scrollToElement("Air Jordan 4 Retro", true);
    }
    public void Add_item_to_cart(){
        MobileAction.click(locators.Products_addtoCart,"Add airjordan 4 to cart");
        MobileAction.waitSec(2);
        MobileAction.click(locators.btn_cart,"Open Cart");
        MobileAction.waitSec(2);
    }

    public void Validate_itemInCart(){
        if(MobileAction.getElementText(locators.Product_cart).contains("Air"))
            System.out.println("Item successfully added to cart");
        else
            System.out.println("Failed to add to cart");
    }
    public void website(){
        MobileAction.click(locators.website,"Visit website");
    }
}
