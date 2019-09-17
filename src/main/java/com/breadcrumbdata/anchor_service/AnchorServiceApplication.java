package com.breadcrumbdata.anchor_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
@EnableFeignClients
public class AnchorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnchorServiceApplication.class, args);
	}

}
