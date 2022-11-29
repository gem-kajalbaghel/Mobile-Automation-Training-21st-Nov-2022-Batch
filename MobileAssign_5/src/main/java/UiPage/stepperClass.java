package UiPage;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class stepperClass extends PageObject {
//    static AndroidDriver and=null;

@Managed(driver = "appium")
    WebDriver driver;
//    AndroidDriver and_driver = (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();

    public void openApp() throws MalformedURLException, InterruptedException {
        File app_calc= new File(System.getProperty("user.dir")+"\\app\\ApiDemos-debug.apk");


        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("devicenname","Android Emulator");
        dc.setCapability("udid","emulator-5554");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","13.0");

        //setting the application configurations
        dc.setCapability("app",app_calc.getAbsolutePath());
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),dc); //this can throw an exception

        //verify application is launched
        System.out.println("Application is launched");
        Thread.sleep(5000);
    }

    public void clickOnElemApp() throws InterruptedException {
        clickOn(driver.findElement(Locators.app));

    }
//


    public void handlingAlert() {
        clickOn(driver.findElement(Locators.alert));
        clickOn(driver.findElement(Locators.alertFirstOption));


    }
    public void AcceptAlert()
    {
        clickOn(driver.findElement(Locators.okBtn));
    }

    public void longPress() throws InterruptedException {

        clickOn(driver.findElement(Locators.views));
        clickOn(driver.findElement(Locators.expendableList));
        clickOn(driver.findElement(Locators.cusAdapter));




        LongPressOptions lngPress=new LongPressOptions();
        lngPress.withDuration(ofSeconds(2)).withElement(ElementOption.element(driver.findElement(Locators.names)));
        TouchAction ac=new TouchAction((PerformsTouchActions) driver);
        ac.longPress(lngPress).release().perform();
        Thread.sleep(2000);
    }

    public void scrollFunc() {
        clickOn(driver.findElement(Locators.views));

       driver.findElement(Locators.scrollDown);  //find is not working
//       find(Locators.scrolloDown); --> find null pointer exception
    }

    public void swipeFunc() throws InterruptedException {
      Thread.sleep(2000);
        clickOn(driver.findElement(Locators.views));

        clickOn(driver.findElement(Locators.gallery));
        clickOn(driver.findElement(Locators.firstImgOption));

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(Locators.img1)).getId(),
                "direction", "left",
                "percent", 0.95
        ));

    }

    public void dropDownFunction() throws InterruptedException {
        clickOn(driver.findElement(Locators.views));
        clickOn(driver.findElement(Locators.popupMenu));
        clickOn(driver.findElement(Locators.makeApopUp));

//        thenReturnElementList(Locators.listOfELems);  --> gives null pointer exception
          Thread.sleep(2000);
//        System.out.println( thenReturnElementList(Locators.listOfELems));
          List<WebElement> elems= driver.findElements(Locators.listOfELems);


           for(WebElement elem:elems)
          {
              if(elem.getText().equals("Search"))
              {
                  clickOn(elem);
                  break;
              }


          }
    }
}


