package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "features/CreateNewTask.feature",
        tags = "@feature=createNewTask",
        glue = "stepdefinitions/AddTask"
)
public class AddTask {
}
