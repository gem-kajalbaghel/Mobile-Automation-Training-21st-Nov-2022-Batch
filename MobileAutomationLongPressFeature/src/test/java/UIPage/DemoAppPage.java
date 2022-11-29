package UIPage;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import static java.time.Duration.ofSeconds;


public class DemoAppPage extends PageObject {

    AndroidDriver driver =(AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();

    public void selectPreference(){
//        clickOn(element(Locators.option_preference));//PageObject method
        $(Locators.option_preference).click();
    }
    public void selectPreferenceDependencies(){
        $(Locators.optionPreference_dependencies).click();// WebElementFacade method
    }
    public void selectWifiCheckBox(){
        $(Locators.checkbox_wifi).click();// WebElementFacade method
    }
    public void selectWifiSettings(){

        clickOn(element(Locators.option_wifiSettings));//PageObject method
    }
    public void enterWifiName(String wifiName){
//        $(Locators.input_wifiName).sendKeys(wifiName);
        typeInto(element(Locators.input_wifiName),wifiName);//PageObject method
    }
    public void clickOkButton(){
        clickOn(element(Locators.alert_OkButton));//PageObject method

        System.out.println("Test Completed!!!");
    }

    public void LongPressFeature(){
        clickOn(element(Locators.option_views));
        clickOn(element(Locators.optionViews_expandableList));
        clickOn(element(Locators.optionExpandableList_CustomAdapter));

        LongPressOptions longPressOptions = new LongPressOptions();

        WebElement peopleNames = driver.findElement(Locators.optionCustomAdapter_PeopleNames);

        longPressOptions.withDuration(ofSeconds(2)).withElement(ElementOption.element(peopleNames));

        TouchAction action = new TouchAction((PerformsTouchActions) driver);

        action.longPress(longPressOptions).perform().release();

    }
}
