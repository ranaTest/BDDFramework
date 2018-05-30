package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/ranaCucumber/freecrmCucumber/src/main/java/featurefile/login.feature"
		,glue={"stepDefination"}
		//format= {"preety","html:test-outout"}
		)

public class TestRunner {	
	
	
	
	
	

}
