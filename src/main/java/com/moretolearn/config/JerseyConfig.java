package com.moretolearn.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import com.moretolearn.controller.JerseyController;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
		register(JerseyController.class);
	}
	
}
