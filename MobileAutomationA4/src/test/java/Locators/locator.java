package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locator {
    public static By app = AppiumBy.accessibilityId("App");
    public static By alert_dialogs =AppiumBy.accessibilityId("Alert Dialogs");
    public static By okCancel_alert=AppiumBy.accessibilityId("OK Cancel dialog with a message");
    public static By accept_alert =AppiumBy.id("android:id/button1");
    public static By views = AppiumBy.accessibilityId("Views");
    public static By views_expandableList = AppiumBy.accessibilityId("Expandable Lists");
    public static By expandableList_customAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By customAdapter_names = AppiumBy.xpath("(//android.widget.TextView)[2]");
}
