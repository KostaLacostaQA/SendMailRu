package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement popupSend = $x("//a[@title='Написать письмо']");
    private final SelenideElement inputWho = $x("//input[@type='text'][1]");
    private final SelenideElement inputTextBody = $x("//div[@role='textbox']");
    private final SelenideElement buttonSend = $x("//span[text()='Отправить']/../..");
    private final SelenideElement successSend = $x("//a[text()='Письмо отправлено']");


    //Открытие попапа для написания текста
    public MainPage openPopup() {
        popupSend.click();
        return this;
    }

    //Заполнение формы кому отправить и какой текст, с дальнейшей отправкой
    public MainPage sendMail(String login) {
        inputWho.setValue(login);
        inputTextBody.setValue(DataHelper.getText());
        buttonSend.click();
        return this;
    }

    //Проверка что письмо отправилось
    public MainPage checkSend() {
        successSend.shouldBe(Condition.visible);
        return this;
    }
}
