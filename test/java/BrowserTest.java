import org.junit.jupiter.api.Test;

public class BrowserTest extends BaseTest {
    private static final String URL = "https://ok.ru/";
    private static final String LOGIN = "technoPol24";
    private static final String PASSWORD = "technoPolis2022";

    @Test
    public void goToLoginPage() {
        // вход на ok.ru
        SearchPage searchPage = new SearchPage(URL);

        // ввод логина и пароля и нажатие кнопки "Войти"
        LoginPage loginPage = new LoginPage();
        loginPage.insertData(LOGIN, PASSWORD);
    }
}
