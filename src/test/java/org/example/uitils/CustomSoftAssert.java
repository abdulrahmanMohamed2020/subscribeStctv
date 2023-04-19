package org.example.uitils;

import io.qameta.allure.Attachment;
import org.example.tests.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class CustomSoftAssert extends SoftAssert {

    @Attachment(value = "Screenshot", type = "image/png")
    private static byte[] takeScreenShotForAllure(WebDriver webDriver) {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    private static String saveTextLog(String message) {
        return message;
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        takeScreenShotForAllure(new BaseTest().getDriver());
        saveTextLog(ex.getMessage());
    }
}
