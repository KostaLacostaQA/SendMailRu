package page;

import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.*;


public class AuthPage {

    private final SelenideElement popup = $x("//button[text() = 'Войти'][1]");
    private final SelenideElement inputLogin = $x("//input[@name='username']");
    private final SelenideElement inputPass = $x("//input[@name='password']");
    private final SelenideElement buttonNext = $x("//button[@data-test-id='next-button']");
    private final SelenideElement submitButton = $x("//button[@data-test-id='submit-button']");
    private final SelenideElement iframe = $x("//iframe[@class='ag-popup__frame__layout__iframe']");


    //Открытие браузера с нужным урлом
    public AuthPage openPage() {
        open(DataHelper.getUrl());
        return this;
    }

    //Открыть попап с авторизацией
    public AuthPage openPopup() {
        popup.click();
        return this;
    }

    //Авторизация в попапе
    public AuthPage auth(String login, String pass) {
        switchTo().frame(iframe);
        inputLogin.setValue(login);
        buttonNext.click();
        inputPass.setValue(pass);
        submitButton.click();
        return this;
    }

}
