package com.cice.gestioncarrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class GestionCarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCarritoApplication.class, args);
	}
}
