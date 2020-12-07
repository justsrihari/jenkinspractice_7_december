package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"}
		,features = "resources"
		,glue={"steps"}
		//,tags={"@FirstScenario , @SecondScenario"}
		,tags={"@SuccessfulLogin"}
		)
public class TestRunner {}
