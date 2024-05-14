package data;

public class DataHelper {

    private static final String login = System.getenv("LOGIN");
    private static final String pass = System.getenv("PASS");
    private static final String text = "Тестовое сообщение самому себе";
    private static final String URL = "https://mail.ru";

    public static String getLogin() {
        return login;
    }

    public static String getPass() {
        return pass;
    }

    public static String getText() {
        return text;
    }

    public static String getUrl() {
        return URL;
    }
}
