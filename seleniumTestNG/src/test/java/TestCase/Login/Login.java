package TestCase.Login;

import Helpers.DataProviders;
import Helpers.Drivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Pages;
import stepdefinitions.Login.LoginSteps;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Login {
    public WebDriver driver;
    public LoginSteps loginSteps ;
    @DataProvider(name = "dataTest")
    public Iterator<Object[]> dp() throws IOException {
        String pathFile = "src/test/resources/_data/demo.xlsx";
        return DataProviders.parseExcel(pathFile,"loginncc");
    }
    @BeforeMethod
    public void setUp(){
        driver = new Drivers("chrome").getDriver();
        loginSteps = new LoginSteps(driver);
    }
    @Test(dataProvider = "dataTest")
    public void login(Map<String, String> map){
        loginSteps.openPage(Pages.BASE_URL+Pages.Login.URL);
        loginSteps.fillField(map);
        loginSteps.verifyLoginResult(map);
    }
    @AfterMethod(enabled = true)
    public void tearDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
    }
}
