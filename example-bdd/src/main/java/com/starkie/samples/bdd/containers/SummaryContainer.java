package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the summary page
 * @author luke.starkie
 */
public class SummaryContainer extends AbstractContainer {

	@FindBy (id="MainContent_butSetUp")
	public WebElement setupButton;
}