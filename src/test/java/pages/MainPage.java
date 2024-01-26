package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private final ElementsCollection
            cards = $$(id("org.wikipedia.alpha:id/view_card_header_title"));

    private final SelenideElement
            searchPlaceholder = $(accessibilityId("Search Wikipedia")),
            feauredArticleOptions = $(id("org.wikipedia.alpha:id/view_featured_article_card_header")).
                    find(id("org.wikipedia.alpha:id/view_list_card_header_menu")),
            featuredArticleHideOption = $(id("org.wikipedia.alpha:id/title"));

    public MainPage clickOnSearchBar() {
        searchPlaceholder.click();
        return this;
    }

    public void openFeaturedArticleOptions() {
        feauredArticleOptions.click();
    }

    public void hideFeaturedArticle() {
        featuredArticleHideOption.click();
    }

    public void checkCardPresence(String cardName) {
        cards.findBy(text(cardName)).shouldBe(visible);
    }

    public void checkCardAbsence(String cardName) {
        cards.findBy(text(cardName)).shouldNotBe(visible);
    }
}
