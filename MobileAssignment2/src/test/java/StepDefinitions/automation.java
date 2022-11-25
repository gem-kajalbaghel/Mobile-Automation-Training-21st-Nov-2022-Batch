package StepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class automation {
    public static AppiumDriver driver=null;

    @Given("^Launch the application$")
    public static WebDriver main() throws MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","Android Emulator");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("app","C:\\Users\\sh.bajaj\\AppData\\Local\\android\\Sdk\\platform-tools\\calculatorsample.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,cap);
        return driver;
    }

    @Then("^validate launch$")
    public static void checkLaunch(){
        System.out.println("The Application is launched");
    }


}
