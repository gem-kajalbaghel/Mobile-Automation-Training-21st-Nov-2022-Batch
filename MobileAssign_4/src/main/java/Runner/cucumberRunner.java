package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/main/resources/Features"
        ,glue ="StepDefinations"
        ,tags="@Test1"

)
public class cucumberRunner {}