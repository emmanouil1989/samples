package com.starkie.samples.bdd.views;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.EnterDetailsContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class EnterDetailsView extends AbstractView {

	private final EnterDetailsContainer enterDetailsContainer;

	public EnterDetailsView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		enterDetailsContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), EnterDetailsContainer.class);
	}
	
	public void setFirstName(String firstName) {
		enterDetailsContainer.firstName.clear();
		enterDetailsContainer.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		enterDetailsContainer.lastName.clear();
		enterDetailsContainer.lastName.sendKeys(lastName);
	}

	public void setHouseNumber(String houseNumber) {
		enterDetailsContainer.houseNumber.clear();
		enterDetailsContainer.houseNumber.sendKeys(houseNumber);
	}

	public void setPostCode(String postCode) {
		enterDetailsContainer.postCode.clear();
		enterDetailsContainer.postCode.sendKeys(postCode);
	}

	public void setHouseName(String houseName) {
		enterDetailsContainer.houseName.clear();
		enterDetailsContainer.houseName.sendKeys(houseName);
	}

	public void setAddressLine1(String addressLine1) {
		enterDetailsContainer.addressLine1.clear();
		enterDetailsContainer.addressLine1.sendKeys(addressLine1);
	}

	public void setAddressLine2(String addressLine2) {
		enterDetailsContainer.addressLine2.clear();
		enterDetailsContainer.addressLine2.sendKeys(addressLine2);
	}

	public void setAddressLine3(String addressLine3) {
		enterDetailsContainer.addressLine3.clear();
		enterDetailsContainer.addressLine3.sendKeys(addressLine3);
	}

	public void setAddressLine4(String addressLine4) {
		enterDetailsContainer.addressLine4.clear();
		enterDetailsContainer.addressLine4.sendKeys(addressLine4);
	}

	public void setAddressLine5(String addressLine5) {
		enterDetailsContainer.addressLine5.clear();
		enterDetailsContainer.addressLine5.sendKeys(addressLine5);
	}
	
	public String getAddressLine2() {
		return enterDetailsContainer.addressLine2.getAttribute("value");
	}
	
	public boolean isEmailError() {
		return browserDriver.getCurrentDriver().findElements(By.id("emailAddress.errors")).size() > 0;
	}

	public void setEmail1(String email1) {
		enterDetailsContainer.email1.clear();
		enterDetailsContainer.email1.sendKeys(email1);
	}

	public void setEmail2(String email2) {
		enterDetailsContainer.email2.clear();
		enterDetailsContainer.email2.sendKeys(email2);
	}

	public void setDobDay(String dobDay) {
		enterDetailsContainer.dobDay.clear();
		enterDetailsContainer.dobDay.sendKeys(dobDay);
	}

	public void setDobMonth(String dobMonth) {
		enterDetailsContainer.dobMonth.clear();
		enterDetailsContainer.dobMonth.sendKeys(dobMonth);
	}

	public void setDobYear(String dobYear) {
		enterDetailsContainer.dobYear.clear();
		enterDetailsContainer.dobYear.sendKeys(dobYear);
	}
	
	public void setValidInputAndContinue(String firstName, String lastName, String houseNumber, String postcode, String addressLine1, String email,
										 String dobDay, String dobMonth, String dobYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setHouseNumber(houseNumber);
		setPostCode(postcode);
		setAddressLine1(addressLine1);
		setEmail1(email);
		setEmail2(email);
		setDobDay(dobDay);
		setDobMonth(dobMonth);
		setDobYear(dobYear);
		clickContinueButton();
	}
	
	public void clickContinueButton() {
		enterDetailsContainer.continueButton.click();
	}
	
	public void clickFindMyAddressButton() {
		enterDetailsContainer.findMyAddressButton.click();
	}

	public void isDisplayedCheck() {
		browserDriver.waitForElement(enterDetailsContainer.addressLine1);
		enterDetailsContainer.addressLine1.isDisplayed();
	}
}
