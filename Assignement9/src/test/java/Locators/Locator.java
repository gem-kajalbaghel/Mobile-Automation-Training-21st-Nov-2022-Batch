package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locator {


    public static By letsShopButton = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By backButton = AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_back");
    public static By addToCart_option = AppiumBy.xpath("(//android.widget.TextView)[4]");
    public static By sendEmailOnDiscounts_CheckBox = AppiumBy.xpath("//android.widget.CheckBox");
    public static By letsProceedForPurchase = AppiumBy.id("com.androidsample.generalstore:id/btnProceed");
    public static By img = AppiumBy.id("hplogo");

    public static By name_input = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By selectCountryDropdown = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    public static String selectCountryByname="//android.widget.TextView[@text='<text>']";
    public static By maleButton = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By femaleButton = AppiumBy.id("com.androidsample.generalstore:id/radioFemale");
    public static By loginButton = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By productCart=  AppiumBy.id("com.androidsample.generalstore:id/productName");
    public static By productsAddtoCart= AppiumBy.id("com.androidsample.generalstore:id/productAddCart");
    public static By cartButton =AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public static By website=AppiumBy.id("com.androidsample.generalstore:id/btnProceed");
    public static By title=AppiumBy.id("com.androidsample.generalstore:id/toolbar_title");
}
