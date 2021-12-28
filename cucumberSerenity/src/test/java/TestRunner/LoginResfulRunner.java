package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "features/RestfulBooker/login.feature",
        tags = "@feature=loginResfulBooker",
        glue = "stepdefinitions/RestfulBooker"
)
public class LoginResfulRunner {
}
