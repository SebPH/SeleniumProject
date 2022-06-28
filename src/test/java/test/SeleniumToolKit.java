package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumToolKit {

    WebDriver driver;

    public SeleniumToolKit(WebDriver driver) {
        this.driver = driver;
    }

    public void click(String selector) {

        driver.findElement(By.cssSelector(selector)).click();
    }

    public void write(String selector, String input) {

        driver.findElement(By.cssSelector(selector)).sendKeys(input);
    }

    public void displayed(String locator, String locatorType) {

        switch(locatorType) {
            case "cssSelector": driver.findElement(By.cssSelector(locator)).isDisplayed(); break;
            case "id": driver.findElement(By.id(locator)).isDisplayed(); break;
            case "xpath": driver.findElement(By.xpath(locator)).isDisplayed(); break;
            default:
            case "link": driver.findElement(By.linkText(locator)).isDisplayed(); break;
        }
    }

    public void selected(String selector) {

        driver.findElement(By.cssSelector(selector)).isSelected();
    }

    public void enabled(String selector) {

        driver.findElement(By.cssSelector(selector)).isEnabled();
    }

    public void on(String url) {

        Assert.assertEquals(url, driver.getCurrentUrl());
    }

}
