package Curso.AutomationII;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features", 
        glue = "steps",
        format = { "pretty",
                   "html:target/site/cucumber-pretty",
                   "rerun:target/rerun.txt",
                   "json:target/cucumber1.json" })
public class RunCuckesTest extends AbstractTestNGCucumberTests{

}
