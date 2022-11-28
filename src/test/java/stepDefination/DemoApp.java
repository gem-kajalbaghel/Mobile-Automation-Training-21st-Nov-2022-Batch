package stepDefination;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoApp extends PageObject {

    @Managed(driver = "appium")
    WebDriver driver;



    @Given("^Launching the application$")
    public void launching_the_application() {
        File apk = new File("D:\\Mobile_testing\\Mobile_automation\\app\\ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","Pixel 6 API 30 2");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11.0");
        // System.out.println(apk.getAbsoluteFile());
        capabilities.setCapability("app",apk.getAbsolutePath());
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (MalformedURLException exception){
            System.out.println("getting exception");
            exception.printStackTrace();
        }
        System.out.println("application lunched successfully");

    }
}

