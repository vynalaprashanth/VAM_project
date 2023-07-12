package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"AppFeatures/Login.feature","AppFeatures/NewAccount.feature"},
		
		monochrome=true,
		//dryRun=false,
		   //glue= {"MyTestRunner"}
		//tags="@test3"
		//plugin={"pretty","html:target/HtmlReports"}
		plugin={"pretty","json:target/JSONReports/reports.json"}

		
		)

public class TestRunner {

}
 