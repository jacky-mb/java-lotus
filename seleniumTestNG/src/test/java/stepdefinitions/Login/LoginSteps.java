package stepdefinitions.Login;

import Helpers.HelpTask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Pages;

import java.util.HashMap;
import java.util.Map;

public class LoginSteps extends HelpTask {
    public LoginSteps(WebDriver webDriver){
        super(webDriver);
    }
    public void openPage(String url){
        driver.get(url);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
    }
    public void fillField(Map<String,String> data){
        driver.findElement(Pages.Login.USERNAME).sendKeys(data.get("email"));
        driver.findElement(Pages.Login.PASSWORD).sendKeys(data.get("password"));
    }

    public void verifyLoginResult(Map<String,String> result){
        driver.findElement(Pages.Login.BUTTON_LOGIN).click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'"+result.get("result")+"')]")));
    }
}
