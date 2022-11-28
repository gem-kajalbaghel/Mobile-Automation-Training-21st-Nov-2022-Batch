package UI;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch extends PageObject {
    @Managed(driver = "appium")
    WebDriver driver;
    public void launch_the_application() throws MalformedURLException {
        //setup
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel6");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","D:\\ExpenseAppVer1.0.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        System.out.println("Application is launched");
    }
}
