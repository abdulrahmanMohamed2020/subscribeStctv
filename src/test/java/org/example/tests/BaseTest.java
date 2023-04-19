package org.example.tests;

import org.example.core.CapabilityFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    protected final String BASE_URL = "https://subscribe.stctv.com/";

    public CapabilityFactory capabilityFactory = new CapabilityFactory();

    @Parameters(value={"browser"})
    @BeforeMethod(description = "initialize the web drive", alwaysRun = true)
    public void setUp (@Optional("firefox") String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        driver.get().get(BASE_URL);
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod(description = "close the web drive", alwaysRun = true)
    public void tearDown() {
        getDriver().quit();
    }
}
