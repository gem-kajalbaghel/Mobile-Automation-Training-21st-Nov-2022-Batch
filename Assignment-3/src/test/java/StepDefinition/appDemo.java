package StepDefinition;
import Steps.appSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;

public class appDemo extends PageObject {
    @Steps
    static appSteps runStep;

    @Given("^Launch application$")
    public void Launch() throws MalformedURLException {
        appSteps.launchApp();
    }

    @When("^click on preference option$")
    public void preference() throws InterruptedException {
//        Thread.sleep(2000);
        runStep.optionSelect();
        runStep.prefDepencies();
        runStep.wifiCheckBox();
        runStep.wifiSetting();
    }
}
