package Stepdefinition;

import UI.Launch;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class Stepdefinition extends PageObject {
    Launch launch;
    @When("Launch application")
    public void launch_application() throws MalformedURLException {
        launch.launch_the_application();
    }
}
