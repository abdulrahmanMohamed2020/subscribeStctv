package org.example.tests;

import org.example.pages.HomePage;

import org.example.uitils.Constants;
import org.example.uitils.CustomSoftAssert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @Test(description = "Validate the packages, price and currency for all countries")
    public void validatePackages() {
        CustomSoftAssert softAssert = new CustomSoftAssert();

        homePage = new HomePage(getDriver());

        List<String> countriesStr = homePage.getCountries();

        homePage.clickOnTranslationBtn();
        countriesStr.forEach(country -> {
            homePage.clickOnCountryBtn(country);
            homePage.selectCountry(country);

            softAssert.assertEquals(homePage.getLitePlan(),"LITE");
            softAssert.assertEquals(homePage.getClassicPlan(),"CLASSIC");
            softAssert.assertEquals(homePage.getPremiumPlan(),"PREMIUM");

            softAssert.assertEquals(homePage.getLiteCurrency(),Constants.getLiteCurrencies().get(country),"Lite currency is not correct for this country: " +country);
            softAssert.assertEquals(homePage.getClassicCurrency(),Constants.getClassicCurrencies().get(country),"Classic currency is not correct for this country: " +country);
            softAssert.assertEquals(homePage.getPremiumCurrency(),Constants.getPremiumCurrencies().get(country),"Premium currency is not correct for this country: " +country);

        });
        softAssert.assertAll();
    }
}
