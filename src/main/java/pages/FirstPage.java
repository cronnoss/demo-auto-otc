package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FirstPage {
    public static double rateSale;
    public static double rateBuy;

    public double getRateSale(String text) {
        if (text.equals("USD")) {
            rateSale = FirstPage.this.getRate("//tbody/tr[2]/td[4]");
        } else {
            rateSale = FirstPage.this.getRate("//tbody/tr[3]/td[4]");
        }
        return rateSale;
    }

    public double getRateBuy(String text) {
        if (text.equals("USD")) {
            rateBuy = FirstPage.this.getRate("//tbody/tr[2]/td[2]");
        } else {
            rateBuy = FirstPage.this.getRate("//tbody/tr[3]/td[2]");
        }
        return rateBuy;
    }

    private double getRate(String selector) {
        return Double.parseDouble($(byXpath(selector)).getText().replace(',', '.'));
    }
}
