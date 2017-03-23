package com.starkie.samples.bdd.views;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starkie.samples.bdd.containers.DoneContainer;
import com.starkie.samples.bdd.utils.BrowserDriver;

@Component
public class DoneView extends AbstractView {

	private final DoneContainer doneContainer;
	
	public DoneView(@Autowired BrowserDriver browserDriver) {
		super(browserDriver);
		doneContainer = PageFactory.initElements(browserDriver.getCurrentDriver(), DoneContainer.class);
	}
	
	public void finish() {
		doneContainer.finishButton.click();
	}
	
	public void finish2() {
		doneContainer.finishButtonBottom.click();
	}
	
	public void isDisplayedCheck() {
		browserDriver.waitForElement(doneContainer.finishButton);
		Assert.assertTrue(browserDriver.getCurrentDriver().getPageSource().contains("Your Direct Debit has been set up"));
	}
}