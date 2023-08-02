package runnersClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/features",
		glue="stepDefinations" 
		
		)
public class TestNg_TestRunner extends AbstractTestNGCucumberTests{
	
	

}
