package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty", "html:target/cucumber/report.html",
                "json:target/cucumber/report.json",
                "junit:target/cucumber-results.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features= "src/test/java/features/cliamCenter.feature",
		glue="stepDefinitions" ,
		monochrome=true
		
	 		
		
		
		)
public class demoLoginTest extends AbstractTestNGCucumberTests
{

}
