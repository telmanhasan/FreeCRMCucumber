package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\telma\\eclipse-workspace\\FreCrmBDDFramework\\src\\main\\java\\Features\\dealsmap.feature"
		,glue= {"stepDefinitions"}
		,format = {"pretty","html:test-output", "json:json_output/cucucmber.json","junit:junit_xml/cucumber"},
		monochrome = true, 
		strict=true,
		dryRun=false
		
		)
public class TestRunner {

}
