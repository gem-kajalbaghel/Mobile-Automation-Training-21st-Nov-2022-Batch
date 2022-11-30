package Steps;

import UI.alerts_longpress;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import java.net.MalformedURLException;

public class step extends PageObject {
    alerts_longpress al;

    @Step("^Alert Handling$")
    public void alert() throws InterruptedException {
        al.alert();
        al.AcceptAlert();
    }
    @Step("^Long Press$")
    public void longPress()
    {
        al.long_press();
    }
    @Step("^Launch Application$")
    public void launch() throws MalformedURLException, InterruptedException {
        al.launch();
    }
}
