package Helpers;

import com.beust.jcommander.ParameterException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class HelpTask {
    public WebDriver driver;
    public WebDriverWait driverWait;
    public Actor actor = Actor.named("actor");
    public long timeOut = 10;
    public JavascriptExecutor executorJs;
    public void setTimeOut(long timeOut) {
        driverWait.withTimeout(Duration.ofSeconds(timeOut));

    }

    public void openPage(String url) {
//        Properties properties = new Properties();
//        String baseUrl = properties.getProperty("baseUrl");
//        if(!baseUrl.isEmpty()){
//            url = baseUrl + url;
//        }
        driver.get(url);
    }

    public void fillField(By locator, Object value) {
        driver.findElement(locator).sendKeys(String.valueOf(value));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void waitForText(String text) {
        (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[contains(text(),'" + text + "')]"), text));
    }

    public void waitForElement(By selector) {
        (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    public void checkBox(By selector, boolean option) {
        boolean isChecked = driver.findElement(selector).isSelected();
        if (option != isChecked) {
            click(selector);
        }
    }

    public Object executeJs(String script, Object... var) {
        return ((JavascriptExecutor) driver).executeScript(script, var);
    }


    public void sleep(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOption(By selector, String value) {
        Select s = new Select(driver.findElement(selector));
        s.selectByValue(value);
    }
}
