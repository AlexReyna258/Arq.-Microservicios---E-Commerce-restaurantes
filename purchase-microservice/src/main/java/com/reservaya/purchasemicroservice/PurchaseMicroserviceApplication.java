package com.reservaya.purchasemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PurchaseMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseMicroserviceApplication.class, args);
	}

}
