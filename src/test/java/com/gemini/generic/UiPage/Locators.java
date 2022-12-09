package com.gemini.generic.UiPage;

import io.appium.java_client.AppiumBy;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.openqa.selenium.By;

public class Locators
{

//    public static By pref = By.id("io.perfecto.expense.tracker:id/login_email");
    public static By pref = AppiumBy.accessibilityId("Preference");

    public static By prefDependencies = AppiumBy.accessibilityId("3. Preference dependencies");
//2. Launching preferences

    public static By wifiCheckBox=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");

    public static By wifiSettings=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");


//
public static By views = AppiumBy.accessibilityId("Views");

public static By expandableLists =AppiumBy.accessibilityId("Expandable Lists");

    public static By customAdaptor =AppiumBy.accessibilityId("1. Custom Adapter");
    public static By peopleName = AppiumBy.xpath("//android.widget.TextView[@text='People Names']");
    public static By app_option=AppiumBy.accessibilityId("App");
    public static By alert_dialogs =AppiumBy.accessibilityId("Alert Dialogs");
    public static By okCancel_alert=AppiumBy.accessibilityId("OK Cancel dialog with a message");
    public static By cancel =AppiumBy.id("android:id/button2");
    public static By gallery=AppiumBy.xpath("//android.widget.TextView[@content-desc='Gallery']");
    public static By photos=AppiumBy.accessibilityId("1. Photos");
    public static By popMenu=AppiumBy.accessibilityId("Popup Menu");
    public static By makePop=AppiumBy.accessibilityId("Make a Popup!");
    public static By search=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");


    public static By dragAndDrop= AppiumBy.accessibilityId("Drag and Drop");
    public static By src= AppiumBy.id("io.appium.android.apis:id/drag_dot_1");

    public static By drop =AppiumBy.id("io.appium.android.apis:id/drag_result_text");

//    public static By name=AppiumBy.id("com.androidsample.generalstore:id/nameField");

    public static By name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
        public static By countryDropdown = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
        public static By countrySelect=AppiumBy.xpath("//android.widget.TextView[@text='Angola']");
        public static By male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
        public static By btnLogin = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
        public static By productCart=  AppiumBy.id("com.androidsample.generalstore:id/productName");
        public static By productsAddtoCart= AppiumBy.id("com.androidsample.generalstore:id/productAddCart");
        public static By btnCart =AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
        public static By website=AppiumBy.id("com.androidsample.generalstore:id/btnProceed");

    }
