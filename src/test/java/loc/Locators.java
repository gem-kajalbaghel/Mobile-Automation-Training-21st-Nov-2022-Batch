package loc;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
public class Locators {
    public static By nums(String num){
      return AppiumBy.id("com.bak.mnr.calculatrice:id/btn"+num);
    }
    public static By digit = AppiumBy.id("com.bak.mnr.calculatrice:id/btn5");
    public static By type = AppiumBy.id("com.bak.mnr.calculatrice:id/Cadre");
    public static By test = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]");
}
