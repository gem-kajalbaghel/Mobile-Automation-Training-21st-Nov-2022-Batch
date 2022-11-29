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
public class Demo {

    @Managed(driver = "appium")
    WebDriver driver;
    @Given("^Launch the application$")
    public void app() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 6 API 30");
        cap.setCapability("udid", "emulator-5556");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\Users\\kr.pandey\\Downloads\\cal.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launched application");
        Thread.sleep(6000);

    }

    @Then("Click on number {string} of calculator")
    public void clickOnNumberOfCalculator(String num) {
        driver.findElement(Locators.number(num)).click();
        driver.findElement(Locators.inputField).sendKeys("123");
    }
}
