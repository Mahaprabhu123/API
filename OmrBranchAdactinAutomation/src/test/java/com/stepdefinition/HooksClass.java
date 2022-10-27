package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		
		getDriver(getPropertyFileValue("browserName"));
		enterURL(getPropertyFileValue("url"));
		maximizewindow();
		
		
	}
	
	@After
	private void afterScenario() {
		
		quit();
		
	}
	
}
