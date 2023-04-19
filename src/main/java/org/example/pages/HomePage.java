package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    private final By translationBtn = By.id("translation-btn");
    private final By countryBtn = By.id("country-btn");

    private final By countries = By.xpath("//a[contains(@class,'country')]");
    private final By litePlan = By.id("name-lite");
    private final By classicPlan = By.id("name-classic");
    private final By premiumPlan = By.id("name-premium");
    private final By liteCurrency = By.id("currency-lite");
    private final By classicCurrency = By.id("currency-classic");
    private final By premiumCurrency = By.id("currency-premium");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on the {0} country button")
    public void clickOnCountryBtn(String countryId) {
        actionClick(countryBtn);
    }

    @Step("Click on the translation button")
    public void clickOnTranslationBtn() {
        actionClick(translationBtn);
    }

    public List<String> getCountries() {
        List<String> countriesStr = new ArrayList<>();
        findElements(countries).forEach(country-> countriesStr.add(country.getAttribute("id")));
        return countriesStr;
    }

    public void selectCountry(String countryId) {
        actionClick(countryId);
    }

    public String getLitePlan() {
        return findElement(litePlan).getText();
    }

    public String getClassicPlan() {
        return findElement(classicPlan).getText();
    }

    public String getPremiumPlan() {
        return findElement(premiumPlan).getText();
    }

    public String getLiteCurrency() {
        return findElement(liteCurrency).getText();
    }

    public String getClassicCurrency() {
        return findElement(classicCurrency).getText();
    }

    public String getPremiumCurrency() {
        return findElement(premiumCurrency).getText();
    }
}
