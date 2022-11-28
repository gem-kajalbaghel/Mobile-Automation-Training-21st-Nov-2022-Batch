package UiPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class app extends PageObject {
    public static AppiumDriver driver=null;

    public static WebDriver main() throws MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","Android Emulator");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("app","C:\\Users\\sh.bajaj\\AppData\\Local\\android\\Sdk\\platform-tools\\ApiDemos.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,cap);
        return driver;
    }

    public void clickPref() throws InterruptedException
    {
            $(locator.pref).click();
    }

    public void clickOnPrefDepend() {
        $(locator.prefDepend).click();
    }
    public void wificheck()
    {
        $(locator.wifiCheckBox).click();
    }
    public void wifiText()
    {
        $(locator.wifiSetting).click();
        typeInto(element(locator.wifiSetting),"Default value");
    }
}
