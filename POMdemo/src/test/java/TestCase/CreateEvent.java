package TestCase;

import Helpers.DataProviders;
import Helpers.Drivers;
import PageObject.EventPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class CreateEvent {
    WebDriver driver;
    EventPage eventPage;

    @BeforeMethod
    public void setUp() {
        driver = new Drivers().getDriver();
    }

    @Test(dataProvider = "testData")
    public void createEvent(HashMap<String, Object> data) {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("admin02@mailinator.com", "123456");
        eventPage = homePage.openEventPage();
        eventPage.openFormCreateEvent();
        eventPage.fillFormCreateEvent(data);
        eventPage.checkCreateForm(data);
        eventPage.sleep(100);
    }

    @DataProvider(name = "testData")
    protected Iterator<Object[]> dp() throws IOException {
        return DataProviders.parseExcel("src/test/resources/_data/Events.xlsx", "create event");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
