package UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locator {

    public static By pref = AppiumBy.accessibilityId("Preference");
    public static By option_app = AppiumBy.accessibilityId("App");
    public static By option_views = AppiumBy.accessibilityId("Views");
    public static By expandable_lists = AppiumBy.accessibilityId("Expandable Lists");
    public static By custom_adapt = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By alert_dialogue = AppiumBy.accessibilityId("Alert Dialogs");
    public static By alert_firstOption = By.id("io.appium.android.apis:id/two_buttons");
    public static By ok_btn = By.id("android:id/button1");
    public static By prefDepend = AppiumBy.accessibilityId("3. Preference dependencies");
    public static By wifiCheckBox=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
    public static By longpress=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");

    public static By wifiSetting =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");

}
