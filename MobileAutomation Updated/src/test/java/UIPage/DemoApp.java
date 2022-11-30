package UIPage;

import net.serenitybdd.core.pages.PageObject;

public class DemoApp extends PageObject {

        public void selectPreference(){
            clickOn(element(Locators.option_preference));
        }
        public void selectPreferenceDependencies(){
            $(Locators.optionPreference_dependencies).click();
        }
        public void selectWifiCheckBox(){
            $(Locators.checkbox_wifi).click();
        }
        public void selectWifiSettings(){
            clickOn(element(Locators.option_wifiSettings)); }
        public void enterWifiName(String wifiName){

            typeInto(element(Locators.input_wifiName),wifiName);
        }
        public void clickOkButton(){
            clickOn(element(Locators.alert_OkButton));

            System.out.println("Done");
        }
    }
