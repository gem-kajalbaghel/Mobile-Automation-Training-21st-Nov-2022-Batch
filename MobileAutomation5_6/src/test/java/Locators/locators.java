package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locators {
    public static By views = AppiumBy.accessibilityId("Views");
    public static By gallery=AppiumBy.xpath("//android.widget.TextView[@content-desc='Gallery']");
    public static By photos=AppiumBy.accessibilityId("1. Photos");
    public static By popMenu=AppiumBy.accessibilityId("Popup Menu");
    public static By makePop=AppiumBy.accessibilityId("Make a Popup!");
    public static By search=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    public static By dragAndDrop= AppiumBy.accessibilityId("Drag and Drop");
    public static By src= AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    public static By drop =AppiumBy.id("io.appium.android.apis:id/drag_result_text");
    public static By swipe=AppiumBy.xpath("//android.widget.ImageView[1]");
}
