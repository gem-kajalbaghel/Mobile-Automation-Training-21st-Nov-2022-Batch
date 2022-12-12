package Steps;

import UI.Scroll_Swipe;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;


public class step extends PageObject {
    Scroll_Swipe ss;
    @Step("Swipe handling")
    public void swipes() throws InterruptedException {
        ss.swipe();
    }

    @Step("Launch")
    public void launch() throws MalformedURLException, InterruptedException {
        ss.launch();
    }
    @Step("Click views")
    public void clickViews() throws InterruptedException {
        ss.clickViews();
    }
    @Step("Click gallery")
    public void clickGallery() throws InterruptedException {
        ss.clickGallery();
    }
    @Step("Click Photos")
    public void clickPhotos() throws InterruptedException {
        ss.clickPhotos();
    }
    @Step("Dropdown handling")
    public void dropdown() throws InterruptedException {
        ss.dropDown();
    }

    @Step("Scroll handling step")
    public void scroll() throws InterruptedException {
        ss.scrollfunc();
    }

    @Step("toast Message")
    public void toast() throws InterruptedException {
        ss.toastMessage();
    }
    @Step("Drag and drop")
    public void dragDrop() throws InterruptedException {
        ss.dragDropsbtn();
        ss.drop();
    }
}
