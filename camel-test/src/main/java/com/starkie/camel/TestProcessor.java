package com.starkie.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class TestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
	     exchange.getIn().setBody("Changed body");
	}

}