package TestRunner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "features/CreateNewEvent.feature",
        tags = "@feature=createEvent",
        glue = {"stepdefinitions/AddEvent"}
)
public class AddEventSuite {

}

