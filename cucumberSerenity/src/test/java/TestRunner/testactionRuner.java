package TestRunner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "features/testaction.feature",
        tags = "@feature=action",
        glue = {"stepdefinitions/test"}
)


public class testactionRuner {
}
