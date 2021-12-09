package PageObject;

import Repository.Locator;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver dr){
        this.driver = dr;
    }
    public EventPage openEventPage(){
        click(Locator.HomePage.Events);
        waitForElement(Locator.Event.BUTTON_ADD_EVENT);
        return new EventPage(driver);
    }
}
