package UI;

import Locators.locators;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ClickAndSendkeys extends PageObject {
    @Managed(driver = "appium")
    WebDriver driver;
    public void launch_the_application() throws MalformedURLException {
        //setup
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel6");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","D:\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Setup complete");
    }
    public void clickOn() throws InterruptedException {
        Thread.sleep(1000);
        clickOn(driver.findElement(locators.view));
        Thread.sleep(2000);
        clickOn(driver.findElement(locators.auto_complete));
       // WebElement auto=$(locators.auto_complete);
       // clickOn(auto);
        Thread.sleep(1000);
        driver.findElement(locators.screen_top).click();
    }
    public void typeInto()
    {
        typeInto(driver.findElement(locators.country),"xyz");
    }
}
