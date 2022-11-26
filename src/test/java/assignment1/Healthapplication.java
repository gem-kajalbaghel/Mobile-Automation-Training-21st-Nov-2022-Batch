package assignment1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Healthapplication {

public static AppiumDriver driver = null;


    public static void main(String[] args) throws Exception {
        Openapplication();

    }
    public static WebDriver Openapplication() throws Exception {
        //Setting the mobile capabilities

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("devicename", "Android Emulator");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
// App location
        cap.setCapability("app", "C:\\Users\\sh.singh9\\Downloads\\sdk-tools\\platform-tools\\calculatorsample.apk");

        //url for appium application
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //starting the application
        driver  = new AndroidDriver(url, cap);
        return driver;

    }
    // To the close the application
public static void terminate(){

        driver.quit();
}
}







