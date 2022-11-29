package UIPage;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By option_preference =  AppiumBy.accessibilityId("Preference");
    public static By optionPreference_dependencies = AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']");
    public static By checkbox_wifi = AppiumBy.id("android:id/widget_frame");
    public static By option_wifiSettings = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]");
    public static By input_wifiName = AppiumBy.id("android:id/edit");
    public static By alert_OkButton = AppiumBy.className("android.widget.Button");

    //// Views Tab
    public static By option_views = AppiumBy.accessibilityId("Views");
    public static By optionViews_expandableList = AppiumBy.accessibilityId("Expandable Lists");
    public static By optionExpandableList_CustomAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By optionCustomAdapter_PeopleNames = AppiumBy.xpath("(//android.widget.TextView)[2]");
}
