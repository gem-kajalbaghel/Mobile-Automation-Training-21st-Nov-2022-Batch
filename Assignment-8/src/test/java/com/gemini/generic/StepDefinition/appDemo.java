package com.gemini.generic.StepDefinition;
import com.gemini.generic.MobileDriverManager;
import com.gemini.generic.Steps.appSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @When("^Scroll to Element$")
    public void scroll() throws InterruptedException {
        runStep.pressViewsbtn();
        runStep.scrollToElement();
    }

    @When("^Swipe to Element$")
    public void swipe() throws InterruptedException {
        runStep.pressViewsbtn();
        runStep.swipeToElement();
    }

    @When("^Perform Element Dropdown$")
    public void dropdown() throws InterruptedException {
        runStep.pressViewsbtn();
        runStep.dropDownElement();
        runStep.verifydrpdownclick();
    }

    @When("^Verify drag and drop$")
    public void dragDrop() throws InterruptedException {
        runStep.pressViewsbtn();
        runStep.dragDrop();

    }

    @Given("Launch general store App")
    public void openApp() {

        System.out.println("Application Launched!\n "+ MobileDriverManager.getAppiumDriver());
    }

    @When("Enter details for login")
    public void details()  {

//        runStep.enterName();      //MobileAction
        runStep.enterDetail();      //Serenity
    }

    @Then("click on shoes")
    public void shoes()
    {
//        runStep.shoes();            //MobileAction
        runStep.addShoes();             //serenity
    }



}
