package Steps;

import UiPage.app;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;

public class appSteps extends PageObject {
    static app appStep;

    @Step("Launch the application")
    public static void launchApp() throws MalformedURLException {
        appStep.main();
    }

    @Step("Click on Preferences")
    public void optionSelect() throws InterruptedException {
        appStep.clickPref();
    }

    @Step("Click on Preference dependencies")
    public void prefDepencies() throws InterruptedException {

        appStep.clickOnPrefDepend();
    }

    @Step("click on wifi checkbox")
    public void wifiCheckBox() throws InterruptedException {

        appStep.wificheck();
    }

    @Step("Type into wifi Settings")
    public void wifiSetting() throws InterruptedException {

        appStep.wifiText();
    }

    @Step("Open App Option")
    public void appOption() throws InterruptedException {

        appStep.clickOnApp();
    }

    @Step("Click on Alert Dialogues")
    public void alertDialogue() throws InterruptedException {

        appStep.clickOnAlert();
    }

    @Step("Click on Alert option")
    public void alertFirst() throws InterruptedException {

        appStep.firstOptAlert();
    }

    @Step("Click on Ok option")
    public void pressOkbtn() throws InterruptedException {

        appStep.pressOk();
    }

    @Step("Click on Views option")
    public void pressViewsbtn() throws InterruptedException {

        appStep.clickView();
    }

    @Step("Click on Expandable List option")
    public void pressExListbtn() throws InterruptedException {

        appStep.clickExpandable();
    }

    @Step("Click on custom adapt option")
    public void pressCustomAdaptBtn() throws InterruptedException {

        appStep.clickCustomAdapt();
    }

    @Step("lonpress first option")
    public void longpressFirstOption() throws InterruptedException {

        appStep.longPressOption();
    }

    @Step("Scroll to Element")
    public void scrollToElement() throws InterruptedException {

        appStep.scrollTest();
    }

    @Step("Swipe to Element")
    public void swipeToElement() throws InterruptedException {

        appStep.swipeTest();
    }

    @Step("Perform Element Dropdown")
    public void dropDownElement() throws InterruptedException {

        appStep.dropDown();
    }

    @Step("Verify DropDown Element click")
    public void verifydrpdownclick() {

        appStep.valToastAfterDropDown();
    }

    @Step("Verify drag and drop")
    public void dragDrop() {

        appStep.dragAndVerify();
    }


}
