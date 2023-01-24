package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hpsf.Array;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	public static void generateReportJvm(String json) {

		File f = new File("C:\\Users\\TonyStark\\eclipse-workspace\\CucumberFrameWork\\target\\FbLoginReport");
		Configuration c = new Configuration(f, "FacebookLoginReport");
		c.addClassifications("BroweserTest", "ChromeBrowser");
		c.addClassifications("Client", "Facebook");
		c.addClassifications("Tester", "Vignesh");
		c.addClassifications("AutomationToolVersion", "4.1.350");
		c.addClassifications("Sprint", "2.0.0");

		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
