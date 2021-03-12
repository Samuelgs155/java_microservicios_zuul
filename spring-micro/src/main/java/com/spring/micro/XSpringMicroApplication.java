package com.spring.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XSpringMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(XSpringMicroApplication.class, args);
	}

}
