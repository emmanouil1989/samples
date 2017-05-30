package com.starkie.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class TestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		//System.out.println(exchange);
	    // String payload = exchange.getIn().getBody(String.class);
	    // System.out.println(payload);
	     exchange.getIn().setBody("Changed body");
	}

}