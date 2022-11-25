package UiPage;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class stepperClass extends PageObject {
//    static AndroidDriver and=null;

@Managed(driver = "appium")
    WebDriver driver;

    public void openApp() throws MalformedURLException {
        File app_calc= new File(System.getProperty("user.dir")+"\\app\\calculatorsample (2).apk");


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
    }
    }


