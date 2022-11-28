package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import Steps.Demo2Steps;

import java.net.MalformedURLException;

public class ApkDemos extends PageObject
{
    @Steps
    Demo2Steps run;

    @Given("^Launch application$")
    public void Launch() throws MalformedURLException, InterruptedException {
        run.AppSteps();}

@When("^click on preference option$")
    public void preference() throws InterruptedException {
    Thread.sleep(2000);
    run.option();
    run.prefDepencies();
    run.wifiCheckBox();
    run.wifiSett();
//    run.
}

//@Then("^click on Launching preference$")
//public void launchingPreference()
//{
//
//}

}