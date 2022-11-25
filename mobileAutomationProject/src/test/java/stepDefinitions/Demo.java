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
        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel6");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\Users\\kr.Pandey\\AppData\\Local\\Android\\Sdk\\platform-tools\\ExpenseAppVer1.0.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launched application");
        Thread.sleep(6000);

    }
}
