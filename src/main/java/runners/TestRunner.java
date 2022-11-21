package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Volumes/personal data/NIKUL QA/Selenium_WorkSpace/CucumberPractice/src/main/java/features/tagging.feature"},//the path of the feature files
		glue={"stepDefination"},//step Defination Package Name
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
		)

	 
	public class TestRunner {
	 
	}
	
	//OR : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//AND : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	//INGNORE{~}

