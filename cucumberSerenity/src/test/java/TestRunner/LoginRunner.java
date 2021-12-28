package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "features/K12/LoginK12.feature",
        tags = "@feature=logink12",
        glue = "stepdefinitions/K12/Login"
)
public class LoginRunner {
}
