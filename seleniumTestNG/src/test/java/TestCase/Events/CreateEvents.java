package TestCase.Events;

import Helpers.DataProviders;
import Helpers.Drivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import stepdefinitions.Events.CreateEventsSteps;
import stepdefinitions.Login.LoginSteps;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//public class CreateEvents {
//    public WebDriver driver;
//    public CreateEventsSteps createEventsSteps ;
//    @BeforeMethod
//    public void setUp(){
//        driver = new Drivers("chrome").getDriver();
//        createEventsSteps = new CreateEventsSteps(driver);
//    }
//    @Test(dataProvider = "data")
//    public void createNewEvent(Map<String, String> map) throws InterruptedException {
//        createEventsSteps.openFormInputEvents();
//        createEventsSteps.fillFields(map);
//        Thread.sleep(100000);
//    }
//    @DataProvider(name = "data")
//    protected Iterator<Object[]> dp() throws IOException {
//        String path = "src/test/resources/_data/Events.xlsx";
//        String sheetName = "create event";
//        return DataProviders.parseExcel(path,sheetName);
//    }
//    @AfterMethod
//    public void tearDown(){
//        createEventsSteps.driver.quit();
//    }
//}
