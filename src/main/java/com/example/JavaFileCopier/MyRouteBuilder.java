package com.example.JavaFileCopier;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:F:/data/transformBean/input?noop=true").bean(new MyBean())
		.to("file:F:/data/transformBean/output?fileName=${header.CamelFileName}-out.csv");
	}
}
