package org.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition", dryRun=true)
//monochrome=true, snippets=SnippetType.CAMELCASE, plugin= {"pretty"},
public class TestRunnerClass {

}
