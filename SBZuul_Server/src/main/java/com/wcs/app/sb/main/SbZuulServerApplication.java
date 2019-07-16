package com.wcs.app.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SbZuulServerApplication {

	public static void main(String[] args) {
		System.out.println("Start Zuul");
		SpringApplication.run(SbZuulServerApplication.class, args);
		System.out.println("End Zuul");
	}

}
