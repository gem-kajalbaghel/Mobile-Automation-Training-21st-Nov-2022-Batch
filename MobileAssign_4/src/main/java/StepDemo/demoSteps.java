package StepDemo;

import UiPage.stepperClass;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import java.net.MalformedURLException;

public class demoSteps extends PageObject {
    stepperClass stp;



    public void ApplicationOpen() throws MalformedURLException, InterruptedException {
        stp.openApp();
    }

    @Step("Accepting the alert")
    public void HandlingOfAlert() throws InterruptedException {
        stp.clickOnElemApp();
        stp.handlingAlert();
        stp.AcceptAlert();
    }

    @Step
    public void  longPressAction() throws InterruptedException {
     stp.longPress();
    }
}
