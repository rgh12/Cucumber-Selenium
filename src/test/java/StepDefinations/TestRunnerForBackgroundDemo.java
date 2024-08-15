package StepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature",
				glue= {"StepsForBackgroundDemo"})
public class TestRunnerForBackgroundDemo {

}
