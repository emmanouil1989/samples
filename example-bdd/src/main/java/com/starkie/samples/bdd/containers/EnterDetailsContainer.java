package com.starkie.samples.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Screen container for the enter user details page
 * @author luke.starkie
 */
public class EnterDetailsContainer extends AbstractContainer {

	@FindBy (id="yourFirstName") 
	public WebElement firstName;
	
	@FindBy (id="yourLastName") 
	public WebElement lastName;
	
	@FindBy (id="yourHouseNumber") 
	public WebElement houseNumber;
	
	@FindBy (id="yourPostcode") 
	public WebElement postCode;
	
	@FindBy (id="lookUpMyUKAddress") 
	public WebElement findAddress;
	
	@FindBy (id="yourHouseName") 
	public WebElement houseName;
	
	@FindBy (name="address.addressLine1") 
	public WebElement addressLine1;
	
	@FindBy (name="address.addressLine2") 
	public WebElement addressLine2;
	
	@FindBy (name="address.addressLine3") 
	public WebElement addressLine3;
	
	@FindBy (name="address.addressLine4") 
	public WebElement addressLine4;
	
	@FindBy (name="address.addressLine5") 
	public WebElement addressLine5;
	
	@FindBy (id="yourEmailAddress") 
	public WebElement email1;
	
	@FindBy (id="yourEmailAddressAgain") 
	public WebElement email2;
	
	@FindBy (id="day") 
	public WebElement dobDay;
	
	@FindBy (id="month") 
	public WebElement dobMonth;
	
	@FindBy (id="year") 
	public WebElement dobYear;
	
	@FindBy (id="MainContent_butContinue") 
	public WebElement continueButton;
	
	@FindBy (id="lookUpMyUKAddress") 
	public WebElement findMyAddressButton;
	
}