package step_it.runners;

import io.cucumber.junit..Cucumber;
import io.cucumber.junit..CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login"},
        glue = {"com.step_it.step_definitions", "com.step_it.hooks"},
        monochrome = false,
        tags = "",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                "junit:test-output/cucumber-reports/Cucumber.xml",
                "html:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)


public class JunitRunTest {
}
