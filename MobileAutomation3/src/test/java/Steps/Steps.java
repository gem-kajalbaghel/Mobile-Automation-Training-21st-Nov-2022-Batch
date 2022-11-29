package Steps;

import UI.ClickAndSendkeys;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

import java.net.MalformedURLException;

public class Steps extends PageObject {
     ClickAndSendkeys clickAndSendkeys;
    @Step("Launch application")
    public void launch_application() throws MalformedURLException {
        clickAndSendkeys.launch_the_application();
    }
    @Step("Click on elements")
    public void click_on() throws InterruptedException {
        clickAndSendkeys.clickOn();
    }
    @Step("Type in an input")
    public void type_in() {

        clickAndSendkeys.typeInto();
    }
}
