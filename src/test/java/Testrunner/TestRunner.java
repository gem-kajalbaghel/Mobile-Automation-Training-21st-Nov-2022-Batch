package Testrunner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "Stepdefination",
        features = "src/test/resources/features",
        monochrome = true
)

public class TestRunner {

}
