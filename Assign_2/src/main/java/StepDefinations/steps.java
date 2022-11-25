package StepDefinations;

import UiPage.stepperClass;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class steps  extends PageObject {

    stepperClass stp;
    @Given("step to intialize the app")
    public void callStepper() throws MalformedURLException {
        System.out.println("AAA");
        stp.openApp();

    }
}
