package org.stepdefinition;

import java.io.IOException;


import org.utilities.BaseClass;
import org.utilities.JVMReport;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooksClass extends BaseClass{
	@Before
	public void beforeScenario()
	{
		launchChrome();
		loadUrl("https://www.waterstones.com/");
		winMax();
		
	}
	@After
	public void afterScenario(Scenario s) throws IOException
	{
		String name = s.getName();
		String fileName = name.replace(" ","_");		
		screenshot(fileName);
		toQuit();
		
	}

}
