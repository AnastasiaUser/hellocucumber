package step_it.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.utils.PropertyReader;

public class TestHook {

    @Before
    public void startBrowser(){
        getDrive().get(PropertyReader.getConfigProperty("url"));
    }

    @Before
    public void beforeScenario(Scenario scenario){
        log.info("Starting scenario: {}", scenario.getName());
        log.info("Scenario tag {}", scenario.getSourceTagName());
    }

    @AfterStep
    public void afterSteps(Scenario scenario) {
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed");
        }
    }
    @After
    public void driverTearDown(){
        System.out.println("Closing the window");
        quitDriver();
    }
}
