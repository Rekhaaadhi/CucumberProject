package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\reports\\JVMReport");
		Configuration con = new Configuration(f,"CucumberProject");
		con.addClassifications("platform Name ","Windowns 10");
		con.addClassifications("Browser Name ","Chrome");
		con.addClassifications("Browser version ","101");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}
