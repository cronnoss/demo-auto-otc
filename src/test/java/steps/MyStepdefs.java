package steps;

import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

import pages.BasicPage;
import pages.FirstPage;
import pages.GooglePage;

public class MyStepdefs {

    BasicPage basicPage = new BasicPage();
    GooglePage googlePage = new GooglePage();
    FirstPage firstPage = new FirstPage();

    @Then("Input {string}")
    public void inputSearchWord(String arg0) {
        googlePage.search(arg0);
    }

    @Then("Click {string} button")
    public void clickButtonText(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Content with {string} visible")
    public void contentIsVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @Then("Content with {string} Selling Rate more than Buying rate is true")
    public void contentWithMoreThanIsTrue(String arg0) {
        double rateSale = firstPage.getRateSale(arg0);
        double rateBuy = firstPage.getRateBuy(arg0);
        System.out.println(arg0 + ": selling rate: " + rateSale + ", buying rate: " + rateBuy);
        assertTrue(rateSale > rateBuy);
    }
}