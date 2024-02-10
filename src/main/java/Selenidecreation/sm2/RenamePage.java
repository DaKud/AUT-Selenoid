package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;



public class RemakeNamePage {

    private final SelenideElement elementFirstDummyCard = $x("//div[@class='posts svelte-127jg4t']/a");
    private final SelenideElement elementDummyEditPostButton = $x("//div[@class='button-block svelte-tv8alb']/button");
    private final SelenideElement elementFieldToTitle = $x("//input[@type='text']");
    private final SelenideElement elementButtonSave = $x("//*[@type='submit']");
    private final SelenideElement elementUserPageButton = $x("//a[contains(text(),'Hello')]");
    private final SelenideElement elementProfileButton = $x("//ul[@class='mdc-deprecated-list']/li");

    public void openFirstDummyCardAndSaveNewName(String name) {
        elementFirstDummyCard.shouldBe(visible).click();
        Selenide.sleep(5000);
        elementDummyEditPostButton.shouldBe(visible).click();
        elementFieldToTitle.clear();
        elementFieldToTitle.sendKeys(name);
        elementButtonSave.click();
    }

    public void openProfile() {
        Selenide.sleep(5000);
        elementUserPageButton.shouldBe(visible).click();
        elementProfileButton.shouldBe(visible).click();
    }
}
