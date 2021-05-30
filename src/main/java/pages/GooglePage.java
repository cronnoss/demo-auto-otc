package pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Keys;

public class GooglePage {

    public void sendKeys(String text) {
        $(byTagName("input")).sendKeys(text);
        $(byTagName("input")).sendKeys(Keys.ENTER);
    }
}