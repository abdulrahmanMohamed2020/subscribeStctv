package org.example.uitils;

import java.util.HashMap;
import java.util.Map;

public class Constants {


    public static Map<String,String> getLiteCurrencies() {

        Map<String,String> currencyLite = new HashMap<>();
        currencyLite.put("eg","0.25 USD/month");
        currencyLite.put("ae","5.4 USD/month");
        currencyLite.put("dz","2.7 USD/month");
        currencyLite.put("dj","2.4 USD/month");
        currencyLite.put("td","2.4 USD/month");
        currencyLite.put("iq","2.4 USD/month");
        currencyLite.put("jo","2.7 USD/month");
        currencyLite.put("lb","2.4 USD/month");
        currencyLite.put("ma","2 USD/month");
        currencyLite.put("om","5 USD/month");
        currencyLite.put("tn","1.7 USD/month");
        currencyLite.put("ye","2.4 USD/month");
        currencyLite.put("ps","2.4 USD/month");
        currencyLite.put("bh","2 BHD/month");
        currencyLite.put("sa","15 SAR/month");
        currencyLite.put("kw","1.2 KWD/month");

        return currencyLite;
    }

    public static Map<String,String> getClassicCurrencies() {

        Map<String,String> currencyClassic = new HashMap<>();
        currencyClassic.put("eg","0.5 USD/month");
        currencyClassic.put("ae","10.9 USD/month");
        currencyClassic.put("dz","5.3 USD/month");
        currencyClassic.put("dj","4.8 USD/month");
        currencyClassic.put("td","4.8 USD/month");
        currencyClassic.put("iq","4.1 USD/month");
        currencyClassic.put("jo","5.2 USD/month");
        currencyClassic.put("lb","4.8 USD/month");
        currencyClassic.put("ma","3.9 USD/month");
        currencyClassic.put("om","10 USD/month");
        currencyClassic.put("tn","3.4 USD/month");
        currencyClassic.put("ye","4.8 USD/month");
        currencyClassic.put("ps","4.8 USD/month");
        currencyClassic.put("bh","3 BHD/month");
        currencyClassic.put("sa","25 SAR/month");
        currencyClassic.put("kw","2.5 KWD/month");

        return currencyClassic;
    }

    public static Map<String,String> getPremiumCurrencies() {

        Map<String,String> currencyPremium = new HashMap<>();
        currencyPremium.put("eg","1 USD/month");
        currencyPremium.put("ae","16.3 USD/month");
        currencyPremium.put("dz","8 USD/month");
        currencyPremium.put("dj","7.2 USD/month");
        currencyPremium.put("td","7.2 USD/month");
        currencyPremium.put("iq","6.2 USD/month");
        currencyPremium.put("jo","8 USD/month");
        currencyPremium.put("lb","7.2 USD/month");
        currencyPremium.put("ma","5.8 USD/month");
        currencyPremium.put("om","15 USD/month");
        currencyPremium.put("tn","5.8 USD/month");
        currencyPremium.put("ye","7.2 USD/month");
        currencyPremium.put("ps","7.2 USD/month");
        currencyPremium.put("bh","6 BHD/month");
        currencyPremium.put("sa","60 SAR/month");
        currencyPremium.put("kw","4.8 KWD/month");

        return currencyPremium;
    }
}
