package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the bank details page
 * @author luke.starkie
 */
public class BankDetailsContainer extends AbstractContainer {

	@FindBy (id="yourName") 
	public WebElement accountName;
	
	@FindBy (id="sortCode1") 
	public WebElement sortCode1;
	
	@FindBy (id="sortCode2") 
	public WebElement sortCode2;
	
	@FindBy (id="sortCode3") 
	public WebElement sortCode3;
	
	@FindBy (id="accountNumber") 
	public WebElement accountNumber;
	
	@FindBy (id="authority") 
	public WebElement ddAuthority;
	
	@FindBy (id="MainContent_butContinue") 
	public WebElement continueButton;
}