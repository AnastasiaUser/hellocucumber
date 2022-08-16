package step_it.step_definitions;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import step_it.steps.CommonSteps;



public class CommonDefinitions {

    private CommonSteps commonSteps;

    public CommonDefinitions(CommonSteps commonSteps, CommonSteps commonSteps1){

        this.commonSteps = commonSteps1;
    }
    @Given("the app login page is open")
    public void theAppLoginIsOpen(){

    }
    @Then("the user is login")
    public void the
}
