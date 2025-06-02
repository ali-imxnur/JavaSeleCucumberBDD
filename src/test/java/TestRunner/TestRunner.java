package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
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

public class TestRunner {
	
	/*this class will be empty */
}
