package com.grasswort.giggle.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@EnableWebFluxSecurity
@SpringBootApplication
public class GiggleWebfluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiggleWebfluxDemoApplication.class, args);
	}

}
