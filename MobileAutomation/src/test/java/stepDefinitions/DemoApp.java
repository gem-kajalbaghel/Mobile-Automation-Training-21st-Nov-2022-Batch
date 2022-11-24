package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoApp extends PageObject{

    @Managed(driver = "appium")
    WebDriver driver;

    @Given("^Launch the Application$")
    public void DemoAppLaunch() throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability("deviceName","Pixel 6 API 30");
        capability.setCapability("udid", "emulator-5554");

        capability.setCapability("platformName", "Android");

        capability.setCapability("app","C:\\Users\\va.sharma1\\OneDrive - Gemini Solutions\\Desktop\\MobileAutomation\\app\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);

        System.out.println("Application Launched");
    }

    @When("^Check for Application$")
    public void appLaunched(){

        System.out.println("Launched");
    }
}
