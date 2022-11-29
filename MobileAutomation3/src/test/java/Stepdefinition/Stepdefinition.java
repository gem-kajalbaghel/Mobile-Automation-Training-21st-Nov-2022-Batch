package Stepdefinition;

import Steps.Steps;
import UI.ClickAndSendkeys;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class Stepdefinition{
     Steps ui;

    @Given("^Launch application$")
    public void launch_application() throws MalformedURLException {
        ui.launch_application();
    }

    @Then("^Click on elements$")
    public void click() throws InterruptedException {
        ui.click_on();
    }
    @Then("^Type in an input$")
    public void type()
    {

        ui.type_in();
    }
}
