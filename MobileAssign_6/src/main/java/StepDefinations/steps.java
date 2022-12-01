package StepDefinations;

import StepDemo.demoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class steps  extends PageObject {
    demoSteps st ;


    @Given("step to initialize the app")
    public void step_to_initialize_the_app() throws MalformedURLException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        st.ApplicationOpen();
    }



    @Then("handling alert")
    public void handleAlert() throws InterruptedException {
        st.HandlingOfAlert();

    }

    @Then("Long press event")
    public void longPressEvent() throws InterruptedException {

        st.longPressAction();

    }
    @Then("check scrolling functionality")
    public void scroll()
    {
        st.scrolling();
    }
    @Then("check swipe functionality and drag and drop")
    public void swipe() throws InterruptedException {
        st.swipping();
    }

    @Then("check dropdown functionality and toast message")
    public void dropDown() throws InterruptedException {
        st.dropDownFunc();

    }

}
