package com.th.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.th.model.CustomerRepo;
import com.th.model.WelcomeBean;

@Configuration
public class SpringConfig {
	@Bean(value = "test")
    public WelcomeBean welcomeBean() {
        return new WelcomeBean();
    }
 
    @Bean
    public CustomerRepo customerRepo() {
        return new CustomerRepo();
    }
	
	
	
}
