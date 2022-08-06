package com.reservaya.clientmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableEurekaClient
@SpringBootApplication
public class ClientMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMicroserviceApplication.class, args);
	}

}
