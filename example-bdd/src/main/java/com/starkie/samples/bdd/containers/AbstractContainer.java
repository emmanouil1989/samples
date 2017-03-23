package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Common web elements used throughout the system.
 * @author luke.starkie
 */
public class AbstractContainer {
	
	@FindBy (id="MainContent_butBack")
	public WebElement backButton;
	
	@FindBy (css="a[href*='cancelMethod']")
	public WebElement cancelLink;
	
	@FindBy (css="a[href*='changePaymentMethod']")
	public WebElement changePaymentMethodLink;
	
	public AbstractContainer() {
		super();
	}

}