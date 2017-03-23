package com.starkie.samples.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Cucumber test runner
 * @author luke.starkie
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, 
				 glue = {"com.starkie.samples.bdd" }, 
				 strict = true,
				 plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"})
public class RunBDDTest {
}