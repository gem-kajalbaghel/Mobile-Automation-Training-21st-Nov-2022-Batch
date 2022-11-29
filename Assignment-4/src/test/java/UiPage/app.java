package UiPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class app extends PageObject {
    public static AppiumDriver driver = null;

    public static WebDriver main() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android Emulator");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "C:\\Users\\sh.bajaj\\AppData\\Local\\android\\Sdk\\platform-tools\\ApiDemos.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        return driver;
    }

    public void clickPref() throws InterruptedException {
        driver.findElement(locator.pref).click();
    }

    public void clickOnPrefDepend() {
        driver.findElement(locator.prefDepend).click();
    }

    public void wificheck() {
        driver.findElement(locator.wifiCheckBox).click();
    }

    public void wifiText() {
        driver.findElement(locator.wifiSetting).click();
        typeInto(element(locator.wifiSetting), "Default value");
    }

    public void clickOnApp() {
        driver.findElement(locator.option_app).click();
    }

    public void clickOnAlert() {
        driver.findElement(locator.alert_dialogue).click();
    }

    public void firstOptAlert() {
        driver.findElement(locator.alert_firstOption).click();
    }

    public void pressOk() {
        driver.findElement(locator.ok_btn).click();
    }

    public void clickView() {
        driver.findElement(locator.option_views).click();
    }

    public void clickExpandable() {
        driver.findElement(locator.expandable_lists).click();
    }

    public void clickCustomAdapt() {
        driver.findElement(locator.custom_adapt).click();
    }

    public void longPressOption() throws InterruptedException {
        LongPressOptions lngPress = new LongPressOptions();
        lngPress.withDuration(ofSeconds(2)).withElement(ElementOption.element(driver.findElement(locator.longpress)));
        TouchAction ac = new TouchAction((PerformsTouchActions) driver);
        ac.longPress(lngPress).release().perform();
        Thread.sleep(2000);
    }


}
