package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the test harness page
 * @author luke.starkie
 */
public class TestHarnessContainer {
	
	@FindBy (id="transactionID") 
	public WebElement transactionIDInput;
	
	@FindBy (id="payment") 
	public WebElement paymentInput;
	
	@FindBy (id="description") 
	public WebElement vrmInput;
	
	@FindBy (id="term") 
	public WebElement termInput;
	
	@FindBy (id="paymentType") 
	public WebElement paymentTypeInput;
	
	@FindBy (id="effectiveDate") 
	public WebElement effectiveDateInput;
	
	@FindBy (id="languageCode") 
	public WebElement languageCodeInput;
	
	@FindBy (id="viewState") 
	public WebElement viewStateInput;
	
	@FindBy (id="confirmationTermsandConditions") 
	public WebElement confirmationTermsandConditionsInput;
	
	@FindBy (xpath="//input[@value='Go']")
	public WebElement goButton;
}