package com.grasswort.giggleorderservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.grasswort.giggleorderservice.dao")
@SpringBootApplication
public class GiggleOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiggleOrderServiceApplication.class, args);
	}

}
