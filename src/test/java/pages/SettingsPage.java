package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SettingsPage {
    private final ElementsCollection
            languageOptions = $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")),
            currentLanguages = $$(AppiumBy.className("android.widget.TextView"));

    private final SelenideElement
            menuButton = $(AppiumBy.id("org.wikipedia.alpha:id/menu_overflow_button")),
            settingsButton = $(AppiumBy.id("org.wikipedia.alpha:id/explore_overflow_settings")),
            languageSettingsButton = currentLanguages.findBy(text("Wikipedia language"));

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickSettingsButton() {
        settingsButton.click();
    }

    public void clickLanguagesButton() {
        languageSettingsButton.click();
    }

    public void setLanguage(String language) {
        languageOptions.findBy(text(language)).click();
    }

    public void checkLanguage(String language) {
        currentLanguages.findBy(text(language)).shouldBe(visible);
    }
}
