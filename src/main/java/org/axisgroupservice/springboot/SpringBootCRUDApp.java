package org.axisgroupservice.springboot;

import org.apache.log4j.Logger;
import org.axisgroupservice.springboot.configuration.CORSFilter;
import org.axisgroupservice.springboot.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"org.axisgroupservice.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp extends SpringBootServletInitializer {
	
	private static final Logger logger= Logger.getLogger(SpringBootCRUDApp.class);

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
	
	
	 @Bean
	    public FilterRegistrationBean corsFilterRegistration() {
	        FilterRegistrationBean registrationBean =
	                new FilterRegistrationBean(new CORSFilter());
	        registrationBean.setName("CORS Filter");
	        registrationBean.addUrlPatterns("/*");
	        registrationBean.setOrder(1);
	        return registrationBean;
	    }
	 
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootCRUDApp.class);
	    }


	
	  
}
