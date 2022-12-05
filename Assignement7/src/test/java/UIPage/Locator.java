package UIPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public  class Locator {
    public static By option_preference =  AppiumBy.accessibilityId("Preference");
    public static By optionPreference_dependencies = AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']");
    public static By checkbox_wifi = AppiumBy.id("android:id/widget_frame");
    public static By option_wifiSettings = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]");
    public static By input_wifiName = AppiumBy.id("android:id/edit");
    public static By alert_OkButton = AppiumBy.className("android.widget.Button");

    //// Views Tab
    public static By option_views = AppiumBy.accessibilityId("Views");
    public static By optionviews_popMenu = AppiumBy.accessibilityId("Popup Menu");
    public static By optionviews_popMenu_makeAPopup = AppiumBy.xpath("//android.widget.Button[@content-desc='Make a Popup!']");
    public static By getOptionviews_popMenu_makeAPopup_selectSearch = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView") ;
    public static By optionViews_expandableList = AppiumBy.accessibilityId("Expandable Lists");
    public static By optionExpandableList_CustomAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By optionCustomAdapter_PeopleNames = AppiumBy.xpath("(//android.widget.TextView)[2]");

    public static By optionView_dragAndDrop=AppiumBy.accessibilityId("Drag and Drop");
    public static By sourceofDragItem = AppiumBy.id("io.appium.android.apis:id/drag_dot_3");
    public static By DestinationOfDragDrop = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

}