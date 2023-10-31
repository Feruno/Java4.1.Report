package ru.netology;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.epam.reportportal.junit5.ReportPortalExtension;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class AppCardDeliveryPatterns {

    @BeforeAll
    static void setUpAll(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @AfterAll
    static void teatDownAll(){
        SelenideLogger.removeListener("allure");
    }

    @BeforeEach
    void setUp() {
        open("http://localhost:9999");
    }

    @Test
    @ExtendWith(ReportPortalExtension.class)
    void appSuccessfulPath() {

        DataGenerator.userInfo valUser = DataGenerator.Regist.generetUser("ru");
        int daysFirstMeeting = 4;
        String firstM = DataGenerator.generDate(daysFirstMeeting);

        int daysSecondMeeting = 7;
        String secondM = DataGenerator.generDate(daysSecondMeeting);

        $("[data-test-id=city] input").setValue(valUser.getCity());

        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);

        $("[data-test-id=date] input").setValue(firstM);
        $("span [name='name']").setValue(valUser.getName());
        $("span [name='phone']").setValue(valUser.getPhone());
        $("[data-test-id='agreement']").click();
        $(byText("Запланировать")).click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofSeconds(15));
        $("[data-test-id='success-notification'] .notification__content")
                .shouldHave(exactText("Встреча успешно запланирована на " + firstM))
                .shouldBe(visible);

        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);

        $("[data-test-id=date] input").setValue(secondM);
        $(byText("Запланировать")).click();
        $x("//div[@data-test-id='replan-notification']")
                .shouldBe(visible);
        $x("//div[@data-test-id='replan-notification']").click();
        $("[data-test-id='success-notification'] .notification__content")
                .shouldHave(text("Встреча успешно запланирована на " + secondM))
                .shouldBe(visible);
    }
}
