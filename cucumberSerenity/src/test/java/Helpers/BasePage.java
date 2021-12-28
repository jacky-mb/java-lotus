package Helpers;

import com.beust.jcommander.ParameterException;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BasePage {
    public WebDriver driver;
    public Actor actor;
    public WebDriverWait driverWait;
    public long timeOut = 10;

    public void fillField(By locator, Object value) {
        driver.findElement(locator).sendKeys(String.valueOf(value));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void onPage(String url){
        driver.get(url);
    }
    public void waitForText(String text) {
        (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(text(),'" + text + "')]"), text));
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

    public WebElement findWebElement(Object s) {
        String type = s.getClass().getSimpleName();
        if (!type.equals("String") && !type.contains("By")) throw new ParameterException("Not match type selector");
        WebElement e = null;
        try {
            if (type.equals("String")) {
                e = driver.findElement(By.cssSelector((String) s));
            } else {
                e = driver.findElement((By) s);
            }
        } catch (NoSuchElementException | ParameterException ex) {
            ex.printStackTrace();
        }
        return e;
    }


}
