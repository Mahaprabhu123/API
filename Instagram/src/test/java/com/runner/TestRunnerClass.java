package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Instagram\\Features\\insta.feature",glue= {"com.stepdedfinition"})
		

public class TestRunnerClass {
	

}
