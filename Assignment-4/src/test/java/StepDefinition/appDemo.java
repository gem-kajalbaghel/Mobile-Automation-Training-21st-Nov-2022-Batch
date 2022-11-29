package StepDefinition;
import Steps.appSteps;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;

import static java.time.Duration.ofSeconds;

public class appDemo extends PageObject {
    @Steps
     appSteps runStep;

    @Given("^Launch application$")
    public void Launch() throws MalformedURLException {
        appSteps.launchApp();
    }

    @When("^click on preference option$")
    public void preference() throws InterruptedException {
        Thread.sleep(2000);
        runStep.optionSelect();
        runStep.prefDepencies();
        runStep.wifiCheckBox();
        runStep.wifiSetting();
    }

    @When("^Click on Alert$")
    public void alertDialogue() throws InterruptedException {
        runStep.appOption();
        runStep.alertDialogue();
        runStep.alertFirst();
        runStep.pressOkbtn();
    }

    @When("^Run Longpress button$")
    public void longpress() throws InterruptedException {
        runStep.pressViewsbtn();
        runStep.pressExListbtn();
        runStep.pressCustomAdaptBtn();
        runStep.longpressFirstOption();


    }
}
