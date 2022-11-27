package stepDefinitions;

import Steps.DemoAppSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoAppTest extends PageObject{

    @Managed(driver = "appium")
    WebDriver driver;

    @Steps
    DemoAppSteps demoAppSteps;

    @Given("^Launch the Application$")
    public void launchApp() throws MalformedURLException,InterruptedException {
        Thread.sleep(10000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Pixel 6 API 30 2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\Users\\sa.marathe\\IdeaProjects\\MobileAutomationAppLaunchProject\\app\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("Application Launched successfully");

        // Calling the Step Function so that the further application process will go on
        demoAppSteps.preference();

    }
    @When("^Check for Application$")
    public void appLaunchedOrNot(){
        System.out.println("Status Checked and Applicaton got Launched!!");
    }
}
