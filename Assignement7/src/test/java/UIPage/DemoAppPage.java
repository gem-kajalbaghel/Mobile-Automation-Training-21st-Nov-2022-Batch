package UIPage;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.URL;
import java.util.List;

import static java.time.Duration.ofSeconds;

//import net.serenitybdd.core.pages.PageObject;

public class DemoAppPage extends PageObject {
    AndroidDriver driver =(AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();


    public void launch_application() throws Exception {
        File apk = new File("D:\\Mobile_testing\\Mobile_automation\\app\\ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        AppiumDriverLocalService appiumServiceBuilder = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\sa.pandey1\\Downloads\\Appium_desktop\\Appium-Server-GUI-windows-1.22.3-4\\resources\\app\\node_modules\\appium\\lib\\main.js"))
                        .withIPAddress("http://127.0.0.1:4723/wd/hub").usingPort(4723).build();
        appiumServiceBuilder.start();

        capabilities.setCapability("deviceName","Pixel 6 API 30 2");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("app",apk.getAbsolutePath());
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("application lunched successfully");

    }
    public void selectPreference(){
//        clickOn(element(Locators.option_preference));//PageObject method
        $(Locator.option_preference).click();
    }
    public void selectPreferenceDependencies(){
        $(Locator.optionPreference_dependencies).click();// WebElementFacade method
    }
    public void selectWifiCheckBox(){
        $(Locator.checkbox_wifi).click();// WebElementFacade method
    }
    public void selectWifiSettings(){

        clickOn(element(Locator.option_wifiSettings));//PageObject method
    }
    public void enterWifiName(String wifiName){
//        $(Locators.input_wifiName).sendKeys(wifiName);
        typeInto(element(Locator.input_wifiName),wifiName);//PageObject method
    }
    public void clickOkButton(){
        clickOn(element(Locator.alert_OkButton));//PageObject method

        System.out.println("Test Completed!!!");
    }

    public void PerformLongPress() {
        clickOn(element(Locator.option_views));
        clickOn(element(Locator.optionViews_expandableList));
        clickOn(element(Locator.optionExpandableList_CustomAdapter));

        LongPressOptions longPressOptions = new LongPressOptions();

        WebElement peopleNames = driver.findElement(Locator.optionCustomAdapter_PeopleNames);

        longPressOptions.withDuration(ofSeconds(2)).withElement(ElementOption.element(peopleNames));

        TouchAction action = new TouchAction((PerformsTouchActions) driver);

        action.longPress(longPressOptions).perform().release();
    }

    public void performdropDownActivity() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));"));
        clickOn(element(Locator.optionviews_popMenu));
        clickOn(element(Locator.optionviews_popMenu_makeAPopup));

        List<WebElement> dropDown = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout//android.widget.TextView"));
        for (WebElement ele : dropDown) {
            System.out.println(ele.getText());
            if (ele.getText().equals("Search")) {
                ele.click();
                Thread.sleep(2000);
                break;
            }
        }
    }

    public void performswipe() throws InterruptedException{
            clickOn(driver.findElement(AppiumBy.accessibilityId("Gallery")));
            clickOn(driver.findElement(AppiumBy.accessibilityId("1. Photos")));
            WebElement img = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
            ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "elementId",((RemoteWebElement)img).getId(),
                    "direction","left",
                    "percent","1.0"
            ));

            Thread.sleep(2000);
        }
    public void scrollTest() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
    }
    public void longPressOption() throws InterruptedException {
        LongPressOptions lngPress = new LongPressOptions();
        lngPress.withDuration(ofSeconds(2)).withElement(ElementOption.element(driver.findElement(Locator.optionExpandableList_CustomAdapter)));
        TouchAction ac = new TouchAction((PerformsTouchActions) driver);
        ac.longPress(lngPress).release().perform();
        Thread.sleep(2000);
    }
    public void clickOnViewButton(){

        clickOn(element(Locator.option_views));//PageObject method
    }
    public void clickExpandable(){

        clickOn(element(Locator.optionViews_expandableList));//PageObject method
    }

    public void clickCustomAdapt(){
        clickOn(element(Locator.optionExpandableList_CustomAdapter));//PageObject method
    }

    public void getToastMessage() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"));"));
        clickOn(element(Locator.optionviews_popMenu));
        clickOn(element(Locator.optionviews_popMenu_makeAPopup));

        List<WebElement> dropDown = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout//android.widget.TextView"));
        for (WebElement ele : dropDown) {
            System.out.println(ele.getText());
            if (ele.getText().equals("Search")) {
                ele.click();
                Thread.sleep(2000);
                break;
            }
        }
        driver.findElement(Locator.optionviews_popMenu_makeAPopup).click();
        Thread.sleep(1000);

        driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout//android.widget.TextView")).click();
        Thread.sleep(2000);

        String msg = driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getText();

        System.out.println("Toast message - "+msg);

        Assert.assertEquals(msg,"Clicked popup menu item Search");
    }


    public void dragAndVerify(){
        clickOn(driver.findElement(Locator.optionView_dragAndDrop));
        WebElement sourceDrag = driver.findElement(Locator.sourceofDragItem);

        ((JavascriptExecutor)driver).executeScript("mobile: dragGesture",ImmutableMap.of(
                "elementId",((RemoteWebElement)sourceDrag).getId(),
                "endX",600,
                "endY",600
        ));

        String message = driver.findElement(Locator.DestinationOfDragDrop).getText();
        System.out.println(message);
        Assert.assertEquals("Dropped!",message);
    }
}
