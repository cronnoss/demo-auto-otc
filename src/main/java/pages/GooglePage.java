package pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    public void search(String query) {
        $(byName("q"))
                .val(query)
                .pressEnter();
    }
}