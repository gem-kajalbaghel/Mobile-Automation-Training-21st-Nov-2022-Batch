package UI;

import Locators.locators;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Scroll_Swipe extends PageObject {
    @Managed(driver = "appium")
    WebDriver driver;
    public void launch() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("devicenname","Android Emulator");
        dc.setCapability("udid","emulator-5554");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","13.0");
        dc.setCapability("app","D:\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("Setup complete");
    }
   // AndroidDriver and_driver = (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();

    public void clickViews() throws InterruptedException {
        Thread.sleep(1000);
        clickOn(driver.findElement(locators.views));
    }
    public void clickGallery() throws InterruptedException {
        Thread.sleep(1000);
        clickOn(driver.findElement(locators.gallery));
    }

    public void clickPhotos() throws InterruptedException {
        Thread.sleep(1000);
        clickOn(driver.findElement(locators.photos));
    }

    public void swipe() throws InterruptedException {
        Thread.sleep(2000);
        WebElement image = driver.findElement(locators.swipe);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "Id",((RemoteWebElement)image).getId(),
                "direction","left",
                "percent","1.0"));
        Thread.sleep(1500);
    }



    public void dropDown() throws InterruptedException{

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));"));
        clickOn(driver.findElement(locators.popMenu));
        clickOn(driver.findElement(locators.makePop));
        Thread.sleep(2000);
        List<WebElement> dropDown = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout//android.widget.TextView"));
        for(WebElement ele: dropDown){
            System.out.println(ele.getText());
            if(ele.getText().equals("Search")) {
                ele.click();
                Thread.sleep(2000);
                break;
            }
        }

    }

    public void scrollfunc() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
    }

    public void toastMessage() throws InterruptedException {

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));"));
        clickOn(driver.findElement(locators.popMenu));
        clickOn(driver.findElement(locators.makePop));
        clickOn(driver.findElement(locators.search));
        waitABit(1000);
        String str=driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute("text");
        System.out.println(str);
        try {
            Assert.assertEquals(str,"Clicked popup menu item Search");
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
    }
    public void dragDropsbtn() throws InterruptedException
    {
        clickOn(driver.findElement(locators.dragAndDrop));
    }

    public void drop()
    {

        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(locators.src)).getId(),
                "endX", 800,
                "endY", 750
        ));
        waitABit(2000);
        String msg=driver.findElement(locators.drop).getText();
        System.out.println(msg);
        try {
            Assert.assertEquals(msg, "Dropped!");
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
    }
}