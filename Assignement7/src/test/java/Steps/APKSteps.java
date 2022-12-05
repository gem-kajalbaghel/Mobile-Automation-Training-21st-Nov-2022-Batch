package Steps;

import UIPage.DemoAppPage;
import net.thucydides.core.annotations.Step;

public class APKSteps {

    DemoAppPage demoAppPage ;



@Step("^Click on Preferences$")
    public void preferences(){
    demoAppPage.selectPreference();
    demoAppPage.selectPreferenceDependencies();
    demoAppPage.selectWifiCheckBox();
    demoAppPage.selectWifiSettings();
    demoAppPage.enterWifiName("sandeep");
    demoAppPage.clickOkButton();
}

@Step("^Enter name of wifi$")
    public void enterWifiName(){
    demoAppPage.enterWifiName("sandeep");
    demoAppPage.clickOkButton();
}
@Step("^Close the application$")
    public void closeApplication(){
    System.out.println("test ended");
}
    @Step("^Long Press Feature Check")
    public void LongPressFeatureStep(){
        demoAppPage.PerformLongPress();
        System.out.println("Successfully perform long press ");
    }
    @Step("^Closing the Application$")
    public void closeApp(){
        System.out.println("Application Closing");
    }

    @Step("Perform Element Dropdown")
    public void dropDownElement() throws InterruptedException {

        demoAppPage.performdropDownActivity();
    }
    @Step("Swipe to Element")
    public void swipeToElement() throws InterruptedException {

        demoAppPage.performswipe();
    }
    @Step("Scroll to Element")
    public void scrollToElement() throws InterruptedException {

        demoAppPage.scrollTest();
    }
    @Step("Click on Views option")
    public void clickViewsbtn() throws InterruptedException {

        demoAppPage.clickOnViewButton();
    }

    @Step("Click on Expandable List option")
    public void ClickExListbtn() throws InterruptedException {

        demoAppPage.clickExpandable();
    }
    @Step("Click on custom adapt option")
    public void clickCustomAdaptBtn() throws InterruptedException {

        demoAppPage.clickCustomAdapt();
    }

    @Step("Get Toast message")
    public void getToastmessage1() throws InterruptedException {
        demoAppPage.clickOnViewButton();
        demoAppPage.getToastMessage();
    }
    @Step("Verify drag and drop")
    public void dragDrop() {
        demoAppPage.clickOnViewButton();
        demoAppPage.dragAndVerify();
    }
}
