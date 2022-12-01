package stepDefinitions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import loc.Locators;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.remote.RemoteWebElement;

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

    @Then("Click on {string} button.")
    public void clickOnBtn(String btn) {
        isPassed = false;
        try {
            Thread.sleep(2000);

            if (driver.findElement(Locators.accessibilityId(btn)).isDisplayed()) {
                driver.findElement(Locators.accessibilityId(btn)).click();
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

    @And("Longpress names")
    public void longpressNames() {
        isPassed = false;
        try {
            Thread.sleep(2000);

            LongPressOptions longPressOptions = new LongPressOptions();
            WebElement ele = driver.findElement(Locators.personName);
            longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(ele));
            TouchAction action = new TouchAction<>((PerformsTouchActions) driver);
            action.longPress(longPressOptions).release().perform();

            Thread.sleep(2000);
            isPassed = true;
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully longpressed");
        else
            System.out.println("User is unable to longpress");
    }


    //Assignment6
    @Then("Check scroll functionality {string}, {string}")
    public void checkScrollFunctionality(String text, String scroll) {
        isPassed = false;
        try {
            Thread.sleep(2000);

            driver.findElement(Locators.accessibilityId(text)).click();
            driver.findElement(Locators.scroll(scroll));
            isPassed = true;
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully scrolled");
        else
            System.out.println("User is unable to scroll");
    }

    @And("Swipe through images")
    public void swipeThroughImages() {
        isPassed = false;
        try {
            Thread.sleep(2000);

            WebElement img = driver.findElement(Locators.swipe);

            ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) img).getId(),
                    "direction", "left",
                    "percent", "0.80"
            ));
            isPassed = true;
        } catch (Exception ex) {
            isPassed = false;
        }
        if (isPassed)
            System.out.println("Successfully swiped");
        else
            System.out.println("User is unable to swipe");
    }
}