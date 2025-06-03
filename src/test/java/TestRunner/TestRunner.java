package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = {
		    "src/test/resources/Features/demoblazeEcommerce.feature",
		  },
		  glue = "stepDefinitions",
		  dryRun = false,
		  //tags = "@Sanity",
		  plugin = {
		    "pretty", 
		    "html:target/HTMLReports/reports.html"
		  },
		  monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	/*this class will be empty */
}
