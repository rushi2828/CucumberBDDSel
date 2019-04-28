package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:/git_rushi2828/Cucmber_Selenium/src/main/java/Features/login.feature",
		glue = {"stepDefination"},
		format = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict=true,
		dryRun = false		
		)

public class TestRunner {

}
