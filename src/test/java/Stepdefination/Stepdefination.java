package Stepdefination;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Stepdefination {

    public static DesiredCapabilities caps;
    @Managed(driver = "appium")
    WebDriver driver;

    @Given("Set the capabilities")
    public void Set_the_capabilities() throws InterruptedException, MalformedURLException {
        caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Pixel 3 API 30");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");


        caps.setCapability("app", "C:\\Users\\sh.singh9\\Downloads\\sdk-tools\\platform-tools\\ExpenseAppVer1.0.apk");
        caps.setCapability("udid", "emulator-5554");
        AndroidDriver driver =
                new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        Thread.sleep(6000);
    }

    @Then("Click on the signup button")
    public void Click_on_the_signup_button() throws InterruptedException {
        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/login_signup_btn")).click();
        Thread.sleep(3000);
    }

    @And("Fill all the details")
    public void Fill_all_the_details() {

        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/signup_name")).sendKeys("user1");
        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/signup_email")).sendKeys("test@user.com");
        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/signup_password")).sendKeys("Test#123");
        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/signup_confirm_password")).sendKeys("Test#123");
        driver.findElement(AppiumBy.id("io.perfecto.expense.tracker:id/signup_currency")).click();
    }
}






