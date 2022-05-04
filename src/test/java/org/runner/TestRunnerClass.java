package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition", dryRun=false, tags={"@smoke"},plugin= {"html:target\\reports","junit:target\\reports\\waterstones.xml","json:target\\reports\\output.json"})


//monochrome=true, snippets=SnippetType.CAMELCASE, plugin= {"pretty"},, tags= {"@smoke"}
public class TestRunnerClass {
	@AfterClass
	public static void runatlast()
	{
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\target\\reports\\output.json");
	}

}
