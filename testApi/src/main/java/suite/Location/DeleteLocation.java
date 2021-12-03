package suite.Location;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "features/API/DeleteLocation.feature",
        tags = "@feature=deleteLocation",
        glue = {"stepsdefinitions/Location"}
)
public class DeleteLocation {
}
