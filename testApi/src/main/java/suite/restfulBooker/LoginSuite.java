package suite.restfulBooker;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "features/restful-booker/login.feature",
        tags = "@feature==login",
        glue = {"stepsdefinitions/restfulBooker/login"}
)

public class LoginSuite {
}
