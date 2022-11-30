package UI;

import Locators.locator;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static java.time.Duration.ofSeconds;

public class alerts_longpress extends PageObject {

    @Managed(driver = "appium")
    WebDriver driver;
    public void launch() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel6");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","D:\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Setup complete");
    }
    public void alert() {
        clickOn(driver.findElement(locator.app));
        clickOn(driver.findElement(locator.alert_dialogs));
        clickOn(driver.findElement(locator.okCancel_alert));
    }
    public void AcceptAlert() throws InterruptedException {
        Thread.sleep(2000);
        clickOn(driver.findElement(locator.accept_alert));
        System.out.println("Alert complete");
        Thread.sleep(2000);
    }

    public void long_press() {
//        driver.navigate().back();
//        driver.navigate().back();
        clickOn(driver.findElement(locator.views));
        clickOn(driver.findElement(locator.views_expandableList));
        clickOn(driver.findElement(locator.expandableList_customAdapter));
        LongPressOptions longPress=new LongPressOptions();
        longPress.withDuration(ofSeconds(5)).withElement(ElementOption.element(driver.findElement(locator.customAdapter_names)));
         TouchAction taction=new TouchAction((PerformsTouchActions) driver);
         taction.longPress(longPress).release().perform();
        System.out.println("Long press complete");
    }
}
