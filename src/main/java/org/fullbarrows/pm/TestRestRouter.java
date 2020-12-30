package org.fullbarrows.pm;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class TestRestRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// @formatter:off
		restConfiguration()
			.component("servlet")
			.bindingMode(RestBindingMode.auto);
		rest().path("/test")
			.get()
				.outType(ResponseType.class)
				.to("bean:testBean");
	}

}
