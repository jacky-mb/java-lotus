package PageObject;

import Repository.Locator;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver dr){
        this.driver = dr;
    }
    public HomePage login(String email, String password){
        driver.get("https://demoauto.xyz/signin");
        fillField(Locator.Login.USERNAME,email);
        fillField(Locator.Login.PASSWORD,password);
        click(Locator.Login.BUTTON_LOGIN);
        return new HomePage(driver);
    }
    public void verifyLoginSuccess(){
        waitForText("Dashboard");
    }
}
