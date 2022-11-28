package UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locator {

    public static By pref = AppiumBy.accessibilityId("Preference");
    public static By prefDepend = AppiumBy.accessibilityId("3. Preference dependencies");
    public static By wifiCheckBox=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");

    public static By wifiSetting =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");

}
