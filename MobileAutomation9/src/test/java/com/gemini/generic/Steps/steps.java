package com.gemini.generic.Steps;

import com.gemini.generic.UI.grocery;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class steps extends PageObject {
        grocery gro;
        @Step("Login application")
        public void login()
        {
            gro.login();
        }
        @Step("Validate login")
    public void login_val()
        {
            gro.Validate_login();
        }
        @Step("Open product Air jordan 4")
        public void open_product()
        {
            gro.Open_jordan4_retro();
        }
        @Step("Add to cart")
    public void add_to_cart()
    {
        gro.Add_item_to_cart();
    }
    @Step("Validate item i sadded to cart")
    public void cart_val(){
            gro.Validate_itemInCart();
    }
    @Step("Open website")
    public void open_website()
    {
        gro.website();
    }
    @Step("Use Brwoser")
    public void browser() throws InterruptedException {
        gro.browser();
    }
}
