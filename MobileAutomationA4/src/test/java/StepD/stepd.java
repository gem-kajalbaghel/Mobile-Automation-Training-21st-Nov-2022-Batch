package StepD;

import Steps.step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class stepd {
    step steps;
    @Then("^Long press activity$")
    public void longpress()
    {
        steps.longPress();
    }
    @Then("^Alert handling$")
    public void alert() throws InterruptedException {
        steps.alert();
    }
    @Given("^Launch application$")
    public void launch() throws MalformedURLException, InterruptedException {
        steps.launch();
    }
}
