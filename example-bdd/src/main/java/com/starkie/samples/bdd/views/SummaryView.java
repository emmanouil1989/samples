package com.starkie.samples.bdd.views;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.SummaryContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class SummaryView extends AbstractView {
	
	private final SummaryContainer summaryContainer;
	
	public SummaryView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		summaryContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), SummaryContainer.class);
	}
	
	public void setup() {
		summaryContainer.setupButton.click();
	}

	public void back() {
		summaryContainer.backButton.click();
	}
	
	public void cancel() {
		summaryContainer.cancelLink.click();
	}

	public void changePaymentMethod() {
		summaryContainer.changePaymentMethodLink.click();
	}
	
	public void isDisplayedCheck() {
		browserDriver.waitForElement(summaryContainer.setupButton);
		Assert.assertTrue(browserDriver.getCurrentDriver().getPageSource().contains("A summary of what your payments will be"));
	}
}
