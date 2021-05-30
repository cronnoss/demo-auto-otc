package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void contentIsVisible(String text) {
        $(byXpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

    public void clickButton(String text) {
        $(byXpath("//*[text()='" + text + "']")).click();
    }
}
