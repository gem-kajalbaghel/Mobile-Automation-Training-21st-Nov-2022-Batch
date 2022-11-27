package UIPage;

//import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject;

public class DemoAppPage extends PageObject {

    public void selectPreference(){
        clickOn(element(Locators.option_preference));//PageObject method
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
}
