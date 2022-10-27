package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass{
	
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException {
		
		
		File file = new File(getProjectPath()+getPropertyFileValue("\\target"));
		
		Configuration configuration = new Configuration(file,"Adactin Hotel Page");
		
		configuration.addClassifications("Browser Name","Google Chrome");
		configuration.addClassifications("Browser Version","102");
		
		configuration.addClassifications("Operating system","Windows11");
		configuration.addClassifications("Regretion","01");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		
		builder.generateReports();
		
	}
	
	
	

}
