package TestCase;

import Helpers.DataProviders;
import Helpers.Drivers;
import PageObject.BasePage;
import PageObject.EventPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.*;

public class CreateEvent {
    WebDriver driver;
    EventPage eventPage;
    @BeforeMethod
    public void setUp() {
        driver = new Drivers().getDriver();
    }
    @Test()
    public void createEvent() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("admin02@mailinator.com", "123456");
        eventPage = homePage.openEventPage();
        eventPage.openFormCreateEvent();
        eventPage.sleep(100);
//        eventPage.fillFormCreateEvent(data);
//        eventPage.checkCreateForm(data);
    }

//    @DataProvider(name = "testData")
//    protected Iterator<Object[]>dp() throws IOException {
//        List<HashMap<String, Object>> map  = DataProviders.parseExcel("src/test/resources/_data/demo.xlsx","loginncc");
//        Collection<Object[]> dp = new ArrayList<Object[]>();
//        for(HashMap<String, Object> r:map){
//            dp.add(new Object[]{map});
//        }
//        return dp.iterator();
//    }
    @AfterMethod
    public void tearDown(){
        eventPage.sleep(3);
        eventPage.driver.quit();
    }
}
