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

    public static By app = AppiumBy.accessibilityId("App");
    public static By alertDialogue = AppiumBy.accessibilityId("Alert Dialogs");
    public static By dialogue = AppiumBy.accessibilityId("OK Cancel dialog with a message");
    public static By alertPopUp = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
    public static By customAdapter = AppiumBy.accessibilityId("Custom Adapter");;
    public static By peopleName = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");
    public static By expandableList = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");;
    public static By views = AppiumBy.accessibilityId("Views") ;

}