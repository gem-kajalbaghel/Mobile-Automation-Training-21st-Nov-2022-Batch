package com.gemini.generic.Steps;

import com.gemini.generic.UiPage.Demo2;
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

    @Step("Click on Gallery")
    public void Gallery() throws InterruptedException {
        Thread.sleep(2000);
        genf.clickGallery();
    }

    @Step("Click on Photos")
    public void Photos() throws InterruptedException {
        Thread.sleep(2000);
        genf.clickPhotos();
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

@Step("Swipe handling")
public void swipes() throws InterruptedException {
    genf.swipe();
}


@Step("Dropdown handling")
    public void drpdwn() throws InterruptedException {
    genf.dropDown();
}

@Step("^Scroll handling step$")
    public void scrol() throws InterruptedException {
    genf.scrollfunc();
}

@Step("^toast Message$")
    public void toast() throws InterruptedException {
    genf.toastMessage();
}
@Step("Drg and drop")
public void dragDrop() throws InterruptedException {
genf.dragDropsbtn();
    genf.drop();
    }

@Step("Enter Name")
public void namess() throws InterruptedException {
    genf.login();
genf.validateLogin();
    }
@Step("Jordan")
    public void jordans()
{
    genf.openJordanRetro();
}

}