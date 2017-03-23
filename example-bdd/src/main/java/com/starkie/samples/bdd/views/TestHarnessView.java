package com.starkie.samples.bdd.views;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.TestHarnessContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class TestHarnessView extends AbstractView {

	private final TestHarnessContainer testHarnessContainer;
	
	public TestHarnessView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		testHarnessContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), TestHarnessContainer.class);
	}
	
	public String getCurrentDateInYYYY_MM_DD() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(Calendar.getInstance().getTime());
	}

	public void submitValidRequest() {
		init("transactionID", 120, createRandomVRM(), 12, "S", getCurrentDateInYYYY_MM_DD(), "en", "viewState", true);
	}
	
	private String createRandomVRM() {
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		return sb.toString();
	}
	
	private void init(String transactionID, double payment, String vrm, int term, String paymentType, String effectiveDate, 
							String languageCode, String viewState, boolean tAndCAccepted) {

		testHarnessContainer.transactionIDInput.clear();
		testHarnessContainer.transactionIDInput.sendKeys(transactionID);
		
		testHarnessContainer.paymentInput.clear();
		testHarnessContainer.paymentInput.sendKeys(String.valueOf(payment));
		
		testHarnessContainer.vrmInput.clear();
		testHarnessContainer.vrmInput.sendKeys(vrm);
		
		testHarnessContainer.termInput.sendKeys(String.valueOf(term));
		
		testHarnessContainer.paymentTypeInput.sendKeys(paymentType);

		testHarnessContainer.effectiveDateInput.clear();
		testHarnessContainer.effectiveDateInput.sendKeys(effectiveDate);
		
		testHarnessContainer.languageCodeInput.sendKeys(languageCode);
		
		testHarnessContainer.viewStateInput.clear();
		testHarnessContainer.viewStateInput.sendKeys(viewState);
		
		testHarnessContainer.confirmationTermsandConditionsInput.sendKeys(tAndCAccepted ? "Y" : "N");
		
		testHarnessContainer.goButton.click();
	}

	public void isDisplayedCheck() {
		browserDriver.waitForElement(testHarnessContainer.transactionIDInput);
		testHarnessContainer.transactionIDInput.isDisplayed();
	}
}
