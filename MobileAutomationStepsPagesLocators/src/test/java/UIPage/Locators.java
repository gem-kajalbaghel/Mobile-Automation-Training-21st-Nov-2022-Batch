package UIPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {
    public static By option_preference = AppiumBy.accessibilityId("Preference");
    public static By optionPreference_dependencies = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]");
    public static By checkbox_wifi = AppiumBy.id("android:id/checkbox");
    public static By option_wifiSettings = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
    public static By input_wifiName = AppiumBy.id("android:id/edit");
    public static By alert_OkButton = AppiumBy.id("android:id/button1");
}
