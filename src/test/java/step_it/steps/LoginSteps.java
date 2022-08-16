package step_it.steps;

import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;

    public void login(String username, String password){
        loginPage.login(username, password);

    }
}
