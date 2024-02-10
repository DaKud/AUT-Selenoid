package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends AbstractTest {


    @Test
    @DisplayName("Change Birthday date to a new")
    void changeNameToNew() {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        ProfilePage profilePage = Selenide.page(ProfilePage.class);
        profilePage.openProfilePage();
        profilePage.changeBirthday("14.05.1998");
        profilePage.buttonSaveClick();
        profilePage.closeFrameWindow();
        Assertions.assertEquals("14.05.1998",profilePage.getNewBirthdayDate());
    }
}