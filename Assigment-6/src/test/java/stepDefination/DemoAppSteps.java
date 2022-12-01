package stepDefination;
import Steps.APKSteps;
import UIPage.DemoAppPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoAppSteps {
    @Managed(driver = "appium")
    WebDriver driver;
    @Steps
    APKSteps apkSteps;

    @Given("^Launching the application$")
    public void launching_the_application() throws Exception {

        System.out.println("application lunched successfully");

    }

    @When("^Check for Application$")
    public void appLaunchedOrNot(){
        System.out.println("Status Checked and Applicaton got Launched!!");
    }

    @And("^Open Preferences and Enter wifi Name$")
    public void openPreferenceAndEnterWifiName(){
        // Assignment 4 Open Preference and enter Wifi Name
        apkSteps.preferences();
    }

    @And("^Long Press Feature$")
    public void LongPressFeatureTest(){
        // Assingment -5 Long Press Feature
        apkSteps.LongPressFeatureStep();
    }
    @Then("^Close Application$")
    public void closeApplication(){
        apkSteps.closeApp();
    }
    @When("^Scroll to Element$")
    public void scroll() throws InterruptedException {
        apkSteps.clickViewsbtn();
        apkSteps.scrollToElement();
    }

    @When("^Swipe to Element$")
    public void swipe() throws InterruptedException {
        apkSteps.clickViewsbtn();
        apkSteps.swipeToElement();
    }

    @When("^Perform Element Dropdown$")
    public void dropdown() throws InterruptedException {
        apkSteps.clickViewsbtn();
        apkSteps.dropDownElement();
    }
}

