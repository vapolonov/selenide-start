package ru.apolonov;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

  @Test
    void shouldFindSelenideRepoInGithub() {

      open("https://github.com/");
      $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
      $$(".repo-list li").first().$("a").click();
      //тоже, но короче (сработает только если <li> и <a> первые элементы в списке):
      //$("repo-list li a").click();
      $("h1").shouldHave(text("selenide / selenide"));
      //т.к. элементов с тегом <h1> на странице два, то можно использовать коллекцию элементов, как с тегом <a> выше
      //найдем второй элемент <h1>
      //$$("h1").get(1).shouldHave(text("Selenide = UI Testing Framework powered by Selenium WebDriver"));

      sleep(5000);
  }

}
