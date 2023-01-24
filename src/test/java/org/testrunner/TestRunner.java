package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.GenerateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\TonyStark\\eclipse-workspace\\CucumberFrameWork\\src\\test\\resources\\FacbookHomePage.feature", dryRun = false, monochrome = true, glue = "org.stepdefinition", plugin = {
		"json:C:\\Users\\TonyStark\\eclipse-workspace\\CucumberFrameWork\\target\\filename.json",
		"html:C:\\Users\\TonyStark\\eclipse-workspace\\CucumberFrameWork\\target" })
public class TestRunner {

	@AfterClass
	public static void GenerateReport() {
		GenerateReport
				.generateReportJvm("C:\\Users\\TonyStark\\eclipse-workspace\\CucumberFrameWork\\target\\filename.json");

	}

}
