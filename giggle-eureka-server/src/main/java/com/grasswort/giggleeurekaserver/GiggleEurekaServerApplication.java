package com.grasswort.giggleeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GiggleEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiggleEurekaServerApplication.class, args);
	}

}
