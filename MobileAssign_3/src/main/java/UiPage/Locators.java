package UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

//MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("App");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Search");
//        el2.click();
//        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Invoke Search");
//        el3.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("io.appium.android.apis:id/txt_query_prefill");
//        el4.sendKeys("abcd");
public class Locators {
public static By app = AppiumBy.accessibilityId("App");


public static By searchOption =AppiumBy.accessibilityId("Search");
public static By invokeSearch =AppiumBy.accessibilityId("Invoke Search");

public static By sendData= AppiumBy.id("io.appium.android.apis:id/txt_query_prefill");
}
