package StepDefinition;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
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
    @Then("^click on Gallery$")
    public void gallery() throws InterruptedException {
        run.Gallery();
        System.out.println("End");
    }

    @Then("^click on Photos$")
    public void photo() throws InterruptedException {
        run.Photos();
    }

    @And("Swipe the element")
    public void swipess() throws InterruptedException {
        run.swipes();
    }
    @And("^dropdown to element$")
    public void drp() throws InterruptedException {
        run.drpdwn();
    }

    @And("^scroll function$")
    public void scrolls() throws InterruptedException {
        run.scrol();
    }

@Then("^check toast message$")
public void launchingPreference() throws InterruptedException {
run.toast();
}

@Then("^click on drag drop btn$")
    public void dragDropps() throws InterruptedException {
    run.dragDrop();
}

}