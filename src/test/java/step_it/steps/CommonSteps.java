package step_it.steps;

import pages.LoginPage;
import pages.MainPage;

public class CommonSteps {

    LoginPage loginPage;
    MainPage mainPage;

    public CommonSteps(LoginPage loginPage, MainPage mainPage) {
        this.loginPage = loginPage;
        this.mainPage = mainPage;
    }

    public void checkLoginPageIsOpen("Check user is login"){
        assertThat(loginPage.isLogoDisplayed()).as("The login page is not displayed").isTrue();
    }

    public void checkUserIsLoggedIn(){
        assertThat(MainPage.isTitleDisplayed()).as("The login page is not displayed").isTrue();
    }
}
