package StepDefinition;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import Steps.Demo2Steps;

import java.net.MalformedURLException;

public class PerfectoApk extends PageObject {

    @Steps
    Demo2Steps run;


    @Given("Launch Perfecto application")
    public void Launch() throws MalformedURLException, InterruptedException {
        run.perfectoSteps();
    }


}
