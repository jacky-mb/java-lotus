package PageObject;

import Helpers.Drivers;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public  WebDriver driver;
    public  WebDriverWait driverWait;
    public long timeOut = 10;
    public  JavascriptExecutor executorJs;

    public  void fillField(By locator, Object value){
        driver.findElement(locator).sendKeys(String.valueOf(value));
    }

    public  void click(By locator){
        driver.findElement(locator).click();
    }

    public  void waitForText(String text) {
        (new WebDriverWait(driver,timeOut)).until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[contains(text(),'" + text + "')]"), text));
    }
    public  void waitForElement(By selector) {
        (new WebDriverWait(driver,timeOut)).until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
    public void checkBox(By selector, boolean option) {
        boolean isChecked = (boolean) executorJs.executeScript("return $(" + selector + ").is(\":checked\")");
        if (isChecked) {
            if (option) {
                /*no action*/
            } else {
                this.click(selector);
            }
        } else {
            if (option) {
                this.click(selector);
            } else {
                /*no action*/
            }
        }
    }

    public void sleep(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
