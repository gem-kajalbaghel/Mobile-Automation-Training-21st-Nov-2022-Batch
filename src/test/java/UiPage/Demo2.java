package UiPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Demo2 extends PageObject
{
    @Managed(driver = "appium")
    WebDriver driver;
    public void app() throws MalformedURLException, InterruptedException {
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
            Thread.sleep(2000);

            driver.findElement(Locators.pref).click();

//            $(Locators.pref).click();

//            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
    }
    public void clickOnPreferenceDependencies()
    {
        driver.findElement(Locators.prefDependencies).click();
    }
public void clickWifi()
{
    driver.findElement(Locators.wifiCheckBox).click();
}
public void wifiSettingss()
{
    WebElement ele=driver.findElement(Locators.wifiSettings);
    ele.click();
    typeInto(element(Locators.wifiSettings),"Tushar Mahajan");
//    ele.sendKeys("Tushar Mahajan");

//    driver.findElement(Locators.wifiSettings).sendKeys("Tushar Mahajan");
}



}