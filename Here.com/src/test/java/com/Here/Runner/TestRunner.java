package com.Here.Runner;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"com.Here.StepDefinition"}
 ,dryRun = false
 )
 
public class TestRunner {
 
}