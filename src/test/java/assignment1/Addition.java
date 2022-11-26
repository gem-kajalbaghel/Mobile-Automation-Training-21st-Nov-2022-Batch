package assignment1;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;

public class Addition extends Healthapplication {

    public static void main(String[] args) throws Exception {
//        driver.findElement(by.id("com.bak.mnr.calculatrice:id/btn7"));
//        MobileElement seven = driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btn7"));
//        seven.click();

//        driver= (AppiumDriver) Healthapplication.Openapplication();
        Healthapplication.Openapplication();

//        MobileElement seven =driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btn7")).click();
       driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btn7")).click();
        driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btnP")).click();
        driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btn3")).click();
        driver.findElement(AppiumBy.id("com.bak.mnr.calculatrice:id/btnE")).click();
        Healthapplication.terminate();
    }
}