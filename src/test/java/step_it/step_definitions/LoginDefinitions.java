package step_it.step_definitions;

import io.cucumber.java.en.When;
import step_it.steps.LoginSteps;

public class LoginDefinitions {
    private LoginSteps loginSteps;

    public LoginDefinitions(LoginSteps loginSteps) {
        this.loginSteps = loginSteps;
    }

    @When("the user enters correct {word} and {word}")
    public void theUserEntersCorrectUsernameAndPassword(String username, String password){
        loginSteps.login(username, password);
    }
}
