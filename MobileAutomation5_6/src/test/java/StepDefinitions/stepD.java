package StepDefinitions;
import net.thucydides.core.annotations.Steps;
import Steps.step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class stepD  {

  @Steps
  step step;
    @Given("^Launch application$")
    public void launch() throws MalformedURLException, InterruptedException {
        step.launch();
    }
    @When("^Open views/Gallery/Photos$")
    public void open() throws InterruptedException {
       step.clickViews();
       step.clickGallery();
       step.clickPhotos();
    }
    @When("^Open views$")
    public void open1() throws InterruptedException {
        step.clickViews();
    }
    @Then("^dropdown to element$")
    public void drop() throws InterruptedException {
        step.dropdown();
    }
    @Then("^scroll function$")
    public void scroll() throws InterruptedException {
        step.scroll();
    }
    @Then("Perform swipe action")
    public void swipe() throws InterruptedException {
        step.swipes();
    }
    @Then("^check toast message$")
    public void toast() throws InterruptedException {
        step.toast();
    }

    @Then("^click on drag drop button$")
    public void dragDrop() throws InterruptedException {
        step.dragDrop();
    }
}
