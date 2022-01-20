package com.th.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Profile("prod")
public class CustomerServiceProd {
	private static final Log LOGGER=LogFactory.getLog(CustomerServiceProd.class);

	public CustomerServiceProd() {
		LOGGER.info("CustomerServiceProd initialized");
		// TODO Auto-generated constructor stub
	}
	

}
