package com.starkie.samples.bdd.views;

import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.TestResultsContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class TestResultsView extends AbstractView {

	private final TestResultsContainer testResultsContainer;
	
	public TestResultsView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		testResultsContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), TestResultsContainer.class);
	}
	
	public void isDisplayedCheck() {
		browserDriver.waitForElement(testResultsContainer.viewStateLabel);
		testResultsContainer.viewStateLabel.isDisplayed();
	}
	
	public String getMessageCode() {
		return testResultsContainer.messageCodeLabel.getText();
	}
	
	public String getResponseCode() {
		return testResultsContainer.responseCodeLabel.getText();
	}
}
