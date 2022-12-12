package com.gemini.generic.Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locators {
    public static By Login_name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By Login_countryDropdown = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    public static By Login_country_select=AppiumBy.xpath("//android.widget.TextView[@text='Angola']");
    public static By Login_Male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By btn_login = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");


    public static By Product_cart=  AppiumBy.id("com.androidsample.generalstore:id/productName");
    public static By Products_addtoCart= AppiumBy.id("com.androidsample.generalstore:id/productAddCart");
    public static By btn_cart =AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public static By website=AppiumBy.id("com.androidsample.generalstore:id/btnProceed");


}
