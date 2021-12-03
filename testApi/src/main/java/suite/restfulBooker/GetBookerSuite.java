package suite.restfulBooker;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "features/restful-booker/getBookingIds.feature",
        tags = "@feature=getbooking",
        glue = {"stepsdefinitions/restfulBooker/login"}
)
public class GetBookerSuite {
}
