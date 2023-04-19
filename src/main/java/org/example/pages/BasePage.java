package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait driverWait;
    private static final Duration TIMEOUT = Duration.ofSeconds(30);
    private static final Duration POLLING_TIMEOUT = Duration.ofMillis(200);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, TIMEOUT);
    }

    protected WebElement findElement(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(TIMEOUT)
                .pollingEvery(POLLING_TIMEOUT)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected List<WebElement> findElements(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(TIMEOUT)
                .pollingEvery(POLLING_TIMEOUT)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void actionClick(By locator) {
        WebElement element = findElement(locator);
        scrollToElement(element);

        driverWait.until(ExpectedConditions.elementToBeClickable(element));
        driverWait.until(ExpectedConditions.visibilityOf(element));
        try {
            element.click();
        } catch (StaleElementReferenceException ex) {
            findElement(locator).click();
        }
    }

    public void actionClick(String countryId) {
        WebElement element = findElement(By.id(countryId));
        scrollToElement(element);

        driverWait.until(ExpectedConditions.elementToBeClickable(element));
        driverWait.until(ExpectedConditions.visibilityOf(element));
        try {
            element.click();
        } catch (StaleElementReferenceException ex) {
            findElement(By.id(countryId)).click();
        }
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
}
