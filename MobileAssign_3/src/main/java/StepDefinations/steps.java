package StepDefinations;

import UiPage.stepperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class steps  extends PageObject {

    stepperClass stp;
    @Given("step to intialize the app")
    public void callStepper() throws MalformedURLException, InterruptedException {
//        System.out.println("AAA");
        stp.openApp();

    }
    @Then("click on app element")
    public void ClickOnAppElement() throws InterruptedException {

        stp.clickOnElemApp();
    }

    @Then("click on Search element")
    public void ClickOnSearchElement() throws InterruptedException {

        stp.clickOnElemSearch();
    }
    @Then("click on invoke Search")
    public void ClickOnInvokeSearch()
    {
        stp.clickOnElemInvokeSearch();
    }
    @And("send data in search")
    public void SendDataToSearch()
    {
        stp.sendDataForSeacrh();
    }

}
