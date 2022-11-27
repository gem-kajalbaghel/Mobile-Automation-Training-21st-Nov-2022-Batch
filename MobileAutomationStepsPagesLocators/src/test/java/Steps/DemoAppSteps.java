package Steps;

import UIPage.DemoAppPage;
import net.thucydides.core.annotations.Step;

public class DemoAppSteps {

    DemoAppPage demoAppPageSteps;

    @Step("^Click on Preference")
    public void preference(){
        demoAppPageSteps.selectPreference();
        demoAppPageSteps.selectPreferenceDependencies();
        demoAppPageSteps.selectWifiCheckBox();
        demoAppPageSteps.selectWifiSettings();
        demoAppPageSteps.enterWifiName("Some_Random_Wifi");
        demoAppPageSteps.clickOkButton();
    }

}
