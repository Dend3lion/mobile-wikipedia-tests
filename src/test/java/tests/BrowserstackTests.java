package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class BrowserstackTests extends TestBase {
    @Test
    @Tag("android")
    @DisplayName("Open article from search")
    void openSearchArticleTest() {
        step("Click search bar", () ->
                $(accessibilityId("Search Wikipedia")).click()
        );
        step("Type Beaver", () ->
                $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Beaver")
        );
        step("Open first article", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .first().click());
        step("Check that error is displayed", () ->
                $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(visible));
    }

    @Test
    @Tag("android")
    @DisplayName("Hide featured article")
    void hideFeaturedArticleTest() {
        step("Click featured article options dots", () ->
                $(id("org.wikipedia.alpha:id/view_featured_article_card_header")).
                        find(id("org.wikipedia.alpha:id/view_list_card_header_menu")).click()
        );
        step("Click 'Hide this card''", () ->
                $(id("org.wikipedia.alpha:id/title")).click()
        );
        step("Cheack that featured article is not displayed", () ->
                $(id("org.wikipedia.alpha:id/view_featured_article_card_header")).shouldNotBe(visible));
    }

    @Test
    @Tag("ios")
    @DisplayName("Check search result")
    void enterTextTest() {

        step("Click button Text", () -> {
            $(id("Text Button")).click();
        });

        step("Click 'Enter a text'", () -> {
            $(id("Text Input")).click();
        });

        step("Set text and press Enter", () -> {
            $(id("Text Input")).sendKeys("Appium");
            $(id("Text Input")).pressEnter();
        });

        step("Verify result", () -> {
            assertThat($(id("Text Output")).getText())
                    .isEqualTo("Appium");
        });
    }

}