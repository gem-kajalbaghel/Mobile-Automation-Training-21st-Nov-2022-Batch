package Steps;

import UiPage.Demo2;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
//import net.thucydides.core.pages.PageObject;
import java.net.MalformedURLException;

public class Demo2Steps extends PageObject {
    Demo2 genf;
    @Step("Launch app")
    public void AppSteps() throws MalformedURLException, InterruptedException {
        genf.app();
    }




    @Step("Click on Preference from settings")
    public void option() throws InterruptedException {
        genf.clickOnOption();
//        genf.clickOnPreferenceDependencies();
    }

    @Step("Click on Preference dependencies from settings")
    public void prefDepencies() throws InterruptedException {

        genf.clickOnPreferenceDependencies();
    }
@Step("Click on wifi checkbox")
public void wifiCheckBox() throws InterruptedException {

    genf.clickWifi();
}
    @Step("Click on wifi Settings")
    public void wifiSett() throws InterruptedException {

        genf.wifiSettingss();
    }

    @Step("click on views")
    public void views() throws InterruptedException {
        Thread.sleep(2000);
genf.clickView();
    }

    @Step("click on Expandable option")
    public void expan()
    {
        genf.clickexpandable();
    }

    @Step("click on custom adaptor option")
    public void customAdaptor()
    {
        genf.customAdaptorss();
    }


@Step("Longpress step")
    public void longpress()
{
    genf.people();
}
@Step("Alert Handling")
    public void alert() throws InterruptedException {
    genf.alert();
}




}