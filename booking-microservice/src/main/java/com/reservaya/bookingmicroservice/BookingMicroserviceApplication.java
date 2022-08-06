package com.reservaya.bookingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableEurekaClient
@SpringBootApplication
public class BookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroserviceApplication.class, args);
	}



}
