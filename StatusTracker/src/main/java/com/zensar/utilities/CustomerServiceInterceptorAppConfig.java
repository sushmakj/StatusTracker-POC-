package com.zensar.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class CustomerServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
	   @Autowired
	   CustomerServiceInterceptor customerServiceInterceptor;

	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(customerServiceInterceptor);
	   }
	}