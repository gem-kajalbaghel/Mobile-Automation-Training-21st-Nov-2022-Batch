package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import loc.Locators;

import java.net.MalformedURLException;
import java.net.URL;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemoApp extends PageObject {

    @Managed(driver = "appium")
    WebDriver driver;

    @Given("^Launch the application$")
    public void app() throws MalformedURLException, InterruptedException {

        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 6 Pro API 31");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "C:\\Users\\hi.panchal\\Desktop\\Apps\\cal.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launching calculator app");


    }

    @Then("Click on {string} number")
    public void clickOnNumber(String numStr) throws InterruptedException {
     clickOn(element(Locators.digit));
     typeInto(element(Locators.type),"1808");
clickOn(element(Locators.test));
//        driver.findElement(Locators.digit).click();
//        driver.findElement(Locators.type).sendKeys("1808");
        Thread.sleep(10000);
    }
}