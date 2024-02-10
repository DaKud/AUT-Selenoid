package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement createPostButton() {
        return $x("//button[@class='create-new-post-button']");
    }

    public void createPost() {
        SelenideElement createPostButton = createPostButton();
        createPostButton.click();
    }

    public ElementsCollection posts() {
        return $$x("//div[@class='post-item']");
    }
}

