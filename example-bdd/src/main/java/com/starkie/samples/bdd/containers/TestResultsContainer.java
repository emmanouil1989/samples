package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the test results page
 * @author luke.starkie
 */
public class TestResultsContainer {
	
	@FindBy (id="viewState") 
	public WebElement viewStateLabel;
	
	@FindBy (id="responseCode") 
	public WebElement responseCodeLabel;
	
	@FindBy (id="messageCode") 
	public WebElement messageCodeLabel;
}