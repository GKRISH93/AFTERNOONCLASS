package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.steps.JvmReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\gopik\\eclipse-workspace\\CUCUMBER123\\src\\test\\resources\\Featurefiles\\LOGIN2.FEATURE",glue="org.steps"
,monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,strict=true,
plugin = {
		"json:C:\\Users\\gopik\\eclipse-workspace\\CUCUMBER123\\Report\\JsonReport\\Fb.json",
		"rerun:C:\\Users\\gopik\\eclipse-workspace\\CUCUMBER123\\src\\test\\resources\\Rerun files\\failed.txt"
		}
)


public class runnerclass {

	@AfterClass
	 public static void Report() {
		JvmReportGeneration.jvmReport("C:\\Users\\gopik\\eclipse-workspace\\CUCUMBER123\\Report\\JsonReport\\Fb.json");
	}
}
