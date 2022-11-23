package org.example;


import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import javax.lang.model.element.Element;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
     public static AndroidDriver and;
    public static void openApplication_Calculator() throws MalformedURLException {
        File app_calc= new File(System.getProperty("user.dir")+"\\app\\calculatorsample (2).apk");


        DesiredCapabilities dc=new DesiredCapabilities();
         dc.setCapability("devicenname","Android Emulator");
         dc.setCapability("udid","emulator-5554");
         dc.setCapability("platformName","Android");
         dc.setCapability("platformVersion","13.0");

         //setting the application configurations
         dc.setCapability("app",app_calc.getAbsolutePath());
         and=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),dc); //this can throw an exception

        //verify application is launched
        System.out.println("Application is launched");

    }
    public static void main(String[] args) throws MalformedURLException {

        openApplication_Calculator();

    }
}