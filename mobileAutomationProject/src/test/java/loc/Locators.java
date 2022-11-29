package loc;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
public class Locators {
    public static By number(String digit){
        return AppiumBy.id("com.bak.mnr.calculatrice:id/btn"+digit);
    }
    public static By inputField = AppiumBy.id("com.bak.mnr.calculatrice:id/Cadre");
}
