package com.starkie.samples.bdd.views;

import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.BankDetailsContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class BankDetailsView extends AbstractView {
	
	private final BankDetailsContainer bankDetailsContainer;
	
	public BankDetailsView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		bankDetailsContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), BankDetailsContainer.class);
	}

	public void setAccountName(String accountName) {
		bankDetailsContainer.accountName.clear();
		bankDetailsContainer.accountName.sendKeys(accountName);
	}

	public void setSortCode1(String sortCode1) {
		bankDetailsContainer.sortCode1.clear();
		bankDetailsContainer.sortCode1.sendKeys(sortCode1);
	}

	public void setSortCode2(String sortCode2) {
		bankDetailsContainer.sortCode2.clear();
		bankDetailsContainer.sortCode2.sendKeys(sortCode2);
	}
	
	public void setSortCode3(String sortCode3) {
		bankDetailsContainer.sortCode3.clear();
		bankDetailsContainer.sortCode3.sendKeys(sortCode3);
	}

	public void setAccountNumber(String accountNumber) {
		bankDetailsContainer.accountNumber.clear();
		bankDetailsContainer.accountNumber.sendKeys(accountNumber);
	}

	public void setDDAuthority(boolean ddAuthority) {
		if (ddAuthority && !bankDetailsContainer.ddAuthority.isSelected()){
			bankDetailsContainer.ddAuthority.click();
		} else if (!ddAuthority && bankDetailsContainer.ddAuthority.isSelected()) {
			bankDetailsContainer.ddAuthority.click();
		}
	}

	public void clickContinueButton() {
		bankDetailsContainer.continueButton.click();
	}
	
	public void setValidInputAndContinue(String accountName, String sortCode1, String sortCode2, String sortCode3, String accountNumber, boolean ddAuthority) {
		setAccountName(accountName);
		setSortCode1(sortCode1);
		setSortCode2(sortCode2);
		setSortCode3(sortCode3);
		setAccountNumber(accountNumber);
		setDDAuthority(ddAuthority);
		clickContinueButton();
	}
	
	public void isDisplayedCheck() {
		browserDriver.waitForElement(bankDetailsContainer.accountName);
		bankDetailsContainer.accountName.isDisplayed();
	}
}