package test;

import com.codeborne.selenide.Configuration;
import data.DataHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.AuthPage;
import page.MainPage;

public class MailTest {

    @BeforeEach
    void SetUp() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void test() {
        AuthPage authPage = new AuthPage();
        MainPage mainPage = new MainPage();

        authPage.openPage().openPopup().auth(DataHelper.getLogin(), DataHelper.getPass());
        mainPage.openPopup().sendMail(DataHelper.getLogin()).checkSend();
    }
}
