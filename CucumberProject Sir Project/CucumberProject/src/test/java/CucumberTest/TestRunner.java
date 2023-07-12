package CucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = {"./AppFeatures"},
		glue= {"CucumberTest","AppHooks"},
		
		monochrome = false,
		dryRun = false,
		tags = "@Test3 or @Test1"
		
		
		
		)



public class TestRunner {

}
