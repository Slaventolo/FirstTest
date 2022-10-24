import com.codeborne.selenide.Selenide;
public class SearchPage {
    public SearchPage(String url) {
        Selenide.open(url);
    }
}
