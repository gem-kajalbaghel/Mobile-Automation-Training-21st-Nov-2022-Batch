package stepDefination;
import Steps.APKSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

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
    @Given("Get Toast message from apk")
    public void fetchToastMsg() throws InterruptedException {
        apkSteps.getToastmessage1();
    }
    @When("^Verify drag and drop$")
    public void dragDrop() throws InterruptedException {

        apkSteps.dragDrop();

    }
}

