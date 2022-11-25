package Steps;

import UiPage.Demo2;
import net.thucydides.core.pages.PageObject;

import java.net.MalformedURLException;

public class Demo2Steps extends PageObject {


    Demo2 genf;

    public void perfectoSteps() throws MalformedURLException, InterruptedException {
        genf.app();
    }

}
