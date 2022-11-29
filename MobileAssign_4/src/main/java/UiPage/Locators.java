package UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {
public static By app = AppiumBy.accessibilityId("App");


public static By searchOption =AppiumBy.accessibilityId("Search");
public static By invokeSearch =AppiumBy.accessibilityId("Invoke Search");

public static By sendData= AppiumBy.id("io.appium.android.apis:id/txt_query_prefill");
    public static By alert =AppiumBy.accessibilityId("Alert Dialogs");
    public static By alertFirstOption =AppiumBy.accessibilityId("OK Cancel dialog with a message");
    public static By okBtn =AppiumBy.id("android:id/button1");
    public static By views =AppiumBy.accessibilityId("Views");
    public static By expendableList=AppiumBy.accessibilityId("Expandable Lists");
    public static By cusAdapter =AppiumBy.accessibilityId("1. Custom Adapter");
    public static By names =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");




}
