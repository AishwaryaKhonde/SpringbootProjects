package com.th.service;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Profile("dev")
public class CustomerServiceDev {
	private static final Log LOGGER=LogFactory.getLog(CustomerServiceDev.class);

	public CustomerServiceDev() {
		LOGGER.info("CustomerServiceDev initialized");
		// TODO Auto-generated constructor stub
	}
	

}
