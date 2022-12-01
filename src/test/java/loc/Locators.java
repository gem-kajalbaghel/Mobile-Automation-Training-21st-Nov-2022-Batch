package loc;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {
    public static By nums(String num) {
        return AppiumBy.id("com.bak.mnr.calculatrice:id/btn" + num);
    }

    public static By digit = AppiumBy.id("com.bak.mnr.calculatrice:id/btn5");
    public static By type = AppiumBy.id("com.bak.mnr.calculatrice:id/Cadre");

    public static By appButton(String btnName) {
        return AppiumBy.xpath("//android.widget.TextView[@content-desc=\"" + btnName + "\"]");
    }

    public static By alertDialog(String btn) {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"" + btn + "\"]");
    }

    public static By alertOkButton = AppiumBy.id("android:id/button1");

    public static By accessibilityId(String btn) {
        return AppiumBy.accessibilityId('"' + btn + '"');
    }

    public static By personName = AppiumBy.id("//android.widget.TextView[1]");

    public static By scroll(String scroll) {
        return AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView" + "(text(\"" + scroll + "\\\"));");
    }

    public static By swipe = AppiumBy.xpath("//android.widget.ImageView[1]");
}
