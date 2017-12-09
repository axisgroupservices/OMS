package org.axisgroupservice.springboot;

import org.apache.log4j.Logger;
import org.axisgroupservice.springboot.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"org.axisgroupservice.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {
	
	private static final Logger logger= Logger.getLogger(SpringBootCRUDApp.class);

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
