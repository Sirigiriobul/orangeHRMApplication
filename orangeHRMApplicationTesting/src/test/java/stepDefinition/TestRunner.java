package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="orangeHRMApplication",
                    glue= "stepDefinition",
                    monochrome=true

		
                    
                               
		)

public class TestRunner {

}


