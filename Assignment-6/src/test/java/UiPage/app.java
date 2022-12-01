package UiPage;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

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

    public void scrollTest() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
    }

    public void swipeTest() throws InterruptedException{
        clickOn(driver.findElement(AppiumBy.accessibilityId("Gallery")));
        clickOn(driver.findElement(AppiumBy.accessibilityId("1. Photos")));

        WebElement img = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)img).getId(),
                "direction","left",
                "percent","1.0"
        ));

        Thread.sleep(2000);
    }

    public void dropDown() throws InterruptedException{
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));"));
        clickOn(driver.findElement(AppiumBy.accessibilityId("Popup Menu")));
        clickOn(driver.findElement(AppiumBy.accessibilityId("Make a Popup!")));
        Thread.sleep(2000);
        List<WebElement> dropDown = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout//android.widget.TextView"));
        for(WebElement ele: dropDown){
            System.out.println(ele.getText());
            if(ele.getText().equals("Search")) {
                ele.click();
                break;
            }
        }
    }

    public void valToastAfterDropDown(){
        String msg = driver.findElement(locator.toastMsg).getAttribute("name");
        Assert.assertEquals("Clicked popup menu item Search", msg);
    }

    public void dragAndVerify(){
        clickOn(driver.findElement(locator.dragDrop));
        WebElement sourceDrag = driver.findElement(locator.sourceDrag);

        ((JavascriptExecutor)driver).executeScript("mobile: dragGesture",ImmutableMap.of(
                "elementId",((RemoteWebElement)sourceDrag).getId(),
                "endX",600,
                "endY",600
        ));

        String res = driver.findElement(locator.dragResult).getText();
        System.out.println(res);
        Assert.assertEquals("Dropped!",res);
    }

}
