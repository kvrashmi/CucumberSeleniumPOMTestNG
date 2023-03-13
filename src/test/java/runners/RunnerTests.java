package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue="step_definitions",
		plugin= {"pretty"},
		monochrome=true,
		dryRun=false
		)

public class RunnerTests extends AbstractTestNGCucumberTests{

}
