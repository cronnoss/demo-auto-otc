package pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    public void sendKeys(String text) {
        $(byName("q")).sendKeys(text + "\n");
    }
}