package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class EmulatorTests extends TestBase {
    @Test
    @Tag("emulator")
    @DisplayName("Check app onboarding screens")
    void checkOnboardingPages() {
        step("Check first screen heading and language selector", () -> {
            assertThat($(id("org.wikipedia.alpha:id/primaryTextView")).getText())
                    .isEqualTo("The Free Encyclopedia\n" +
                            "…in over 300 languages");

            $(id("org.wikipedia.alpha:id/addLanguageButton"))
                    .shouldBe(visible);

            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check second screen heading", () -> {
            assertThat($(id("org.wikipedia.alpha:id/primaryTextView")).getText())
                    .isEqualTo("New ways to explore");

            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check third screen heading", () -> {
            assertThat($(id("org.wikipedia.alpha:id/primaryTextView")).getText())
                    .isEqualTo("Reading lists with sync");

            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check forth screen heading and action buttons", () -> {
            assertThat($(id("org.wikipedia.alpha:id/primaryTextView")).getText())
                    .isEqualTo("Send anonymous data");

            $(id("org.wikipedia.alpha:id/rejectButton"))
                    .shouldBe(visible);
            $(id("org.wikipedia.alpha:id/acceptButton"))
                    .shouldBe(visible);
        });
    }
}