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

public class MobileAuto extends PageObject{

    @Managed(driver = "appium")
    WebDriver driver;

    @Given("^Launch the Application$")
    public void MobileAutoLaunch() throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability("deviceName","Pixel 3a API 33");
        capability.setCapability("udid", "emulator-5554");

        capability.setCapability("platformName", "Android");

        capability.setCapability("app","C:\\Users\\an.jain2\\Desktop\\Mobile-Automation-Training\\MobileAutomation\\app\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);

        System.out.println("app launched");
    }

    @When("^Check for Application$")
    public void applicationlaunched(){

        System.out.println("app launched");
    }
}
