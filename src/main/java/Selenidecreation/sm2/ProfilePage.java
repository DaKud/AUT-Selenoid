package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;


public class ProfilePage {

    public SelenideElement profileButton() {
        return Selenide.$x("//div[@class='mdc-menu mdc-menu-surface']/..");
    }

    public SelenideElement firstButtonInList() {
        return Selenide.$x("//span[contains(text(),'Profile')]");
    }

    public SelenideElement editButton() {
        return Selenide.$x("//button[@title='More options']");
    }

    public SelenideElement editProfileInput() {
        return Selenide.$x("//input[@type='file']");
    }

    public SelenideElement saveButton() {
        return Selenide.$x("//button[@type='submit']");
    }

    public SelenideElement birthdayInput() {
        return Selenide.$x("//input[@type='date']");
    }

    public SelenideElement closeWindowFrameButton() {
        return Selenide.$x("//button[@data-mdc-dialog-action='close']");
    }

    public String getNewBirthdayDate() {
        return birthdayInput().shouldBe(visible).getValue();
    }

    public void openProfilePage() {
        profileButton().shouldBe(visible).click();
        firstButtonInList().click();
    }

    public void clickEditButtonInProfilePage(String path) {
        editButton().shouldBe(visible).click();
        Selenide.sleep(5000);
        editProfileInput().shouldBe(visible).uploadFile(new File(path));
        Selenide.sleep(5000);
        saveButton().shouldBe(visible).click();
    }

    public void changeBirthday(String newBirthday) {
        editButton().shouldBe(visible).click();
        Selenide.sleep(5000);
        birthdayInput().shouldBe(visible).setValue(newBirthday);
    }

    public void clickSaveButton() {
        Selenide.sleep(5000);
        saveButton().click();
    }

    public void closeFrameWindow() {
        Selenide.sleep(5000);
        closeWindowFrameButton().click();
    }

    public ElementsCollection posts() {
        return $$x("//div[@class='post-item']");
    }
}
