package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultsPage {
    private final ElementsCollection
            resultItems = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    private final SelenideElement
            searchInput = $(id("org.wikipedia.alpha:id/search_src_text"));

    public void fillSearchInput(String line) {
        searchInput.sendKeys(line);

    }

    public void checkSearchResults(String resultName) {
        resultItems.shouldHave(sizeGreaterThan(0));
        resultItems.findBy(text(resultName)).shouldBe(visible);
    }
}
