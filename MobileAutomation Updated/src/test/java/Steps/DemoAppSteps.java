package Steps;

import UIPage.DemoApp;
import net.thucydides.core.annotations.Step;

public class DemoAppSteps {
    DemoApp demoAppPageSteps;

    @Step("^Click on Preference")
    public void preference(){
        demoAppPageSteps.selectPreference();
        demoAppPageSteps.selectPreferenceDependencies();
        demoAppPageSteps.selectWifiCheckBox();
        demoAppPageSteps.selectWifiSettings();
        demoAppPageSteps.enterWifiName("Ananya001");
        demoAppPageSteps.clickOkButton();
    }

}

