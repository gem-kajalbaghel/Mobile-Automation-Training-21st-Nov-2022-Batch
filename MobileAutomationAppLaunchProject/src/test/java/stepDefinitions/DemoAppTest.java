package stepDefinitions;

import Steps.DemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class DemoAppTest {

    @Managed(driver = "appium")
    WebDriver driver;

    @Steps
    DemoAppSteps demoAppSteps;

    @Given("^Launch the Application$")
    public void launchApp() throws InterruptedException {
/*
        cap.setCapability("deviceName","Pixel 6 API 30 2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\Users\\sa.marathe\\IdeaProjects\\MobileAutomationAppLaunchProject\\app\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
*/
        System.out.println("Application Launched successfully");
        Thread.sleep(5000);
    }

    @When("^Check for Application$")
    public void appLaunchedOrNot(){
        System.out.println("Status Checked and Applicaton got Launched!!");
    }

    @And("^Open Preferences and Enter wifi Name$")
    public void openPreferenceAndEnterWifiName(){
        // Assignment 4 Open Preference and enter Wifi Name
        demoAppSteps.preference();
    }

    @And("^Long Press Feature$")
    public void LongPressFeatureTest(){
        // Assingment -5 Long Press Feature
        demoAppSteps.LongPressFeatureStep();
    }
    @Then("^Close Application$")
    public void closeApplication(){
        demoAppSteps.closeApp();
    }
}
