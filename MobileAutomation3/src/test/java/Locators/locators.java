package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locators {
    public static By view = AppiumBy.accessibilityId("Views");
    public static By auto_complete=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Auto Complete\"]");
    public static By screen_top=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Screen Top\"]");
    public static By country=AppiumBy.id("io.appium.android.apis:id/edit");
}
