package Steps;

import Locators.Locator;
import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import java.util.Locale;


public class StepDefinition {

    @Step
    @When("Mention all Details and Enter into Application")
    public void mention_all_details_and_enter_into_application() {
        MobileAction.takeSnapShot();
        MobileAction.typeText(Locator.name_input,"Hello");
        MobileAction.takeSnapShot();
        MobileAction.click(Locator.letsShopButton);
        MobileAction.takeSnapShot();

        System.out.println("Primary Details Entered");
    }
    @Step
    @Then("Order First Item")
    public void order_first_item() {
        MobileAction.takeSnapShot();
        MobileAction.click(Locator.addToCart_option);
        MobileAction.takeSnapShot();
        MobileAction.click(Locator.cartButton);
        MobileAction.takeSnapShot();
        MobileAction.click(Locator.sendEmailOnDiscounts_CheckBox);
        MobileAction.takeSnapShot();
        MobileAction.click(Locator.letsProceedForPurchase);
        MobileAction.takeSnapShot();

        System.out.println("Order Placed Successfully!!!");
    }

    @When("Enter details for login username {string} and country {string}")
    public void enter_details_for_login_username_and_country(String username, String countryName) {
       enterName(username,countryName);
    }

    public void website()
    {
        MobileAction.click(Locator.website,"Visit website");
    }

    @Step("Enter Details")
    public void enterName(String username,String countryName) {
        login(username,countryName);
        String title = MobileAction.getElementText(Locator.title);
        if(title.equals("Products"))
            System.out.println("Successfully logged in");
        else
            System.out.println("login Failed");
    }

    @Step
    @Given("Launch general store App")
    public void openApp() {

        System.out.println("Application Launched!\n "+ MobileDriverManager.getAppiumDriver());
    }
    @Then("click on shoes {string}")
    public void click_on_shoes(String shoesNAme) {
        MobileAction.scrollToElement(shoesNAme, true);
        addToCart();
        if(MobileAction.getElementText(Locator.productCart).contains("Nike"))
            System.out.println("Item successfully added to cart");
        else
            System.out.println("Failed to add to cart");
    }

    @Then("Order the selected item")
    public void order_the_selected_item() {
        MobileAction.click(Locator.sendEmailOnDiscounts_CheckBox,"Clicked on checkBox to purchase item");
        MobileAction.click(Locator.letsProceedForPurchase,"Clicked on lets proceed button");
    }
    @Step
    public void login(String username,String country) {
        MobileAction.typeText(Locator.name_input, username, "Enter Username");
        MobileAction.waitSec(1);
        MobileAction.click(Locator.selectCountryDropdown, "Select from country DropDown");
        MobileAction.waitSec(1);
        MobileAction.click(AppiumBy.xpath(Locator.selectCountryByname.replace("<text>",country)), "Select Country: Angola");
        MobileAction.waitSec(1);
        MobileAction.click(Locator.maleButton, "Select Gender : Male");
        MobileAction.click(Locator.loginButton, "Click on Submit button");
    }
    @Step
    public void addToCart(){
        MobileAction.click(Locator.productsAddtoCart,"Add Shoes to cart");
        MobileAction.waitSec(2);
        MobileAction.click(Locator.cartButton,"Click on cart");
        MobileAction.waitSec(2);
    }

}
