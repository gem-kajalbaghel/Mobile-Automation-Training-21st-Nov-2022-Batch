package stepDefinitions;

import UIPage.Locators;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MobileAuto extends PageObject{

    @Managed(driver = "appium")
    WebDriver driver;

    @Given("^Launch the Application$")
    public void MobileAutoLaunch() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability("deviceName","Google Pixel");
        capability.setCapability("udid", "emulator-5554");

        capability.setCapability("platformName", "Android");

        capability.setCapability("app","C:\\Users\\an.jain2\\Desktop\\Mobile-Automation-Training\\MobileAutomation\\app\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);

        Thread.sleep(2000);
    }
    @When("^Check for Application$")
    public void applicationlaunched() throws InterruptedException {

        System.out.println("Launching API Demos application through Intellij");
        Thread.sleep(2000);
    }

//    @Then("Click on number")
//    public void clickOnNumber(String numStr) throws InterruptedException {
//        driver.findElement(Locators.digit).click();
//        driver.findElement(Locators.type).sendKeys("1234");
//        Thread.sleep(2000);
//    }

    @Then("^Check Alert message$")
    public void checkAlertMessage() throws InterruptedException {
        driver.findElement(Locators.app).click();
        driver.findElement(Locators.alertDialogue).click();
        driver.findElement(Locators.dialogue).click();
        driver.findElement(Locators.alertPopUp).click();
        Thread.sleep(2000);
    }
    @Then("^Check for long press$")
    public void longPressTest() throws InterruptedException {
        driver.findElement(Locators.views).click();
        driver.findElement(Locators.expandableList).click();
        driver.findElement(Locators.customAdapter).click();

        LongPressOptions longPressOptions = new LongPressOptions();
        WebElement element = driver.findElement(Locators.peopleName);
        longPressOptions.withDuration(Duration.ofSeconds(2)).withElement(ElementOption.element(element));
        TouchAction action = new TouchAction<>((PerformsTouchActions)driver);
        action.longPress(longPressOptions).release().perform();

        Thread.sleep(2000);
    }

}

