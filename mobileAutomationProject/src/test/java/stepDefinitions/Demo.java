package stepDefinitions;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import loc.Locators;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Demo {

    @Managed(driver = "appium")
    WebDriver driver;
    @Given("^Launch the application$")
    public void app() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 6 API 30");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\Users\\kr.pandey\\Downloads\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launched application");
        Thread.sleep(6000);

    }

    @Then("Click on number {string} of calculator")
    public void clickOnNumberOfCalculator(String num) {
        driver.findElement(Locators.number(num)).click();
        driver.findElement(Locators.inputField).sendKeys("123");
    }

    @Then("^Check for long press$")
    public void longPressTest() throws InterruptedException {
        driver.findElement(Locators.views).click();
        driver.findElement(Locators.expandableList).click();
        driver.findElement(Locators.costumAdapter).click();

        LongPressOptions longPressOptions = new LongPressOptions();
        WebElement element = driver.findElement(Locators.peoplesName);
        longPressOptions.withDuration(Duration.ofSeconds(2)).withElement(ElementOption.element(element));
        TouchAction action = new TouchAction<>((PerformsTouchActions)driver);
        action.longPress(longPressOptions).release().perform();

        Thread.sleep(2000);
    }

    @Then("^Check for alert message$")
    public void checkAlertMessage() throws InterruptedException {
        driver.findElement(Locators.app).click();
        driver.findElement(Locators.alertDialogue).click();
        driver.findElement(Locators.dialogue).click();
        driver.findElement(Locators.alertPopUp).click();

        Thread.sleep(2000);
    }
}
