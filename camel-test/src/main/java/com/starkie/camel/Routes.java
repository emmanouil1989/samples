package com.starkie.camel;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
 
@Component
public class Routes extends RouteBuilder {
	
	@Bean
    ServletRegistrationBean camelServlet() {
        ServletRegistrationBean mapping = new ServletRegistrationBean();
        mapping.setName("CamelServlet");
        mapping.setLoadOnStartup(1);
        mapping.setServlet(new CamelHttpTransportServlet());
        mapping.addUrlMappings("/camel/*");
        return mapping;
    }
	
	@Bean
	ActiveMQComponent activemq() {
		ActiveMQComponent mq = new ActiveMQComponent();
		mq.setBrokerURL("tcp://localhost:61616");
		return mq;
	}
 
    @Override
    public void configure() throws Exception {
		fileHandler();
		restHandler();
		jmsHandler();
		swaggerHandler();
    }

	private void jmsHandler() {
		from("file://C://temp//cameltest?move=.done")
			//.process("testProcessor")
			.log("Test2")
			.to("activemq:LukeQ1");
	}

	private void swaggerHandler() {
		restConfiguration()
			.bindingMode(RestBindingMode.json)
			.dataFormatProperty("prettyPrint", "true")
			.apiContextPath("/api-doc")
			.apiProperty("api.title", "User API")
			.apiProperty("api.version", "1.2.3")
			.apiProperty("cors", "true");
	}
	
	private void restHandler() {
		rest("/chat")
			.produces("text/plain")
			.get("hello")
			.to("direct:hello");
		from("direct:hello")
			.transform()
			.constant("Bye World!");
	}

	private void fileHandler() {
		from("file://C://temp//cameltest2?move=.done")
			.process("testProcessor")
			.log("Test log message")
			.to("log:com.mycompany.order")
			.to("mock:test");
	}
}