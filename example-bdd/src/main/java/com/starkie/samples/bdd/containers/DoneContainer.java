package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the done page
 * @author luke.starkie
 */
public class DoneContainer {
	
	@FindBy (id="MainContent_butContinue")
	public WebElement finishButton;
	
	@FindBy (id="MainContent_butContinueBottom")
	public WebElement finishButtonBottom;
}