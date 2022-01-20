package com.th.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Profile("test")
public class CustomerServiceTest {
	private static final Log LOGGER=LogFactory.getLog(CustomerServiceTest.class);

	public CustomerServiceTest() {
		LOGGER.info("CustomerServiceTest initialized");
		// TODO Auto-generated constructor stub
	}
	

}
