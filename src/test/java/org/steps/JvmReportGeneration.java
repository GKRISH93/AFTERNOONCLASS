package org.steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneration {

	public static void jvmReport(String jsonpath) {
    //File path
		File f = new File("C:\\Users\\gopik\\eclipse-workspace\\CUCUMBER123\\Report\\JVMReport");
    //configuration class
		Configuration c = new Configuration(f,"FB Login Function");
		c.addClassifications("lang", "java");
		c.addClassifications("tool", "eclipse");
        c.addClassifications("os", "windows");	
	//ADD Json Filepath in List
        List<String> l = new ArrayList<String>();
        l.add(jsonpath);
        //create object REport Bulider
        ReportBuilder r = new ReportBuilder(l,c);
        r.generateReports();
        
        
	}
}
