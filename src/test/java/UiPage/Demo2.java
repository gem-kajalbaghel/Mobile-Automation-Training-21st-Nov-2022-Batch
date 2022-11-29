package UiPage;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Demo2 extends PageObject
{

    @Managed(driver = "appium")
        WebDriver driver;

//    AndroidDriver driver = (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();


    public void app() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel3");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app","C:\\projects\\MobileAutomationSeries\\app\\ApiDemos.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Launched application");

    }




    public void clickOnOption() throws InterruptedException
    {

        Thread.sleep(2000);

//        System.out.println(Locators.pref);
        try {
//            Thread.sleep(2000);

            getDriver().findElement(Locators.pref).click();

//            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
    }






    public void clickOnPreferenceDependencies()
    {
        getDriver().findElement(Locators.prefDependencies).click();

//    $(Locators.prefDependencies).click();
    }





public void clickWifi()
{
    $(Locators.wifiCheckBox).click();

//    driver.findElement(Locators.wifiCheckBox).click();
}
public void wifiSettingss()
{
    WebElement ele=getDriver().findElement(Locators.wifiSettings);
    ele.click();
    typeInto(element(Locators.wifiSettings),"Tushar Mahajan");
//    ele.sendKeys("Tushar Mahajan");

//    driver.findElement(Locators.wifiSettings).sendKeys("Tushar Mahajan");
}
public void clickView() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(Locators.views).click();

    }

    public void clickexpandable()
    {

        driver.findElement(Locators.expandableLists).click();

    }

public void customAdaptorss()
{
    driver.findElement(Locators.customAdaptor).click();
}

public void people(){
    LongPressOptions lpress=new LongPressOptions();
    lpress.withDuration(Duration.ofSeconds(2)).withElement(ElementOption.element(driver.findElement(Locators.peopleName)));
    TouchAction ta=new TouchAction((PerformsTouchActions)driver);
    ta.longPress(lpress).release().perform();
}
public void alert() throws InterruptedException {
    clickOn(driver.findElement(Locators.app_option));
    clickOn(driver.findElement(Locators.alert_dialogs));
    clickOn(driver.findElement(Locators.okCancel_alert));
    Thread.sleep(2000);
    clickOn(driver.findElement(Locators.cancel));
}

}