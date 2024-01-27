package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;
import pages.SettingsPage;

import static io.qameta.allure.Allure.step;

@Tag("mobile")
@Epic("Android")
@Owner("Denis Bashkatov")
public class WikipediaTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultPage = new SearchResultsPage();
    SettingsPage settingsPage = new SettingsPage();

    @Test
    @Feature("Main page")
    @DisplayName("Successful article search")
    void successfulSearchTest() {
        step("Click search bar", () -> mainPage.clickOnSearchBar());
        step("Type Beaver into search bar", () -> searchResultPage.fillSearchInput("Beaver"));
        step("Check that searched article is displayed", () -> searchResultPage.checkSearchResults("Beaver"));
    }

    @Test
    @Feature("Main page")
    @DisplayName("Check main page sections")
    void checkMainPageSections() {
        step("Check that In The News section displayed", () -> mainPage.checkCardPresence("In the News"));
        step("Check that Featured Article section is displayed", () -> mainPage.checkCardPresence("Featured article"));
    }

    @Test
    @Feature("Main page")
    @DisplayName("Hide featured article")
    void hideFeaturedArticleTest() {
        step("Click featured article options dots", () -> mainPage.openFeaturedArticleOptions());
        step("Click 'Hide this card''", () -> mainPage.hideFeaturedArticle());
        step("Check that Featured Article section is not displayed", () -> mainPage.checkCardAbsence("Featured article"));
    }

    @Test
    @Feature("Settings")
    @DisplayName("Change language")
    void addLanguageTest() {
        step("Click menu button", () -> settingsPage.clickMenuButton());
        step("Click settings button", () -> settingsPage.clickSettingsButton());
        step("Click language settings button", () -> settingsPage.clickLanguagesButton());
        step("Add Japanese language", () -> settingsPage.setLanguage("Deutsch"));
        step("Check that language was added", () -> settingsPage.checkLanguage("Deutsch"));
    }

}