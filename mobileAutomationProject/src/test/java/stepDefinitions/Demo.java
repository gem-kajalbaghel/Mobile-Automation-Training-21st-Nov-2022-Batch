package stepDefinitions;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class Demo {

    @Managed(driver = "appium")
    WebDriver driver;
    @Given("^Launch the application$")
    public void app() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability("deviceName","Pixel 6 API 30");
        capability.setCapability("udid", "emulator-5554");

        capability.setCapability("platformName", "Android");

        capability.setCapability("app","C:\\Users\\va.sharma1\\OneDrive - Gemini Solutions\\Documents\\mobileAutomationProject\\app\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);

        System.out.println("Application Launched");

    }
}
