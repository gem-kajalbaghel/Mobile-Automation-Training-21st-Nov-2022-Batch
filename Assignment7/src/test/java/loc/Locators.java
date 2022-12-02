package loc;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
public class Locators {
    public static By number(String digit){
        return AppiumBy.id("com.bak.mnr.calculatrice:id/btn"+digit);
    }
    public static By inputField = AppiumBy.id("com.bak.mnr.calculatrice:id/Cadre");
    public static By views = AppiumBy.accessibilityId("Views");
    public static By expandableList = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
    public static By costumAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    public static By peoplesName = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");
    public static By app = AppiumBy.accessibilityId("App");
    public static By alertDialogue = AppiumBy.accessibilityId("Alert Dialogs");
    public static By dialogue = AppiumBy.accessibilityId("OK Cancel dialog with a message");
    public static By alertPopUp = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
    public static By toastMsg = AppiumBy.xpath("//android.widget.Toast[1]");
    public static By dragDrop = AppiumBy.accessibilityId("Drag and Drop");
    public static By sourceDrag = AppiumBy.id("io.appium.android.apis:id/drag_dot_3");
    public static By dragResult = AppiumBy.id("io.appium.android.apis:id/drag_result_text");
}
