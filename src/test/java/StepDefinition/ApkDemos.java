package StepDefinition;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.pages.PageObject;
import Steps.Demo2Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApkDemos extends PageObject
{

    @Managed(driver = "appium")
    WebDriver driver;
    @Steps
    Demo2Steps run;

    @Given("^Launch application$")
    public void Launch() throws MalformedURLException, InterruptedException {
run.AppSteps();
        }


@When("^click on preference option$")
    public void preference() throws InterruptedException {
    Thread.sleep(2000);
    run.option();
    run.prefDepencies();
    run.wifiCheckBox();
    run.wifiSett();
//    run.
}

@When("^click on views$")
    public void views() throws InterruptedException {
    Thread.sleep(2000);
    run.views();
}

@Then("^click on expandable List$")
    public void expandable(){
run.expan();
}

@Then("^click on custom adaptor$")
public void custom()
{
    run.customAdaptor();
}

    @Then("^Longpress on people name$")
public void people()
    {
run.longpress();
    }
    @Then("^Navigate to alert and cancel the alert$")
    public void alert() throws InterruptedException {
        run.alert();
    }


//@Then("^click on Launching preference$")
//public void launchingPreference()
//{
//
//}

}