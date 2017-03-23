package com.starkie.samples.bdd.views;

import com.starkie.samples.bdd.utils.BrowserDriver;

public abstract class AbstractView {

	protected BrowserDriver browserDriver;
	
	public AbstractView(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;
	}
}