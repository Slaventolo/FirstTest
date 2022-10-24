import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement loginInput = $x("//input[@name='st.email']");
    private final SelenideElement passwordInput = $x("//input[@name='st.password']");
    private final SelenideElement button = $x("//input[@class='button-pro __wide']");

    public void insertData(String login, String password) {

        loginInput.setValue(login);
        //loginInput.sendKeys(Keys.ENTER);

        passwordInput.setValue(password);
        //passwordInput.sendKeys(Keys.ENTER);

        button.click();
    }
}
