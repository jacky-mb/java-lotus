package stepdefinitions.K12.Login;

import Helpers.BasePage;
import Helpers.Drivers;
import Helpers.ScreenPlayAction;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.junit.annotations.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class Logintest extends ScreenPlayAction {
    @Before
    public void setUp() {
        driver = new Drivers("chrome").getDriver();
        actor = Actor.named("actor").can(BrowseTheWeb.with(driver));
    }
    @Test
    public void login() {

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
