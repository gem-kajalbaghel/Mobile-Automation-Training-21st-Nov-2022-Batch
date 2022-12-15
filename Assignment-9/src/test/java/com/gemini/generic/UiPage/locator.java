package com.gemini.generic.UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locator {

    public static By pref = AppiumBy.accessibilityId("Preference");
    public static By option_app = AppiumBy.accessibilityId("App");
    public static By option_views = AppiumBy.accessibilityId("Views");
    public static By dragDrop = AppiumBy.accessibilityId("Drag and Drop");
    public static By expandable_lists = AppiumBy.accessibilityId("Expandable Lists");
    public static By custom_adapt = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By alert_dialogue = AppiumBy.accessibilityId("Alert Dialogs");
    public static By alert_firstOption = By.id("io.appium.android.apis:id/two_buttons");
    public static By ok_btn = By.id("android:id/button1");
    public static By prefDepend = AppiumBy.accessibilityId("3. Preference dependencies");
    public static By wifiCheckBox=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
    public static By longpress=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");
    public static By toastMsg = AppiumBy.xpath("//android.widget.Toast[1]");
    public static By wifiSetting =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
    public static By sourceDrag = AppiumBy.id("io.appium.android.apis:id/drag_dot_3");
    public static By dragResult = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

    public static By name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By countryDropdown = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    public static By countrySelect=AppiumBy.xpath("//android.widget.TextView[@text='Angola']");
    public static By male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By btnLogin = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By productCart=  AppiumBy.id("com.androidsample.generalstore:id/productName");
    public static By productsAddtoCart= AppiumBy.id("com.androidsample.generalstore:id/productAddCart");
    public static By btnCart =AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public static By website=AppiumBy.id("com.androidsample.generalstore:id/btnProceed");
    public static By title=AppiumBy.id("com.androidsample.generalstore:id/toolbar_title");
    public static By g_search = By.name("q");
    public static By link = By.xpath("//div[@role='option'][1]");
}
