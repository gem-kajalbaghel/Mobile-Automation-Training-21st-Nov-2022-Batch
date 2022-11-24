import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class automation {
    public static AppiumDriver driver=null;

    public static WebDriver openApp() throws MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","Android Emulator");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("app","C:\\Users\\sh.bajaj\\AppData\\Local\\android\\Sdk\\platform-tools\\calculatorsample.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,cap);
        return driver;
    }


    public static void main(String []args) throws MalformedURLException, InterruptedException {
        openApp();
    }


}
