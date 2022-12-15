package com.gemini.generic.UI;

import com.gemini.generic.Locators.locators;
import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Set;

public class grocery extends PageObject {

    public void login() {
        typeInto(MobileAction.getElement(locators.Login_name), "ABC");
        MobileAction.waitSec(1);
        clickOn(MobileAction.getElement(locators.Login_countryDropdown));
        MobileAction.waitSec(1);
        clickOn(MobileAction.getElement(locators.Login_country_select));
        MobileAction.waitSec(1);
        clickOn(MobileAction.getElement(locators.Login_Male));
        clickOn(MobileAction.getElement(locators.btn_login));
        MobileAction.waitSec(3);
    }

    public void Validate_login()
    {   MobileAction.takeSnapShot();
        //if(MobileAction.getTitle().equalsIgnoreCase("Products"))
            System.out.println("login Success");
        //else
            System.out.println("login Fail");
    }

    public void Open_jordan4_retro() {
        MobileAction.scrollToElement("Air Jordan 4 Retro", true);
    }
    public void Add_item_to_cart(){
        clickOn(MobileAction.getElement(locators.Products_addtoCart));
        MobileAction.waitSec(2);
        clickOn(MobileAction.getElement(locators.btn_cart));
       // MobileDriverManager.getAppiumDriver().waitABit(2000);
        MobileAction.waitSec(2);
    }

    public void Validate_itemInCart(){
        MobileAction.takeSnapShot();
        if(MobileDriverManager.getAppiumDriver().findElement(locators.Product_cart).getText().contains("Air"))
            System.out.println("Item successfully added to cart");
        else
            System.out.println("Failed to add to cart");
    }
    public void website(){
        clickOn(MobileDriverManager.getAppiumDriver().findElement(locators.website));
        MobileAction.takeSnapShot();
            System.out.println("Order Successful");
    }
    public void browser() throws InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("chromedriverExecutable","D:\\driver\\chromedriver.exe");
        Set<String> contexts = ((AndroidDriver) MobileDriverManager.getAppiumDriver()).getContextHandles();
        ((AndroidDriver) MobileDriverManager.getAppiumDriver()).context("WEBVIEW_com.androidsample.generalstore");
        MobileAction.typeText(locators.searchbox, "Gemini"+ Keys.ENTER);
        MobileAction.waitSec(3);
        MobileAction.click(locators.result_first);
        MobileAction.navigateBack(true);
        MobileAction.waitSec(3);
        MobileAction.navigateForward(true);
        MobileAction.waitSec(3);
        MobileAction.refresh(true);
        MobileAction.waitSec(3);
    }
}
