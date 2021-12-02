package suite.Location;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "features/API/CreateLocation.feature",
        tags = "@feature=creatlocation",
        glue = {"stepsdefinitions"}
)
public class CreateLocation {
}
