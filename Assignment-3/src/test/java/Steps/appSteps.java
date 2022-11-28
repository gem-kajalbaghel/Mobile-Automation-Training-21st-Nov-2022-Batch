package Steps;

import UiPage.app;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;

public class appSteps extends PageObject {
    static app appStep;

    @Step("Launch the application")
    public static void launchApp() throws MalformedURLException {
        appStep.main();
    }
    @Step("Click on Preferences")
    public void optionSelect() throws InterruptedException {
        appStep.clickPref();
    }

    @Step("Click on Preference dependencies")
    public void prefDepencies() throws InterruptedException {

        appStep.clickOnPrefDepend();
    }

    @Step("click on wifi checkbox")
    public void wifiCheckBox() throws InterruptedException {

        appStep.wificheck();
    }

    @Step("Type into wifi Settings")
    public void wifiSetting() throws InterruptedException {

        appStep.wifiText();
    }


}
