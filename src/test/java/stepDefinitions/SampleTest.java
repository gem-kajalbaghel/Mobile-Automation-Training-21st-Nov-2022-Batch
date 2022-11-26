package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    private DesiredCapabilities capabilities = null;
    private final String appLocation = System.getProperty("user.dir") + "/app/";
    AppiumDriver driver = null;

    @Given("Set the capabilities")
    public void setTheCapabilities() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "Device 2");
        capabilities.setCapability("appium:platformVersion", "10.0");
        capabilities.setCapability("appium:app", appLocation + "ApiDemos-debug.apk");
        System.out.println(capabilities);
    }

    @When("launch the app")
    public void launchTheApp() {
        try {
            String url = "http://127.0.0.1:4723/wd/hub/";
            driver = new AndroidDriver(new URL(url), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Then("should launch the app successfully")
    public void shouldLaunchTheAppSuccessfully() {
        System.out.println("App launched - " + driver);
    }

    @And("close the application")
    public void closeTheApplication() {
        try {
            Thread.sleep(2000);
            driver.quit();
            System.out.println("App closed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
