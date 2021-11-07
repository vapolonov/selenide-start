package ru.apolonov;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContributor {

    @Test
    void bestContributor() {

        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors")).closest("div").$("ul li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

        //sleep(5000);

    }

}
