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
    public void launchApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Pixel 6 API 30 2");
        cap.setCapability("udid", "emulator-5554");

        cap.setCapability("platformName", "Android");

        cap.setCapability("app","C:\\Users\\sa.marathe\\IdeaProjects\\MobileAutomationAppLaunchProject\\app\\perfecto.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        System.out.println("Application Launched successfully");
    }

    @When("^Check for Application$")
    public void appLaunchedOrNot(){
        System.out.println("Status Checked and Applicaton got Launched!!");
    }
}
