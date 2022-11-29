package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
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
    boolean isPassed = false;
    @Managed(driver = "appium")
    WebDriver driver;

    @Given("^Launch the application$")
    public void app() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 6 Pro API 31");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "C:\\Users\\hi.panchal\\Desktop\\Apps\\test.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launching calculator app");

    }

    @Then("Click on {string} number")
    public void clickOnNumber(String numStr) throws InterruptedException {
//     clickOn(element(Locators.digit));
//     typeInto(element(Locators.type),"1808");
//clickOn(element(Locators.test));
        driver.findElement(Locators.digit).click();
        driver.findElement(Locators.type).sendKeys("1808");
        Thread.sleep(10000);
    }

    //Assignment5
    @Then("Click on {string} button")
    public void clickOnButton(String btn) {
        isPassed = false;
        try {
            Thread.sleep(2000);

            if (driver.findElement(Locators.appButton(btn)).isDisplayed()) {
                driver.findElement(Locators.appButton(btn)).click();
                isPassed = true;
            }
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully clicked on " + btn + " button.");
        else
            System.out.println("User is unable to click on " + btn + " button.");

    }

    @And("Click on ok button from the alert dialog box")
    public void clickOnOkButtonFromTheAlertDialogBox() {
        isPassed = false;
        try {
            Thread.sleep(4000);
            System.out.println(Locators.alertOkButton);
            if (driver.findElement(Locators.alertOkButton).isDisplayed()) {
                driver.findElement(Locators.alertOkButton).click();
                isPassed = true;
            }
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully clicked on OK button.");
        else
            System.out.println("User is unable to click on OK button.");
    }

    @Then("Click on {string} button for dialog box")
    public void clickOnButtonForDialogBox(String btn) {
        isPassed = false;
        try {
            Thread.sleep(2000);

            if (driver.findElement(Locators.alertDialog(btn)).isDisplayed()) {
                driver.findElement(Locators.alertDialog(btn)).click();
                isPassed = true;
            }
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully clicked on " + btn + " button.");
        else
            System.out.println("User is unable to click on " + btn + " button.");
    }
}