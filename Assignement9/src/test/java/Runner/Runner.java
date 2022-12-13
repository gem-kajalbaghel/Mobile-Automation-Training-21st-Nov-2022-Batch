package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = "com.gemini.generic",
        plugin = {"html:target/cucumber.html","json:target/cucumber.json","pretty"},
        monochrome = true,
        publish = true,
        tags = "@GemWithSere"
)

public class Runner {
}
