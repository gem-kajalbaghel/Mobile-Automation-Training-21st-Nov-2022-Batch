package UiPage;

import io.appium.java_client.AppiumBy;
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
}
