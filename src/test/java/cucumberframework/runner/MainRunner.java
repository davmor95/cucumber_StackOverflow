package cucumberframework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/java/cucumberframework/featureFiles"},
		glue = {"cucumberframework.steps"},
		monochrome = true, 
		tags = {},
		plugin = {"pretty", "html:targetReport/cucumber", "json:targetReport/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:targetReport/report"}
)


public class MainRunner {

}
