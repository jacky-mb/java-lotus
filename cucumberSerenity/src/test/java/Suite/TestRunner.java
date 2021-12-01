package Suite;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "features/RegisterAccount.feature",
        tags = "@feature=register",
        glue = {"stepdefinitions/Registerdef"}
)
public class TestRunner {
}
