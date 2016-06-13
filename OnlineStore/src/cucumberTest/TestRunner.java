package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature" // set: the path of the feature files default value {}
		,glue={"stepDefinition"} // set: the paths of the step definition files {}
		,dryRun= true // check if all the steps have the step definition. By default value is false
		)
public class TestRunner {

}

//There are other options types