import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // скачали chromedriver, указали путь к нему и сделали все основные настройки
        Configuration.browser = "chrome";  // конфигурация браузера
        Configuration.driverManagerEnabled = true;  // Для selenide показываем, что есть библиотека WebDriverManager
        Configuration.browserSize = "1024x768";  // размер открываемого окна браузера при выполнении тестов
        Configuration.headless = false;
    }

    @BeforeEach
    public void init() {  // инициализация браузера перед запуском тестов
        setUp();
    }

    @AfterEach
    public void tearDown() {  // закрытие окна браузера после выполнения тестов
        Selenide.closeWebDriver();
    }
}
