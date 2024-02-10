package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {

  
    public SelenideElement loginField() {
        return $x("//*[@type='text']");
    }

    public SelenideElement passwordField() {
        return $x("//*[@type='password']");
    }

   
    public SelenideElement loginButton() {
        return $x("//*[@class='mdc-button__label']");
    }
}