package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.cli.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
         (
         features=".//Features/Signin.feature",
         glue="stepDefinitions",
         dryRun=false,
         monochrome=true,
         plugin= {"pretty",
        		 "html:target/report.html",
        		 "json:target/report.json",
        		 "junit:target/report.xml"}
         
         )


public class TestRun {

}
