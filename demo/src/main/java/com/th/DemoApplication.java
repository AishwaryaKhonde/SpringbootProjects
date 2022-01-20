package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.th.config.MsgProp;
import com.th.config.SpringConfig;
import com.th.model.CustomerRepo;
import com.th.model.WelcomeBean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	        ApplicationContext ctx = new AnnotationConfigApplicationContext(MsgProp.class);
	       // CustomerRepo w1 = ctx.getBean(CustomerRepo.class);
	       // WelcomeBean w13 = ctx.getBean(WelcomeBean.class);
	 
			/*
			 * w1.setName("c"); CustomerRepo w2 = ctx.getBean(CustomerRepo.class); // Here i
			 * am trying to get a bean and trying to map that bean to some other // class
			 * WelcomeBean t = (WelcomeBean) ctx.getBean("test"); w2.setName("d");
			 * System.out.print(w1 == w2); System.out.println(" " + w1.equals(w13));
			 */
	        
	        Environment environment = ctx.getEnvironment();
	    	System.out.println(environment.getProperty("fruit"));



	    	//LOGGER.info(environment.getProperty("test"));
	}

}
