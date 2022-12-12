package com.gemini.generic.StepDefinitions;

import com.gemini.generic.Steps.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepD {
    steps step;
    @When("^User logins$")
    public void login()
    {
        step.login();
    }
    @Then("^Validate login$")
    public void val_login()
    {
        step.login_val();
    }
    @When("^Open product$")
            public void open_product()
    {
        step.open_product();
    }
    @Then("^User adds product to cart$")
    public void add_cart()
    {
        step.add_to_cart();
    }
    @And("^Validate item is added to cart$")
    public void val_cart()
    {
        step.cart_val();
    }
    @Then("^Open website to purchase$")
    public void website()
    {
        step.open_website();
    }
}
