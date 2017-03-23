package com.starkie.samples.bdd.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.views.BankDetailsView;
import com.starkie.samples.bdd.views.DoneView;
import com.starkie.samples.bdd.views.EnterDetailsView;
import com.starkie.samples.bdd.views.SummaryView;
import com.starkie.samples.bdd.views.TestHarnessView;
import com.starkie.samples.bdd.views.TestResultsView;

@Component
public class Navigation {
	
	@Autowired
	protected BrowserDriver browserDriver;
	
	@Autowired
	protected BankDetailsView bankDetailsView;
	
	@Autowired
	protected DoneView doneView;
	
	@Autowired
	protected SummaryView summaryView;
	
	@Autowired
	protected EnterDetailsView enterDetailsView;
	
	@Autowired
	protected TestHarnessView testHarnessView;
	
	@Autowired
	protected TestResultsView testResultsView;

	public void loadTestHarnessPage(){
		browserDriver.loadStartingPage();
		testHarnessView.isDisplayedCheck();
	}
	
	public void submitTestHarnessPage() {
		testHarnessView.submitValidRequest();
	}
	
	public void theEnterDetailsScreenIsShown() {
		enterDetailsView.isDisplayedCheck();
	}
	
	public void enterUserDetails() {
		enterDetailsView.setFirstName("John");
		enterDetailsView.setLastName("Doe");
		enterDetailsView.setHouseNumber("1");
		enterDetailsView.setPostCode("CF11 1QW");
		enterDetailsView.setAddressLine1("1 A Street");
		enterDetailsView.setEmail1("x@y.com");
		enterDetailsView.setEmail2("x@y.com");
		enterDetailsView.setDobDay("01");
		enterDetailsView.setDobMonth("01");
		enterDetailsView.setDobYear("1979");
	}
	
	public void enterIncompleteUserDetails() {
		assertFalse(enterDetailsView.isEmailError());
		enterDetailsView.setFirstName("John");
		enterDetailsView.setLastName("Doe");
		enterDetailsView.setHouseNumber("1");
		enterDetailsView.setPostCode("CF11 1QW");
		enterDetailsView.setAddressLine1("1 A Street");
		enterDetailsView.setDobDay("01");
		enterDetailsView.setDobMonth("01");
		enterDetailsView.setDobYear("1979");
	}
	
	public void whenIContinueOnEnterDetailsPage() {
		enterDetailsView.clickContinueButton();
	}

	public void whenIFindMyAddress() {
		assertTrue(StringUtils.isEmpty(enterDetailsView.getAddressLine2()));
		enterDetailsView.clickFindMyAddressButton();
	}

	public void thenMyAddressIsPopulated() {
		assertTrue(StringUtils.isNotEmpty(enterDetailsView.getAddressLine2()));
	}
	
	public void theBankScreenIsShown() {
		bankDetailsView.isDisplayedCheck();
	}
	
	public void whenIContinueOnBankPage() {
		bankDetailsView.clickContinueButton();
	}
	
	public void errorMessageShown(String error) {
		switch (error) {
			case "email":
				assertTrue(enterDetailsView.isEmailError());
				break;
		}
	}

	public void personalDetailsHaveBeenEntered() {
		loadTestHarnessPage();
		submitTestHarnessPage();
		theEnterDetailsScreenIsShown();
		enterUserDetails();
		whenIContinueOnEnterDetailsPage();
	}

	public void thePaymentScreenIsShown() {
		summaryView.isDisplayedCheck();
	}

	public void enterValidBankDetails() {
		bankDetailsView.setAccountName("John Doe");
		bankDetailsView.setSortCode1("10");
		bankDetailsView.setSortCode2("20");
		bankDetailsView.setSortCode3("30");
		bankDetailsView.setAccountNumber("12345678");
		bankDetailsView.setDDAuthority(true);
	}

	public void bankDetailsHaveBeenEntered() {
		personalDetailsHaveBeenEntered();
		enterValidBankDetails();
		whenIContinueOnBankPage();
		thePaymentScreenIsShown();
	}
	
	public void whenISubmitPaymentSummary() {
		summaryView.setup();
	}

	public void whenIBackPaymentSummary() {
		summaryView.back();
	}

	public void whenICancelPaymentSummary() {
		summaryView.cancel();
	}

	public void whenIChangePaymentMethodPaymentSummary() {
		summaryView.changePaymentMethod();
	}

	public void theDoneScreenIsShown() {
		doneView.isDisplayedCheck();
	}

	public void theTestResultsScreenIsShown() {
		testResultsView.isDisplayedCheck();
	}

	public void cancellationResponse() {
		assertEquals("1000", testResultsView.getMessageCode());
		assertEquals("1", testResultsView.getResponseCode());
	}
	
	public void changePaymenyMethodResponse() {
		assertEquals("1500", testResultsView.getMessageCode());
		assertEquals("1", testResultsView.getResponseCode());
	}

	public void paymentProcessCompleted() {
		bankDetailsHaveBeenEntered();
		whenISubmitPaymentSummary();
		theDoneScreenIsShown();
	}
	
	public void whenIFinish() {
		doneView.finish();
	}
	
	public void whenIFinishBottom() {
		doneView.finish2();
	}
	
	public void messageCode(String messageCode) {
		assertEquals(messageCode, testResultsView.getMessageCode());
	}
	
	public void responseCode(String responseCode) {
		assertEquals(responseCode, testResultsView.getResponseCode());
	}
}