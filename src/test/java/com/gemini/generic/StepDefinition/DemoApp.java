package com.gemini.generic.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class DemoApp extends PageObject {

@Managed(driver = "appium")
    WebDriver driver;


@Given("^Launch the application$")
public void app() throws MalformedURLException, InterruptedException {
//    Thread.sleep(2000);
//    DesiredCapabilities cap = new DesiredCapabilities();
//
//    cap.setCapability("deviceName", "Pixel3");
//
//    cap.setCapability("udid", "emulator-5554");
//
//    cap.setCapability("platformName", "Android");
//
//    cap.setCapability("app","C:\\Users\\tu.mahajan\\AppData\\Local\\Android\\Sdk\\platform-tools\\ExpenseAppVer1.0.apk");
//
//    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    System.out.println("Launched application");

}
@When("^Check the application$")
public void check()
{
    System.out.println("Application is launched");
}

}