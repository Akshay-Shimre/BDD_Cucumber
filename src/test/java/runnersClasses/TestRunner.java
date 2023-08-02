package runnersClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue="stepDefinations" , stepNotifications = true, tags ="@reg or @smoke" ,
		plugin= {"pretty", "html:target/cucumber.html"} , monochrome=true
		
		)
public class TestRunner {
	

	}


